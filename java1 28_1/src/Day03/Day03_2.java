package Day03;

import java.util.Scanner;

public class Day03_2 {
	public static void main(String[] args) {
		
		// �Է°�ü= {} �� 1���� ����
		Scanner scanner = new Scanner(System.in);
		
		// ����1 : 2���� ������ �Է¹޾Ƽ� �� ū�� ���
		System.out.print("����1 �Է�: ");		int ����1 = scanner.nextInt();
			// int�� ������ �����ϰ� �Է¹��� ���� ������ �����ͼ� ����
		System.out.print("����2 �Է�: ");		int ����2 = scanner.nextInt();
		
		// ����
		if (����1 > ����2) System.out.println("�� ū �� : " + ����1);
			// ���࿡ �Է¹��� ����1������ ����2�������� ũ�� ���� �ƴϸ� ���� ���� Ȯ��.
		else if(����1 < ����2) System.out.println("�� ū �� : " + ����2);
			// ����Ʈ ���� ������ ���ǹ��� �� �´� ��
			// [��������] ����1������ ����2�������� ������ ���� �ƴϸ� �� ��
		else System.out.println("����.");
			// �� �� ������ ����

			// �ڵ尡 �ʹ� �þ�� �ʰ� ������ ����Ͽ� �ڵ带 ����
		// ����2 : 3���� ������ �Է¹޾Ƽ� ���� ū �� ���
		System.out.print("����3 �Է�: ");		int ����3 = scanner.nextInt(); //������ �ߺ�x
		System.out.print("����4 �Է�: ");		int ����4 = scanner.nextInt();
		System.out.print("����5 �Է�: ");		int ����5 = scanner.nextInt();
		int max = ����3; // max�� ���� ū ���� �ӽ÷� �����ϴ� ����(����)
						// ù��° ���� max�� �־���� �ι�° ���� ��
			// max�� ù��° �� �־�α�
		if (max < ����4) {
			// ���࿡ max���� �ι�° ���� �� ũ�� ��ü
			//int temp = ����4 ; // temp=�ӽ�, ��ȯ�� (�ѹ��� ������ ��)
			// ����4 = max; max = temp;	//�ѹ��� ����
			max = ����4;	}
		if (max < ����5) {max=����5;}
		System.out.println("���� ū �� : " + max);
		
		
		// ����3 : 4���� ������ �Է¹޾Ƽ� ���� ū �� ���
		System.out.print("����6 �Է�: ");		int ����6 = scanner.nextInt();
		System.out.print("����7 �Է�: ");		int ����7 = scanner.nextInt();
		System.out.print("����8 �Է�: ");		int ����8 = scanner.nextInt();
		System.out.print("����9 �Է�: ");		int ����9 = scanner.nextInt();
		int max2 = ����6;
		if (max2 < ����7) { max = ����7;} // max2�� ���� 7���� ������ ��ü
		if (max2 < ����8) { max = ����8;}
		if (max2 < ����9) { max = ����9;} // �ݺ����� ���� �ڵ尡 �پ���. �� ����� �˾Ƶα�
		System.out.println("���� ū �� : " + max2);
		

		//����4 : 3���� ������ �Է¹޾� ������������ ���� 
		System.out.print("����10 �Է�: ");		int ����10 = scanner.nextInt();
		System.out.print("����11 �Է�: ");		int ����11 = scanner.nextInt();
		System.out.print("����12 �Է�: ");		int ����12 = scanner.nextInt();
		
		if(����10 > ����11) {
			// max ���� temp�� �ѹ��� ������
			// ��ü[���� - �ΰ� ������ ������ ��ȭ���]
			int temp =  ����10; //�ӽú���=����1
			����10 = ����11; // ����1=����2
			����11 = temp; // ����2= �ӽú���			
		}
		if(����10 > ����12) { //�Ȱ��� �ٽ� ������
			int temp = ����10; ����10 = ����12; ����12= temp;	}
		if(����11 > ����12) { int temp=����11; ����11=����12; ����12=temp;}
		System.out.printf("�Է��� �� �������� : %d %d %d", ����10, ����11, ����12);
		// System.out.println("�Է��� �� �������� :" + ����10 + "" + ����11 + "" + ����12);
			
		//����5 : 4���� ������ �Է¹޾� ������������ ���� 
		System.out.print("����1 �Է�: ");		int ����1 = scanner.nextInt();
		System.out.print("����2 �Է�: ");		int ����2 = scanner.nextInt();
		System.out.print("����3 �Է�: ");		int ����3 = scanner.nextInt();
		System.out.print("����4 �Է�: ");		int ����4 = scanner.nextInt();
		
		if(����1 < ����2) { int temp = ����1; ����1=����2; ����2=temp;}
		if(����2 < ����3) { int temp = ����2; ����2=����3; ����3=temp;}
		if(����3 < ����4) { int temp = ����3; ����3=����4; ����4=temp;}
		if(����4 < ����1) { int temp = ����4; ����4=����1; ����1=temp;}
		//���� 2��� 1�� �ְ� ���� ���ε��� ���ϴ� ����� ����
		System.out.printf("�Է��� �� �������� : %d %d %d", ����1, ����2, ����3, ����4);
		
		
	}
}