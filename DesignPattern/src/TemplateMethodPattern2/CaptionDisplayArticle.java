package TemplateMethodPattern2;

import java.util.ArrayList;

public class CaptionDisplayArticle extends DisplayArticleTemplate{

	public CaptionDisplayArticle(Article aticle) {
		super(aticle);
	}
	
	@Override
	protected void title() {
		System.out.println("TITLE : " + article.getTitle());
	}

	
	@Override
	protected void content() {
		System.out.println("CONTENT: ");
		
		ArrayList<String> content = article.getContent();
		int countLines = content.size();
		
		for(int i = 0; i < countLines; i++) {
			System.out.println("    " + content.get(i));
		}				
	}
	
	@Override
	protected void footer() {
		System.out.println("FOOTER : " + article.getFooter());
	}


	
	

}
