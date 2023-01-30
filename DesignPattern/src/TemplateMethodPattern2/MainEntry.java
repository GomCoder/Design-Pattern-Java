package TemplateMethodPattern2;

import java.util.ArrayList;

public class MainEntry {
	public static void main(String[] args) {
		String title = "디자인 패턴";
		
		ArrayList<String> content = new ArrayList<>();
		content.add("디자인 패턴은 클래스 간의 효율적이고 최적화된 관계를 설계하는 것입니다.");
		content.add("각 패턴을 외우기 보가 이해하는 것이 중요합니다.");
		content.add("다양한 패턴을 접하고 반복적으로 이해할수록");
		content.add("각 디자인 패턴에 대한 응용의 폭이 넓어질 것입니다.");
		
		String footer = "2023.01.30 윌요일 작성";
		
		//Article 클래스ㅏ의 인스턴스 생성
		Article article = new Article(title, content, footer);
		
		//SimpleDisplayArticle 클래스를 이용한 출력
		System.out.println("[CASE-1]");
		DisplayArticleTemplate style1 = new SimpleDisplayArticle(article);
		style1.display();
		
		System.out.println();
		
		//CaptionDisplayArticle 클래스를 이용한 출력
		System.out.println("[CASE-2]");
		DisplayArticleTemplate style2 = new CaptionDisplayArticle(article);
		style2.display();		
	}
}
