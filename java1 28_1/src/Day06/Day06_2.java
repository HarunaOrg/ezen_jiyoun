package Day06;

public class Day06_2 {
	
	public static void main(String[] args) {
		
	
	 // ���赵 ������ ���� �Ұ�. Ŭ���� ����
	// 1. Ŭ����(����) �� -> ��ü ����
	Car myCar = new Car();  // ��ü ����
		// 1. Car : ���ǵ� Ŭ������
		// 2. myCar :��ü�̸�[�ƹ��ų�]
		// 3. new : �޸� �Ҵ� ������
		// 4. Car() : ������
	
	//2. ��ü �� �ʵ� ȣ�� [.=���ٿ�����(��ü �� ��� ����)]
	System.out.println("����ȸ�� : "+ myCar.company);
		//myCar ��ü �� �ʵ� ������ ���� myCar.���� ���� ��´�.
		//��ü�� ���� ���� ��ü�� �ҷ��� �ʵ���� ���´�. myCar.�̸� <-�ҷ�������.
	System.out.println("�𵨸� : "+ myCar.model);	// myCar.model ->���ʵ� ȣ��.
	System.out.println("���� : "+ myCar.color);	// myCar.color : color �ʵ� ȣ��.
	System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);	// myCar.maxSpeed : maxSpeed �ʵ� ȣ��
	System.out.println("����ӵ� : " + myCar.speed);	// myCar.speed : speed �ʵ� ȣ��
	
	//���빰 Ȯ�� = . <<�ؾ ���� ��� ������ .�� ����. ������ ��������
	//���赵�� ������ ��ü�� ������ �ʵ忡 ������ ����
	
	// 3. ��ü�� �ʵ� �� ���� ����
	myCar.speed = 60;
		// myCar ��ü �� speed �ʵ带 ȣ���Ͽ� 60 �����͸� ����
	System.out.println("������ �ӵ� : " + myCar.speed);
	
	// new = �ϳ��� ���ο� ĭ�� �����.
	// ���ο� �ڵ��� ��ü ����
	Car yourCar = new Car();
	//ù��° ��ü�� ����� �ٲٴ��� �ι�° ��ü�� �������̴�.
	System.out.println("2�� �ڵ��� : " + yourCar.speed);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}//me
} // ce
