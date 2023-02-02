package AbstractFactoryPattern;

import AbstractFactoryPattern.factory.*;

public class MaIn {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Usage: java Main filename.html class.name.of.ConcreteFactory");
			System.out.println("Example 1: java Main List.html listfactory.ListFactory");
			System.out.println("Example 2: java Main div.html divfactory.DivFactory");
			System.exit(0);
		}
		
		String filename = args[0];
		String classname = args[1];
		
		Factory factory = Factory.getFactory(classname);
		
		//Blog
		Link blog1 = factory.createLink("Blog 1", "http://example.com/blog1");
		Link blog2 = factory.createLink("Blog 2", "http://example.com/blog2");
		Link blog3 = factory.createLink("Blog 3", "http://example.com/blog3");
		
		Tray blogTray = factory.createTray("Blog Site");
		blogTray.add(blog1);
		blogTray.add(blog2);
		blogTray.add(blog3);
		
		//News
		Link news1 = factory.createLink("News 1", "http://example.com/news1");
		Link news2 = factory.createLink("News 2", "http://example.com/news2");
		Tray news3 = factory.createTray("News 3");
		news3.add(factory.createLink("New 3 (US)", "http://example.com/news3us"));
		news3.add(factory.createLink("New 3 (Korea)", "http://example.com/news3kr"));
		
		
		Tray newsTray = factory.createTray("News Site");
		newsTray.add(news1);
		newsTray.add(news2);
		newsTray.add(news3);
				
		
		//Page
		Page page = factory.createPage("Blog and News", "Youngjin.com");
		page.add(blogTray);
		page.add(newsTray);
		page.output(filename);		
	}
}
