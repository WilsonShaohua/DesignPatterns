package structure.adapter;

public class Client {

	public static void main(String[] args) {
		ScoreOperation operation;
		operation = (ScoreOperation) XMLUtil.getBean();
		int scores[] = { 84, 76, 50, 69, 90, 91, 88, 96 };
		int result[];
		int score;

		System.out.println("�ɼ���������");
		result = operation.sort(scores);
		for (int i : scores) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("���ҳɼ� 90");
		score = operation.search(result, 90);
		if (score != -1) {
			System.out.println("�ҵ��ɼ�90��");
		} else {
			System.out.println("û���ҵ��ɼ�90��");
		}

		System.out.println("���ҳɼ�92��");
		score = operation.search(result, 92);
		if (score != -1) {
			System.out.println("�ҵ��ɼ�92��");
		} else {
			System.out.println("û���ҵ��ɼ�92��");
		}
	}

}