package PrototypePattern.framework;

import java.lang.Cloneable;

public interface Product extends Cloneable{
	//����ϱ� ���� �޼��� -> ���� Ŭ�������� ������
	public abstract void use(String s);
	//�ν��Ͻ��� �����ϱ� ���� �޼���
	public abstract Product createCopy();
}
