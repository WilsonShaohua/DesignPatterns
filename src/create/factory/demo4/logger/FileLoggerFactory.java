package create.factory.demo4.logger;

public class FileLoggerFactory implements LoggerFactory {
	@Override
	public Logger createLogger() {
		Logger logger = new FileLogger();
		return logger;
	}
}
