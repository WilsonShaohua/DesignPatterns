package create.prototype.demo2.shallow;

//������
public class Attachment {
	private String name;
	public void download() {
		System.out.println("���ظ������ļ���Ϊ��"  + name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
