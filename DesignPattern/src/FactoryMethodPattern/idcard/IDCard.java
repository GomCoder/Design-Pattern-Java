package FactoryMethodPattern.idcard;

import FactoryMethodPattern.framework.Product;

public class IDCard extends Product{
	private String owner;
	
	IDCard(String owner) {
		System.out.println(owner + "�� ī�带 ����ϴ�.");
		this.owner = owner;
	}
	
	
	@Override
	public void use() {
		System.out.println(this + "�� ����մϴ�.");	
	}
	
	@Override
	public String toString() {
		return "[IDCard:" + owner +"]";
	}
	
	public String getOwner() {
		return owner;
	}
}
