package structure.flyweight.igo_chessman;

import java.util.Hashtable;

public class IgoChessmanFactory {
	private static IgoChessmanFactory instance = new IgoChessmanFactory();
	private static Hashtable hashTable;
	
	private IgoChessmanFactory() {
		hashTable = new Hashtable();
		IgoChessman black,white;
		black = new BlackIgoChessman();
		white = new WhiteIgoChessman();
		hashTable.put("black", black);
		hashTable.put("white", white);
	}
	
	
	public static IgoChessmanFactory getInstance() {
		return instance;
	}
	
	public static IgoChessman getIgoChessman(String color) {
		return (IgoChessman)hashTable.get(color);
	}
}
