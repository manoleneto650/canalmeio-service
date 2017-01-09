package com.crawler.canalmeio.model;

public class News {

	private String dataPublicacao;
	
	private String titulo;
	
	private String link;
	
	private String conteudo;
	
	private String miniConteudo;
	

	public News(){
		
	}
	
	public News(String dataPublicacao, String titulo, String link, String conteudo, String miniConteudo) {
		super();
		this.dataPublicacao = dataPublicacao;
		this.titulo = titulo;
		this.link = link;
		this.conteudo = conteudo;
		this.miniConteudo = miniConteudo;
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

	public String getMiniConteudo() {
		return miniConteudo;
	}

	public void setMiniConteudo(String miniConteudo) {
		this.miniConteudo = miniConteudo;
	}
	
	
}
