package create.singleton.lazy;
/**
 * ����ģʽ
 * ��������ǲ�����ʵ�������ӳټ��أ�������Ҫʹ�õ����ʵ��ʱ���д���ʵ�����󣬲�ʹ���߳�����˫�ؼ�������ȷ�ʽ����������ظ�������
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
