package create.builder.demo1;

public class Client {
	public static void main(String[] args) {
		ActorBuilder builder;
		builder = (ActorBuilder)XMLUtil.getBean();
		ActorController controller = new ActorController();
		Actor actor;
		actor = controller.construct(builder);		
		System.out.println(actor.getType() + "�������");
		System.out.println("�Ա�" + actor.getSex());
		System.out.println("���ݣ�" + actor.getFace());
		System.out.println("��װ��" + actor.getCostume());
		System.out.println("���ͣ�" + actor.getHairstyle());
	}
}
