package Day09;

public class Ÿ�̾������ {
	public static void main(String[] args) {
		
		//1. ��ü ���� [ �ڵ��� 1�� ���� ]
		Car mycar = new Car(); //�ؾ Ʋ
		//car�� ���⿡.
		
		//Ŭ���� �� Ÿ�̾� ��ü�� 4�� -> mycar ����
		
		//2. �޼ҵ� ȣ��
		for(int i = 1; i<=5; i++) {
			int problemLocation = mycar.run(); //�ڵ��� ȸ���޼ҵ� ȣ��->5��
			//������ ���� ��ũ
			//run�ϸ� ��ũ�� ��ġ�� �̸��� �´�.
			
			//tire�� �ִ� roll�� �̸���.
			//run�Ҷ����� roll(ȸ��)�� �ϴµ� �ű⿡ false, true�� �־�
			//���� ���� ȸ������ �޸��Ǹ� ��ũ�� ����.
			
		switch (problemLocation) {
		case 1: System.out.println("�տ��� �ѱ� Ÿ�̾� ��ü");
			//����ȯ
			mycar.frontLeftTire = new HankookTire("�տ���", 15);
		//���� Ŭ���� ��ü�� = new ����Ŭ����() ;
		//��� �޾ƾ߸� ����!!!!
		//�ڽ��� �θ����� ����ȯ ����.
			
			// Object object = new Tire("asd",13);
			// �ֻ����̹Ƿ� �ȴ�.
			
		break; //switch���� break �ʼ�. switch�� Ż��.
		
		case 2: System.out.println("�տ����� ��ȣ Ÿ�̾� ��ü");
			mycar.frontRightTire = new KumhoTire("�տ�����", 13);
		break;
		
		case 3: System.out.println("�ڿ��� �ѱ� Ÿ�̾� ��ü");
			mycar.backLeftTire = new HankookTire("�ڿ���", 14);
		break;
		
		//�������� �극��ũ �� �־ �ȴ�
		case 4: System.out.println("�ڿ����� ��ȣ Ÿ�̾� ��ü");
			mycar.backRightTire = new KumhoTire("�ڿ�����", 15);
		}
			
			
		}

		
		
		/////////////////////////////////
	}

}
