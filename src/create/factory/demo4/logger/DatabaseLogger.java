package create.factory.demo4.logger;

public class DatabaseLogger implements Logger {
	@Override
	public void writeLog() {
		System.out.println("数据库记录日志");
	}
}
