package behavioral.memento.demo1;

import java.util.ArrayList;

import behavioral.memento.demo1.ChessmanMemento;

public class MementoCaretaker {
	private ChessmanMemento memento;

	public ChessmanMemento getMemento() {
		return memento;
	}

	public void setMemento(ChessmanMemento memento) {
		this.memento = memento;
	}
	
}
