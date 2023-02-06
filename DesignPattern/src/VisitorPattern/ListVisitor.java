package VisitorPattern;

public class ListVisitor extends Visitor{
	//현재 주목하는 디렉터리 이름
	private String currentDir = "";
	
	//File 방문시
	@Override
	public void visit(File file) {
		System.out.println(currentDir + "/" + file);
	}
	
	//Directory 방문시
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
