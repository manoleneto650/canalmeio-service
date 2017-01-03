package com.crawler.canalmeio.model;

public class News {

	private String dataPublicacao;
	
	private String titulo;
	
	private String link;
	
	private String conteudo;
	

	public News(){
		
	}
	
	public News(String dataPublicacao, String titulo, String link) {
		super();
		this.dataPublicacao = dataPublicacao;
		this.titulo = titulo;
		this.link = link;
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
}
