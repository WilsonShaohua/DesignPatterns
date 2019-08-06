package behavioral.memento.demo2;

import java.util.ArrayList;

import behavioral.memento.demo1.ChessmanMemento;

public class MementoCaretaker {
	private ArrayList mementoList = new ArrayList();

	public ChessmanMemento getMemento(int i) {
		return (ChessmanMemento)mementoList.get(i);
	}

	public void setMemento(ChessmanMemento memento) {
		mementoList.add(memento);
	}
	
}
