package TemplateMethodPattern2;

import java.util.ArrayList;

public class Article {
	
	private String title; //Á¦¸ñ
	private ArrayList<String> content; //³»¿ë
	private String footer; //¹Ø¹Ù´Ú ±Û
	
	public Article(String title, ArrayList<String> content, String footer) {
		this.title = title;
		this.content = content;
		this.footer = footer;
	}

	public String getTitle() {
		return title;
	}

	public ArrayList<String> getContent() {
		return content;
	}

	public String getFooter() {
		return this.footer;
	}
	
	
}
