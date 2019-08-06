package create.prototype.demo2.Deep;

import java.io.IOException;

public class Client {
	public static void main(String[] args) {
		WeeklyLog log_previous, log_new;
		log_previous = new WeeklyLog();
		Attachment attachment = new Attachment();
		log_previous.setAttachment(attachment);
		try {
			log_new = (WeeklyLog) log_previous.deepClone();
			System.out.println("�ܱ��Ƿ���ͬ��" + (log_previous == log_new));
			System.out.println("�����Ƿ���ͬ��" + (log_previous.getAttachment() == log_new.getAttachment()));
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			System.out.println("��¡ʧ��");
		}

	}
}
