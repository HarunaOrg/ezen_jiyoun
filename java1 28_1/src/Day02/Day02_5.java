package Day02;

import java.util.Scanner;

public class Day02_5 {

	public static void main(String[] args) {
	
		// ���� 2. ���� ����
		
		// 1.  �Է°�ü
		Scanner scanner = new Scanner(System.in);
		
		// 2. �Է� ���� ������ -> ������ �̵�
		System.out.println("�ݾ� : "); int �ݾ� = scanner.nextInt();
		// 3. ����
		System.out.println("�Է��� �ݾ� : " + �ݾ� );
		System.out.println("�ʸ��� : " + (�ݾ�/100000) + "��");
		// �ʸ��� ����
		�ݾ� = �ݾ� - (�ݾ�/100000)*10000 ; //�ݾ׿��� �ʸ��� ���� ����
		�ݾ�-= (�ݾ�/100000)*100000;
		System.out.println("�ʸ��� ���� : " + �ݾ� );

		System.out.println(" ���� : " + (�ݾ�/10000) + "��");
		// ���� ����
		�ݾ� = �ݾ� - (�ݾ�/10000)*1000 ; //�ݾ׿��� ���� ���� ����
		�ݾ�-= (�ݾ�/10000)*10000;
		System.out.println("���� ���� : " + �ݾ� );	
		
		System.out.println(" õ�� : " + (�ݾ�/1000) + "��");
		�ݾ� = �ݾ� - (�ݾ�/1000)*1000 ; //�ݾ׿��� õ�� ���� ����
		System.out.println(" ��� : " + (�ݾ�/100) + "��" );
		
		
		//����3
			//��� ã��
				// �� % �� ������ �������� 0 � ���� �� ���� ���
		System.out.println("����3 �����Է�:");
		int ����3 = scanner.nextInt(); //�ϳ��� ���� �Է¹ޱ�
		System.out.println("�Է��� ������ 7�� ��� �Ǵ� : " + (����3%7 == 0));
											// ������ 7 ������ 0�̸� ���
		
		//����4
			//Ȧ¦ ã��
				// Ȧ�� : �� % 2 ������ �������� 1 �̸� ���� Ȧ��
				// ¦�� : �� % 2 ������ �������� 0 �̸� ���� ¦��
		System.out.println("����4 Ȧ¦ã��:");
		int ����4 = scanner.nextInt();
		System.out.println("�Է��� ������ Ȧ�� �Ǵ� : " + (����4%2 == 1));
						// ������ 1�� ���� �� 1�� �������� Ȧ��, 0���� �������� ¦��
		
		// ����5
			// 7�� ����̸鼭 ¦������
		// System.out.println("7�� ������� ¦�� : ");
		// int ����5 = scanner.nextInt();
		// System.out.println("�Է��� ������ 7�� ������� ¦�� �Ǵ� : " + (����5%7 == 1 && ����5%2 == 0));
			//Ǯ��
		System.out.println("����4) �����Է� : "); int ����5 = scanner.nextInt();
		System.out.println("�Է��� ������ 7�� ����̸鼭 ¦�� �Ǵ� : " + (����5%7 == 0));
		
		//����6
			// �ΰ��� ������ �Է� �޾� ū�� ���
			// Ǯ��
		System.out.println("����6) ����1 �Է�: "); int ����6_1 = scanner.nextInt();
		System.out.println("����6) ����2 �Է�: "); int ����6_2 = scanner.nextInt();
		int ū�� = ����6_1 > ����6_2 ? ����6_1 : ����6_2;
				// ?=�� :=���� ������ 1�� �ƴϸ� 2��
		System.out.println("�� ū ���� : " + ū�� );

		//����7
			// �������� �Է¹޾� �� ���� ����ϱ� ( ������ * ������ * ������[3.14])
		// System.out.println("������ : ");
		// int ������ = scanner.nextInt();
		// System.out.println("�������� �̿��� �� ���� : " + (������*������*3.14));
		
		System.out.println("����7) ���� �Է� : "); int ����7 = scanner.nextInt();
		System.out.println(" �� ���� : " +(����7*����7*3.14));
		
		
		//����8
			// �� �Ǽ��� �Է¹޾� �� �Ǽ��� ���� ���� ���� ��% ���� ����ϱ�
		// ��) 54.5   84.3 �̸�    64.285714%
		
		// System.out.println("����8) ù��° �Ǽ� �Է� : "); int ����8_1 = scanner.nextInt();
		// System.out.println("����8) �ι�° �Ǽ� �Է� : "); int ����8_2 = scanner.nextInt();
		// System.out.println("1���� 2���� �� %�ΰ�? : " + (����8_2/����8_1));
		
		System.out.println("����8) �Ǽ�1 �Է� : "); double ����8_1 = scanner.nextDouble();
		System.out.println("����8) �Ǽ�2 �Է� : "); double ����8_2 = scanner.nextDouble();
		double ���� = (����8_1/����8_2)*100;
		System.out.println("�Ǽ�1�� �Ǽ�2 ����� : " + ���� + "%");
		System.out.println("�Ǽ�1�� �Ǽ�2 ����� : %.2f %%" + ����);
				// %f : �Ǽ�.
				// %.����f : ���ڸ�ŭ �Ҽ����� ����

		//����9
			// ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�]
		//��ٸ��� ���� = > (���� * �غ�) * ���� / 2
//		System.out.println("����9) ���� : "); int ����9_1 = scanner.nextInt();
//		System.out.println("����9) �غ� : "); int ����9_2 = scanner.nextInt();
//		System.out.println("����9) ���� : "); int ����9_3 = scanner.nextInt();
//		System.out.println(" ��ٸ����� ���̴� : " + ((����9_1*����9_2)*����9_3)/2);
		System.out.println("����9) ���� : "); double ���� = scanner.nextDouble();
		System.out.println("����9) �غ� : "); double �غ� = scanner.nextDouble();
		System.out.println("����9) ���� : "); double ���� = scanner.nextDouble();
		System.out.println(" ��ٸ����� ���̴� : " + (����*�غ�)*����/2);
				
		//����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
				//ǥ��ü�� ���� = > (Ű - 100) * 0.9
		System.out.println("����10) Ű : "); int Ű = scanner.nextInt();
		System.out.println("ǥ��ü���� : " + (Ű-100)*0.9);

		//����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
				//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))
		System.out.println("����11) Ű : "); int Ű2 = scanner.nextInt();
		System.out.println("����11) ������ : "); int ������ = scanner.nextInt();
		System.out.println("BMI�� : " + ������/((Ű2/100)*(Ű2/100)));
		// double�� �Ѵٸ� %.2f ���� �̿��� ��Ÿ�� �� �ִ�. ��, ���ڵ� �Ҽ������� �Է�( 100.0 )
		
		//����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ� [ 1 inch -> 2.54cm ] 
		System.out.println("����12) ��ȯ�� ��ġ : "); int ����12 = scanner.nextInt();
		System.out.println(" cm��? : " + (����12*2.54));
		
		
		
		//����13:  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
				//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
				//�߰���� �ݿ����� => 30 %
				//�⸻��� �ݿ����� => 30 %
				//������ �ݿ����� => 40 %
		System.out.println("����13) �߰���� : "); double �߰���� = scanner.nextDouble();
		System.out.println("����13) �⸻��� : "); double �⸻��� = scanner.nextDouble();
		System.out.println("����13) ������ : "); double ������ = scanner.nextDouble();
		�߰���� = �߰����*0.3;
		�⸻��� *= 0.3;
		������ *= 0.4;
		System.out.printf("�ݿ����� ���� : %.2f \n", (�߰����+�⸻���+������));
		
		//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
			//int x = 10; int y = x-- + 5 + --x;
			//printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
				// 1. x-- + 5 (�������ҹǷ� ���ϱⰡ ����) -> 10+5
				// 2. x-- -> x ���� [x=9]
				// 3. 15 + --x -> ���Ұ� ���� [x=8]
				// 4. 15 + 8 => y=23
	
	
		// ȥ�ڼ� �غ��� 15~17
		//����15 : ���̸� �Է¹޾� ���̰� 10���̻��̸� �л� , 20���̻��̸� ���� , 40���̻��̸� �߳����� ����ϱ�
	

		//����16 : 3���� ������ �Է¹޾� ������������ ���� 
		//	int num[] = new int[3];
		//	Scanner input = new Scanner(System.in);
		//	System.out.println("���� 3���� �Է��ϼ��� : ");

				
		//����17 : 4���� ������ �Է¹޾� ������������ ���� 
		
		
				
				// p. 102 Ȯ�ι���
		
	}
}
