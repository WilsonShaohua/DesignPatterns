package create.singleton.IoDH;
/*
 * 静态内部类实现单例模式
 * 系统加载类时不实例化对象，加载时实例化对象。
 * 实现延迟加载、保证线程安全、不影响系统性能的单例模式
 */
public class InitializationDemandHolder {
	
	private InitializationDemandHolder() {
		// TODO Auto-generated constructor stub
	}

	private static class HolderClass{
		private final static InitializationDemandHolder instance = new InitializationDemandHolder();
	}
	
	public static InitializationDemandHolder getInstance() {
		return HolderClass.instance;
	}
}
