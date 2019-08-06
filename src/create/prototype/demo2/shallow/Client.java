package create.prototype.demo2.shallow;

public class Client {
	public static void main(String[] args) {
		WeeklyLog log_previous, log_new;
		log_previous = new WeeklyLog();
		Attachment attachment = new Attachment();
		log_previous.setAttachment(attachment);
		log_new = (WeeklyLog) log_previous.clone();
		System.out.println("�ܱ��Ƿ���ͬ��" + (log_previous == log_new));
		System.out.println("�����Ƿ���ͬ��" + (log_previous.getAttachment() == log_new.getAttachment()));
	}
}
