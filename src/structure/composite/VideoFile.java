package structure.composite;

public class VideoFile extends AbstractFile {
	private String name;
	public VideoFile(String name) {
		this.name = name;
	}
	@Override
	public void add(AbstractFile file) {
		System.out.println("�Բ��𣬲�֧�ָ÷�����");
	}

	@Override
	public void remove(AbstractFile file) {
		System.out.println("�Բ��𣬲�֧�ָ÷�����");
	}

	@Override
	public AbstractFile getChild(int location) {
		System.out.println("�Բ��𣬲�֧�ָ÷�����");
		return null;
	}

	@Override
	public void killVirus() {
		System.out.println("----����Ƶ�ļ���" + name + "������ɱ��");
	}

}
