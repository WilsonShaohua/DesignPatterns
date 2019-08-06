package create.factory.demo5.logger_xml;

import create.factory.demo4.logger.Logger;
import create.factory.demo4.logger.LoggerFactory;
/*
 *  ß∞‹£¨ø’÷∏’Î“Ï≥£ 
 */
public class Client {
	public static void main(String args[]) {
		LoggerFactory factory;
		Logger logger;
		factory = (LoggerFactory) XMLUtil.getBean();
		logger = factory.createLogger();
		logger.writeLog();
	}
}