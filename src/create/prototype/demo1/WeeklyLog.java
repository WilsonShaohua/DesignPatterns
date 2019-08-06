package create.prototype.demo1;
/**
 * 原型模式实现cloneable接口，并实现clone方法
 * @author 24346
 *
 */
public class WeeklyLog  implements Cloneable{
	private String name;
	private String date;
	private String content;
	public WeeklyLog() {
		// TODO Auto-generated constructor stub
	}

	public String getContent() {
		return content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setContent(String content) {
		this.content = content;
	}
	@Override
	protected Object clone()  {
		Object object = null;
		try {
			object = super.clone();
			return (WeeklyLog) object;
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}		
	}
}
