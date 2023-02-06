package VisitorPattern2;

import java.util.ArrayList;
import java.util.Iterator;

import VisitorPattern2.Visitor;

public class ItemList implements Unit{
	private ArrayList<Unit> list = new ArrayList<>();
	
	public void add(Unit unit) {
		list.add(unit);
	}

	@Override
	public void accept(Visitor visitor) {
		Iterator<Unit> iter = list.iterator();
		
		while(iter.hasNext()) {
			Unit unit = iter.next();
			visitor.visit(unit);
		}
	}
	
	
}
