package Day07;

public class Calculator2 {
	
	//1. �ʵ�
	
	//2. ������
	
	//3. �޼ҵ�
//�� �� �ҷ����� �� �� �����޾� 1�� �ö�´�.
		// 1. ���� �޼ҵ�
	void execute() { //�μ��� x ��ȯ�� x ���� �Լ�
		double result = avg(7,10);
		println("���� ��� : "+result);
	}
	
		// 2. ��� �޼ҵ�
	
	double avg(int x, int y) { //�μ��� �ְ� ��ȯ�� �ִ�.
		double sum = plus(x, y); //�հ� ���� ���ϴµ� �հ� �Լ� �����.
		double result = sum / 2; return result;
	}
	
	
		// 3. ���ϱ� �޼ҵ�
	
	int plus(int x, int y) {//�μ��� �ְ� ��ȯ�� �ִ�.
		int result = x+y; return result;
	}
	
	
		// 4. ��� ��� �޼ҵ�
	
	void println(String message) { //�μ������� ��ȯ����.
		System.out.println(message);	}
	
	
	

}
