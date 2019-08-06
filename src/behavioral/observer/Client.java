package behavioral.observer;

public class Client {

	public static void main(String[] args) {
		AllyControlCenter allyControlCenter = new ConcreteAllyControlCenter("��ӹȺ��");
		Observer player1,player2,player3,player4;
		
		player1 = new Player("���");
		allyControlCenter.join(player1);
		
		player2 = new Player("�����");
		allyControlCenter.join(player2);
		
		player3 = new Player("���޼�");
		allyControlCenter.join(player3);
		
		player4 = new Player("����");
		allyControlCenter.join(player4);
		
		player1.beAttacked(allyControlCenter);
				
	}

}
