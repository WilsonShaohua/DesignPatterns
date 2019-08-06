package create.factory.demo4.logger;

public class FileLogger implements Logger {
	@Override
	public void writeLog() {
		System.out.println("文件记录日志");
	}
}
