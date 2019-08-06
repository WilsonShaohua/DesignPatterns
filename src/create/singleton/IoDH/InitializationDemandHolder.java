package create.singleton.IoDH;
/*
 * ��̬�ڲ���ʵ�ֵ���ģʽ
 * ϵͳ������ʱ��ʵ�������󣬼���ʱʵ��������
 * ʵ���ӳټ��ء���֤�̰߳�ȫ����Ӱ��ϵͳ���ܵĵ���ģʽ
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
