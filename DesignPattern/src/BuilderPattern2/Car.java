package BuilderPattern2;

public class Car {
	private String engine;//엔진
	private boolean airbag; //에어백 여부
	private String color; //차량 색상
	private boolean cameraSensor; //카메라 센서 유무
	private Boolean AEB; //자동급 제동장치 유무
	
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
