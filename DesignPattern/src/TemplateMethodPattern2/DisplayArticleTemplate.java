package TemplateMethodPattern2;

public abstract class DisplayArticleTemplate {
	protected Article article;
	
	public DisplayArticleTemplate(Article article) {
		this.article = article;
	}
	
	//Template 추상 메서드들 -> 파생 클래스에서 변경 불가능
	public final void display() {
		title();
		content();
		footer();
	}

	protected abstract void footer();
	protected abstract void content();
	protected abstract void title();
	
}
