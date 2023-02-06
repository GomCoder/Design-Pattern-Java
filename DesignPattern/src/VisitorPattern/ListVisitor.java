package VisitorPattern;

public class ListVisitor extends Visitor{
	//���� �ָ��ϴ� ���͸� �̸�
	private String currentDir = "";
	
	//File �湮��
	@Override
	public void visit(File file) {
		System.out.println(currentDir + "/" + file);
	}
	
	//Directory �湮��
	@Override
	public void visit(Directory directory) {
		System.out.println(currentDir + "/" + directory);
		String saveDir = currentDir;
		currentDir = currentDir + "/" + directory.getName();
		
		for(Entry entry: directory) {
			entry.accept(this);
		}
		
		currentDir = saveDir;
	}

}
