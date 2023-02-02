package AbstractFactoryPattern2;

public class MainEntry {

	public static void main(String[] args) {
		ComponentFactory factory = new LinuxFactory();
		
		Button button = factory.createButton("Ȯ��");
		CheckBox checkBox = factory.createCheckBox(false);
		TextEdit textEdit  = factory.createTextEdit("����������");
		
		button.render();
		checkBox.render();
		textEdit.render();
		
		button.clickEvent();
		checkBox.setChecked(true);
		textEdit.setValue("GoF�� ����������");
		
	}
}
