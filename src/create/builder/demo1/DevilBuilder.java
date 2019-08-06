package create.builder.demo1;

public class DevilBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("¶ñÄ§");
	}

	@Override
	public void buildSex() {
		actor.setSex("ÄĞ");
	}

	@Override
	public void buildFace() {
		actor.setFace("³óÂª");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("ºÚÒÂ");
	}

	@Override
	public void buildHairstyle() {
		actor.setFace("¹âÍ·");
	}

}
