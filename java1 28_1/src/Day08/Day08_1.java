package Day08;

public class Day08_1 {
	
	public static void main(String[] args) {
		
		//p.238 : static
			// ��������
			// �������� ������ = ���α׷� ���������� ����ϴ� 
		
		//1. Ŭ������ �ʵ�, �޼ҵ� ���ٹ��
			// a) static ����� �ƴҶ� ��ü ���� -> ��ü.���
		 		// ��ü�� ������ �� new �����ڷ� ��ü(�� ��� ����) �޸� �Ҵ�
		Calculator calculator = new Calculator();
		//calculator�� static�� ��� ���� ���̰�ü ���� �� pi ���� ����
		System.out.println("��ü�� �̿��� ��� ���� : " +calculator.pi);

		// static ����� �϶� -> Ŭ������.���
		// class�� �ε� �ǰ� �޼ҵ� ������ static ������ �޸� �Ҵ�
		System.out.println("��ü ���� ��� ���� : "+calculator.pi);
		
		double result = 10 * 10 * calculator.pi;
								// Ŭ������.����������		
		int result2 = calculator.plus(10, 5);
		// Ŭ������ static�� ������ ���� ���� ��ü.��� �� �ҷ�����
		int result3 = calculator.minus(10, 5);
		
		System.out.println("result1 : "+result);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		
	} //main end
}
