package PrototypePattern.framework;

import java.lang.Cloneable;

public interface Product extends Cloneable{
	//사용하기 위한 메서드 -> 하위 클래스에서 구현함
	public abstract void use(String s);
	//인스턴스를 복제하기 위한 메서드
	public abstract Product createCopy();
}
