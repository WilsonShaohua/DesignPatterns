/**
 * ���¡���������ĽǶ�ʵ�ֶԶ���Ŀ�¡�������ɵĶ���������ԭ�����ֵ��ͬ���⣬����������ȫ��ͬ
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
		// ������д������
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		objectOutputStream.writeObject(this);
		// �����������ȡ��
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
