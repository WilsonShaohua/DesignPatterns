package create.singleton.lazy;
/**
 * 懒汉模式
 * 在类加载是不自行实例化（延迟加载），在需要使用到类的实例时再行创建实例对象，并使用线程锁、双重检查锁定等方式避免类对象重复创建。
 * @author 24346
 *
 */
public class LazySingleton {
	private static LazySingleton instance = null;

	private LazySingleton() {

	}

	public static LazySingleton getInstance() {
		if (null == instance) {
			synchronized (LazySingleton.class) {
				if (null == instance) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
}
