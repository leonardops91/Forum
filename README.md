
<div align="center">

# Fórum API

</div>

<div align="center">

[![NPM](https://img.shields.io/apm/l/vim-mode)](https://github.com/leonardops91/Forum/blob/master/LICENSE)

</div>

<p align="center">
 <a href="#-Descriçao">Visão Geral</a> •
 <a href="#-layout">Layout</a> •
 <a href="#-tecnologias">Tecnologias</a> •
 <a href="#-rodando">Rodando</a> •
 <a href="#-ferramentas">Ferramentas</a> •
  <a href="#-modelagem">Modelagem</a> •
 <a href="#-licença">Licença</a>
</p>

## 📋 Visão geral
#### Motivação
Este é um projeto para estudo, feito com Java, utilizando o Spring Boot.

A motivação foi aprender de forma prática os conceitos aplicados na engenharia de software, como padrão MVC, DTO, REPOSITORY, Orientação a objetos, monitoramento com Spring Actuator e Segurança de uma API com autenticação stateless.
Outro motivo foi o de praticar as tecnologias e frameworks voltadas ao Java como o Maven, Spring, Swagger, SpringFox.
#### Ideia do projeto?
<p>
Este é um projeto de uma API de um Fórum de perguntas e resposta, onde o usuário pode postar dúvidas para a comunidade e essa dúvida pode receber diversas respostas de outros usuários. Para postar dúvidas e respondê-las o usuário precisa estar autenticado.
</p>

## 🚀 **Tecnologias**

As seguintes ferramentas foram utilizadas na construção do projeto:
#### BackEnd:
- [Java 8](https://www.java.com/pt-BR/)
- [Spring Boot](https://spring.io/)
- [PostgreSQL](https://www.postgresql.org/)

## 💻 Rodando
Para clonar e utilizar esta API, você precisará do [Git](https://git-scm.com) e do [Npm](https://www.npmjs.com/) instalados no seu computador. Utilize a linha de comando:
```bash
# Clone this repository
$ git clone https://github.com/leonardops91/Forum
```
## Importe o projeto para o Eclipse
File -> import -> Existing Maven Projects -> (procure a pasta do projeto) -> finish

## Rodando a API server:
Dentro do <strong>Eclipse</strong> procure pela classe <Strong>Main</strong> do projeto</br>
Path: /forum/src/main/java/br/com/alura/forum/ForumApplication.java

Right click on class -> Run As -> Java Application

## Acessando os EndPoints

Acesse a seguinte rota no browser: http://localhost:8080/swagger-ui.html

Nessa página estará toda documentação necessaria para utilizar a API

## 🛠 Ferramentas

- [Spring Tools Suite 4](https://spring.io/tools) - IDE de desenvolvimento de aplicações Spring.
- [Postman](https://www.postman.com/) - documentação das requisições API REST.
- [Eclipse](https://www.eclipse.org/downloads/) - IDE de desenvolvimento geral.


## 🔗 Licença

Esse projeto é licenciado pelo MIT License - clique em [LICENSE.md](https://github.com/leonardops91/Forum/blob/master/LICENSE) para mais detalhes.


