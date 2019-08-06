package create.builder.demo1;

public class AngelBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("��ʹ");
	}

	@Override
	public void buildSex() {
		actor.setSex("Ů");
	}

	@Override
	public void buildFace() {
		actor.setFace("Ư��");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("��ȹ");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("���糤��");
	}

}