/**
 * 深克隆从数据流的角度实现对对象的克隆，新生成的对象则是与原对象除值相同以外，其它属性完全不同
 */

package create.prototype.demo2.Deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.sun.corba.se.impl.io.OptionalDataException;


public class WeeklyLog implements Serializable {
	private Attachment attachment;
	private String name;
	private String date;
	private String content;
	
	public WeeklyLog deepClone() throws IOException, ClassNotFoundException,OptionalDataException{
		// 将对象写入流中
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		objectOutputStream.writeObject(this);
		// 将对象从流中取出
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
		return (WeeklyLog) objectInputStream.readObject();
	}

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
