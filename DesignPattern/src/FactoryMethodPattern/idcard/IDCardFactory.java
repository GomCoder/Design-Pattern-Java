package FactoryMethodPattern.idcard;

import FactoryMethodPattern.framework.Factory;
import FactoryMethodPattern.framework.Product;

public class IDCardFactory extends Factory{

	
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}
	
	@Override
	protected void registerProduct(Product product) {
		System.out.println(product + "�� ����߽��ϴ�.");
	}
}
