package Day13;

import java.util.Random;

public class day13_1 {
	public static void main(String[] args) {
		
		// p534 : Math Ŭ���� [ ���� ���� �޼ҵ� ���� ], static�̹Ƿ� ��ü ���� ��� ����
		//java.lang ��Ű���� import �� �ص� ��� ����
		
		
		//1. ���밪. �ش� ���� ���밪�� ���� �� ����
		//������ ����
		System.out.println("���밪 : " + Math.abs(-5));
		System.out.println("���밪 : " + Math.abs(-3.14));
		
		//å ����
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		
		
		
		//2. ���� ����� ������ �ø�
		//������ ����
		System.out.println("�ø��� : "+Math.ceil(5.3)); //�Ҽ��� ù°�ڸ����� ������ �ø�
		System.out.println("�ø��� : "+Math.ceil(-5.3)); //-5
		
		//å ����
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
		
		
		
		//3. ����� ������ ����
		//������ ����
		System.out.println("������ : "+Math.floor(5.3));
		System.out.println("������ : "+Math.floor(-5.3)); //�����϶� ����� ������ ���� �ڷ� ���Ƿ� -6. 
		
		//å����
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5="+v5);
		System.out.println("v6="+v6);		
		
		
		
		//4. ���� 2�� ������ �� �� �� ū ��
		//������ ����
		System.out.println("�ִ� : "+Math.max(5,9)); //�� �� �� ū�� ����
		System.out.println("�ִ� : "+Math.max(5.3,2.5)); 
		
		//å ����
		int v7 = Math.max(5,9);
		double v8 = Math.max(5.3 ,2.5);
		System.out.println("v7="+v7);
		System.out.println("v8="+v8);

		
		
		//5. ���� 2�� ������ �� �� �� ���� ��		
		//������ ����
		System.out.println("�ּڰ� : "+Math.min(5,9)); //�� �� �� ������ ����
		System.out.println("�ּڰ� : "+Math.min(5.3,2.5)); 
		
		//å ����
		int v9 = Math.min(5,9);
		double v10 = Math.min(5.3 ,2.5);
		System.out.println("v9="+v9);
		System.out.println("v10="+v10);
		
		
		
		//6. �μ��� ������ 0���� 1������ double�� ������ ��ȯ
		System.out.println("���� : "+Math.random()); //0~1 ������ ���� �߻�
		//vs
		Random random = new Random(); //class�� next�� ���� ���Ƿ� �̰� �� ���� �� �̵� ����
		random.nextBoolean(); //int������ ���� �̾Ƽ� ��(���Ѱ� ����ϱ�)
		
		//�Է� ������ Ŭ���� 1.System.in.read() 2.Scanner �ΰ����� ����ϴ� ����� ����
			//�㳪 1���� ����Ʈ���� �ҷ��� ����ȯ�� �����ؾ� �ϰ�, 2���� next�� �̿��� ��ü�� ����Ʈ���� ���ڵ����� �ٲ� �����´�.
			//�ñ������� 2���� �� �ʰ� �������Ƿ� �� ����
		//���� 1.Math.random() : ����ȯ ����. 2.Random : next�� ���� �ڵ� ����ȯ
		// �� 1���� java.lang���� �ʱ���� ������� �־��� 2������ �������� ������Ʈ�� ��
		
		
		
		//7. � ���� ���� ����� ������ �Ǽ����� �ݿø����� ǥ��
		//������ ����
		System.out.println("����� ������ �Ǽ� �� : "+Math.rint(5.3)); //������ �ݿø�
		System.out.println("����� ������ �Ǽ� �� : "+Math.rint(5.7)); //5�̻��� �տ� 1�� ���Ѵ�.
		//������ ����� �������� ���ϴ��� round
		//å���� ���� �� �ʿ� x..
		
		
		
		//8. � ���� ���� ����� ������ ���������� ǥ��
		System.out.println("����� ������ ���� �� : "+Math.round(5.3));
		System.out.println("����� ������ ���� �� : "+Math.round(5.7));
		//�Ǽ��� ������ �ʰ� ������ �� ��������.(�Ǽ��� �ȳ���)

		//535p 41��° : Ư�� �Ҽ��� ��ġ���� �ݿø�
		System.out.println(Math.round(12.3456));
		//�Ҽ��� ù°�ڸ����� �ݿø��� 
		double value = 12.3456; //�Ҽ� 3�ڸ����� �ݿø�
		double temp1 = value * 100; //12.3456�� *100�� �ϸ� 1234.56�� �ȴ�.
		//�Ҽ����� �ڸ��� �Ű� �ݿø��ϰ� �ٽ� ���ڸ��� �������´�. Ư�� �ڸ����� �ݿø��� �Ұ����ϹǷ� �̷� ��� ���
		
		long temp2 = Math.round(temp1); //1234.56 �ݿø� -> 1235
		double v16 = temp2/100;
			//temp2/100 -> long/int -> �ڹٿ��� �⺻ �������� 100. ����ڰ� ������ �Է��ϸ� ������ int
			//temp2�� 100.0�� ������ long/double -> �⺻ �Ǽ����� double.
			//�� ������ �ݵ�� ��� ******
			//�����ڴ� �ڷ����� ������ �̷� ����� �ڷ��� �ʿ�?�����ϼ���
		System.out.println("v16:"+v16);
		//round�� �����ϸ� �Ҽ� ù°¥���� �ݿø��ϹǷ� 12.3456�� 100�� ���� 1234.56���� �ٲ� �ø����� 
			//���󺹱͸� ��Ű�� ���� �ٽ� ������ 100�� �Ѵ�.
		
		
		
		//536~537
		//����. �ֻ��� 1~6
		// int num = Math.random(); �� double�� ����ȯ�� ����
		// int num = (double)Math.random();
		System.out.println("0~1 ������ �Ǽ��� : "+Math.random());
		System.out.println(Math.random()*6); //0~1 *6 = 0~6�� �ȴ�. �̷��Ԥ� ����ؼ� ��������
		System.out.println(Math.random()*6 +1); //0~6�� 1�� ���� 1~7���� ���� ���´�.
		
		int num = (int)(Math.random()*6)+1; //���� ����ȯ
			//� �� �Ǵ� ���� �տ� int double ���� ������ ������ �ս��� ���� �� ������ ���� ����ȯ�� ����������.
			//ū ���ڿ��� ���� ���ڷ� ���Ƿ� �����ͼս�.
			//double -> int ��������ȯ�� -> �Ҽ��� �߸�
		System.out.println("1���� 6������ ���� : " + num);
			//1~6������ ����

		//Ŭ������ ����. �� ���� �� ���.(next�� ����ȯ�� ������ش�.)
		
		Random random2 = new Random();         //��ȣ�� ����� ����
		System.out.println("1���� 6������ ���� : " + (random.nextInt(6)+1) ); //0���� �����ؼ� 5���� �̹Ƿ� 1���ϱ�
			//��� ����ȯ�� �ʿ�����Ƿ� �̰� �� ���� ���� ����
		
		
		
		
		
		
/////////////////////////////////////////////////		
	}	
}
