package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
	//�̹� ���� BigChar �ν��Ͻ��� ����
	private Map<String, BigChar> pool = new HashMap<>();
	
	//Singleton ����
	private static BigCharFactory singleton = new BigCharFactory();
	
	//������
	private BigCharFactory() {
		
	}
	
	//������ �ν��Ͻ��� ��´�
	public static BigCharFactory getInstance() {
		return singleton;
	}	
	
	//BigChar �ν��Ͻ� ����(����)
	public synchronized BigChar getBigChar(char charName) {
		BigChar bc = pool.get(String.valueOf(charName));
		
		if(bc == null) {
			//���⼭ BigChar �ν��Ͻ��� ����
			bc = new BigChar(charName);
			pool.put(String.valueOf(charName), bc);
		}
		return bc;
	}

}
