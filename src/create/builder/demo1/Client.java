package create.builder.demo1;

public class Client {
	public static void main(String[] args) {
		ActorBuilder builder;
		builder = (ActorBuilder)XMLUtil.getBean();
		ActorController controller = new ActorController();
		Actor actor;
		actor = controller.construct(builder);		
		System.out.println(actor.getType() + "的外观是");
		System.out.println("性别：" + actor.getSex());
		System.out.println("面容：" + actor.getFace());
		System.out.println("服装：" + actor.getCostume());
		System.out.println("发型：" + actor.getHairstyle());
	}
}
