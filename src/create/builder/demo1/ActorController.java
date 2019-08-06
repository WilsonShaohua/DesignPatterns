package create.builder.demo1;

public class ActorController {
	public Actor construct(ActorBuilder builder) {
		Actor actor;
		builder.buildType();
		builder.buildSex();
		builder.buildFace();
		builder.buildHairstyle();
		builder.buildCostume();
		actor = builder.createActor();
		return actor;
	}
}
