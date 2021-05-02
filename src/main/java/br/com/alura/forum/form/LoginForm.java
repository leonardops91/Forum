package br.com.alura.forum.form;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginForm {
	private String email;
	private String senha;
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getUsuario() {
		return email;
	}
	public void setUsuario(String usuario) {
		this.email = usuario;
	}
	public UsernamePasswordAuthenticationToken converter() {
		return new UsernamePasswordAuthenticationToken(email, senha);
	}
}
