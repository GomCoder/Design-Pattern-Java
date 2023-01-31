package PrototypePattern2;

public class MainEntry {

	public static void main(String[] args) {
		Point pt1 = new Point();
		pt1.setX(0).setY(0);
		//System.out.println(pt1.draw());
		
		Point pt2 = new Point();
		pt2.setX(100).setY(0);
		//System.out.println(pt2.draw());
		
		//Line 按眉 积己
		Line line1 = new Line();
		line1.setStartPt(pt1);
		line1.setEndPt(pt2);
		//System.out.println(line1.draw());
		
		//copy Line 按眉 积己
		Line lineCopy = (Line)line1.copy();
		
		//荤阿屈 按眉 积己
		Point pt3 = new Point();
		pt3.setX(100).setY(100);
		
		Point pt4 = new Point();
		pt4.setX(0).setY(100);
		
		Line line2 = new Line();
		line2.setStartPt(pt2);
		line2.setEndPt(pt3);
		
		Line line3 = new Line();
		line3.setStartPt(pt3);
		line3.setEndPt(pt4);
		
		Line line4 = new Line();
		line4.setStartPt(pt4);
		line4.setEndPt(pt1);
		
		Group rect = new Group("RECT");
		rect.addShape(line1).addShape(line2).addShape(line3).addShape(line4);
		//System.out.println(rect.draw());
		
		Group cloneRect = (Group)rect.copy();
		cloneRect.moveOffset(100, 100);
		
		System.out.println(rect.draw());
		System.out.println(cloneRect.draw());
		
	}

}
