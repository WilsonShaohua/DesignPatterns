package create.singleton.eager;
/**
 * 饿汉模式
 * 在类加载时创建单例对象
 * @author 24346
 *
 */
public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
}
