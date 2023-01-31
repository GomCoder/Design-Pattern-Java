package BuilderPattern2;

public class Car {
	private String engine;//����
	private boolean airbag; //����� ����
	private String color; //���� ����
	private boolean cameraSensor; //ī�޶� ���� ����
	private Boolean AEB; //�ڵ��� ������ġ ����
	
	public Car(String engine, Boolean airbag, String color, Boolean cameraSonsor, Boolean AEB) {
		this.engine = engine;
		this.airbag = airbag;
		this.color = color;
		this.cameraSensor = cameraSensor;
		this.AEB = AEB;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("# CAR SPEC\n");
		sb.append(" CameraSensor " + (cameraSensor ? "Y" : "N") + "\n");
		sb.append("       Engine " + engine + "\n");
		sb.append("       Aribag " + (airbag ? "Y" : "N") + "\n");
		sb.append("       Color " + color + "\n");
		sb.append("       AEB " + (AEB ? "Y" : "N"));
		
		
		return sb.toString();		
	}
	
}
