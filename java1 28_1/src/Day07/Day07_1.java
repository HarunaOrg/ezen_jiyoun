package Day07;

public class Day07_1 { // cs
	
	public static void main(String[] args) {
		
		//�޼ҵ� ȣ����
			//1. �޼ҵ尡 �����ϴ� Ŭ������ ��ü �ʿ�
			//2. ��ü��.�޼ҵ��()
				// ex) scanner.nextInt();
				// . : ���ٿ�����(�ʵ峪 �޼ҵ� ȣ���Ҷ� ���)
		//1. ��ü����
		Calculator myCalc = new Calculator();
		//Ŭ������   ��ü��[�̸�]     (�⺻)������(Ŭ���� �̸��� ����)
				// = �޸� �Ҵ� ������
		
		//2. �޼ҵ� ȣ��
		myCalc.powerOn();
		
		//3. �޼ҵ� ȣ�� [ �μ� 2�� ] 
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : "+ result1);
		// ���� ���� ���� �� �Ұ����� �ʿ�(������Ÿ� ����)
			//plus�޼ҵ忡 5�� 6 ���� �Ŀ� 11�̶�� ����� �ޱ�
		
		//4. �޼ҵ� ȣ�� [ �μ� 2�� ]
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : "+result2);
		
		
		//5.�޼ҵ� ȣ��[�μ�x]
		myCalc.powerOFF();
		
	}
	
} // ce
