package TemplateMethodPattern2;

import java.util.ArrayList;

public class SimpleDisplayArticle extends DisplayArticleTemplate{

	public SimpleDisplayArticle(Article aticle) {
		super(aticle);
	}


	@Override
	protected void title() {
		System.out.println(article.getTitle());
	}
	
	
	@Override
	protected void content() {
		ArrayList<String> content = article.getContent();
		
		int countLines = content.size();
		
		for(int i = 0; i < countLines; i++) {
			System.out.println(content.get(i));
		}
	}
	
	@Override
	protected void footer() {
		System.out.println(article.getFooter());
	}
	

}
