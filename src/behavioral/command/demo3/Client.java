package behavioral.command.demo3;

public class Client {

	public static void main(String[] args) {
		ConfigSettingWindow csw = new ConfigSettingWindow(); //������������
		Command command; //�����������
		ConfigOperator co = new ConfigOperator(); //�������������
		
        //�Ĵζ������ļ��ĸ���
		command = new InsertCommand("����");
		command.setConfigOperator(co);
		csw.setCommand(command);
		csw.call("��վ��ҳ");
		
		command = new InsertCommand("����");
		command.setConfigOperator(co);
		csw.setCommand(command);
		csw.call("�˿ں�");
		
		command = new ModifyCommand("�޸�");
		command.setConfigOperator(co);
		csw.setCommand(command);
		csw.call("��վ��ҳ");
		
		command = new ModifyCommand("�޸�");
		command.setConfigOperator(co);
		csw.setCommand(command);		
		csw.call("�˿ں�");
		
		System.out.println("----------------------------");
		System.out.println("��������");
		csw.save();
			
		System.out.println("----------------------------");	
		System.out.println("�ָ�����");
		System.out.println("----------------------------");	
		csw.recover();	
	}

}
