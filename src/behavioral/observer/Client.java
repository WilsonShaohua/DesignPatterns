package behavioral.observer;

public class Client {

	public static void main(String[] args) {
		AllyControlCenter allyControlCenter = new ConcreteAllyControlCenter("½ğÓ¹ÈºÏÀ");
		Observer player1,player2,player3,player4;
		
		player1 = new Player("Ñî¹ı");
		allyControlCenter.join(player1);
		
		player2 = new Player("Áîºü³å");
		allyControlCenter.join(player2);
		
		player3 = new Player("ÕÅÎŞ¼É");
		allyControlCenter.join(player3);
		
		player4 = new Player("¶ÎÓş");
		allyControlCenter.join(player4);
		
		player1.beAttacked(allyControlCenter);
				
	}

}
