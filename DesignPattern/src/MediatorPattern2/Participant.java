package MediatorPattern2;

public abstract class Participant {
	protected Mediator mediator;
	
	public Participant(Mediator mediator) {
		this.mediator = mediator;
	}
}
