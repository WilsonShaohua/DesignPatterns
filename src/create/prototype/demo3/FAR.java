package create.prototype.demo3;

public class FAR implements OfficialDocument {
	@Override
	public OfficialDocument clone() {
		OfficialDocument officialDocument = null;
		try {
			officialDocument = (OfficialDocument) super.clone();
		}catch(CloneNotSupportedException cloneNotSupportedException) {
			System.out.println("��֧�ָ���");
		}
		return officialDocument;
	}
	@Override
	public void display() {
		System.out.println("�������Է������桷");
	}
}
