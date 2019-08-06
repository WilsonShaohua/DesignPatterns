package create.prototype.demo2.shallow;
/*
 * 浅克隆中将原型对象复制一次，引用对象按地址克隆
 */
public class WeeklyLog implements Cloneable {
	private Attachment attachment;
	private String name;
	private String date;
	private String content;

	@Override
	protected Object clone() {
		Object object;
		try {
			object = super.clone();
			return (WeeklyLog) object;
		} catch (CloneNotSupportedException exception) {
			exception.printStackTrace();
			return null;
		}
	}
	
	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Attachment getAttachment() {
		return attachment;
	}
	public String getContent() {
		return content;
	}
	public String getDate() {
		return date;
	}
	public String getName() {
		return name;
	}
}
