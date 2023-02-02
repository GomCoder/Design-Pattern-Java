package AbstractFactoryPattern.listfactory;

import AbstractFactoryPattern.factory.Factory;
import AbstractFactoryPattern.factory.Link;
import AbstractFactoryPattern.factory.Page;
import AbstractFactoryPattern.factory.Tray;

public class ListFactory extends Factory{

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}
	
}
