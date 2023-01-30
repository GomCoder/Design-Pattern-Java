package TemplateMethodPattern2;

public abstract class DisplayArticleTemplate {
	protected Article article;
	
	public DisplayArticleTemplate(Article article) {
		this.article = article;
	}
	
	//Template �߻� �޼���� -> �Ļ� Ŭ�������� ���� �Ұ���
	public final void display() {
		title();
		content();
		footer();
	}

	protected abstract void footer();
	protected abstract void content();
	protected abstract void title();
	
}
