package br.com.alura.forum.DTO;

import java.time.LocalDateTime;


import br.com.alura.forum.modelo.Resposta;

public class RespostaDTO {
	
	private Long id;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAutor;
	
	public RespostaDTO(Resposta r) {
		super();
		this.id = r.getId();
		this.mensagem = r.getMensagem();
		this.dataCriacao = r.getDataCriacao();
		this.nomeAutor = r.getMensagem();
	}

	public Long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}



}
