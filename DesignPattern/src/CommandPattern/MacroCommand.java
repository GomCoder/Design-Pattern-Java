package CommandPattern;

import java.util.ArrayDeque;
import java.util.Deque;

public class MacroCommand implements Command{
	//����� �迭
	private Deque<Command> commands = new ArrayDeque<>();

	//����
	@Override
	public void execute() {
		for(Command cmd: commands) {
			cmd.execute();
		}
	}
	
	//�߰�
	public void append(Command cmd) {
		if(cmd == this) {
			throw new IllegalArgumentException("infiite loop cause by append");
		}
		commands.push(cmd);
	}
	
	//������ ����� ����
	public void undo() {
		if(!commands.isEmpty()) {
			commands.pop();
		}
	}
	
	//���� ����
	public void clear() {
		commands.clear();
	}
}
