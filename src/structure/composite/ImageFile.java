package structure.composite;

public class ImageFile extends AbstractFile {
	private String name;
	public ImageFile(String name) {
		this.name = name;
	}
	
	@Override
	public void add(AbstractFile file) {
		System.out.println("�Բ��𣬲�֧�ָ÷�����");
	}

	@Override
	public void remove(AbstractFile file) {
		System.out.println("�Բ��𣬲�֧�ָ÷���!");
	}

	@Override
	public AbstractFile getChild(int location) {
		System.out.println("�Բ��𣬲�֧�ָ÷�����");
		return null;
	}

	@Override
	public void killVirus() {
		System.out.println("----��ͼ���ļ���" + name + "������ɱ��");
	}
}
