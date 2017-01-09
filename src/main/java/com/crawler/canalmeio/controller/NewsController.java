package com.crawler.canalmeio.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crawler.canalmeio.model.News;

@RestController
public class NewsController {

	private final String URL_CANALMEIO = "http://www.canalmeio.com.br/arquivo/newsletter/";
	
	@RequestMapping("/news")
	public List<News> findAll(){
		return prepareListNews();
	}
	
	private List<News> prepareListNews(){
		
		List<News> retorno = new ArrayList<News>();
		
		try {
			Document doc = Jsoup.connect(URL_CANALMEIO).get();
			Elements posts = doc.select("article.category-newsletter");
			
			for (Element elemento : posts){
				News post = new News();
				
				String dataWrapper = elemento.select("article.category-newsletter li h4").text();
				String tituloWrapper = elemento.select("article.category-newsletter li h4").text();
				
				post.setDataPublicacao(dataWrapper.substring(0, dataWrapper.lastIndexOf("-")).trim());
				post.setTitulo(tituloWrapper.substring(tituloWrapper.indexOf("-") + 2, tituloWrapper.length()).trim());
				post.setLink(elemento.select("article.category-newsletter li a[href]").attr("href"));
				
				Document pageArticle = Jsoup.connect(post.getLink()).get();
				post.setMiniConteudo(pageArticle.select("section.post_content").text().substring(0, 200));
				post.setConteudo(pageArticle.select("section.post_content").html());
				
				
				retorno.add(post);
			}
			
			return retorno;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
