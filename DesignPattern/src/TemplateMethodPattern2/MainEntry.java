package TemplateMethodPattern2;

import java.util.ArrayList;

public class MainEntry {
	public static void main(String[] args) {
		String title = "������ ����";
		
		ArrayList<String> content = new ArrayList<>();
		content.add("������ ������ Ŭ���� ���� ȿ�����̰� ����ȭ�� ���踦 �����ϴ� ���Դϴ�.");
		content.add("�� ������ �ܿ�� ���� �����ϴ� ���� �߿��մϴ�.");
		content.add("�پ��� ������ ���ϰ� �ݺ������� �����Ҽ���");
		content.add("�� ������ ���Ͽ� ���� ������ ���� �о��� ���Դϴ�.");
		
		String footer = "2023.01.30 ������ �ۼ�";
		
		//Article Ŭ�������� �ν��Ͻ� ����
		Article article = new Article(title, content, footer);
		
		//SimpleDisplayArticle Ŭ������ �̿��� ���
		System.out.println("[CASE-1]");
		DisplayArticleTemplate style1 = new SimpleDisplayArticle(article);
		style1.display();
		
		System.out.println();
		
		//CaptionDisplayArticle Ŭ������ �̿��� ���
		System.out.println("[CASE-2]");
		DisplayArticleTemplate style2 = new CaptionDisplayArticle(article);
		style2.display();		
	}
}
