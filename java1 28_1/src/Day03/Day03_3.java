package Day03;

import java.util.Scanner;

public class Day03_3 {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

		//����6 : ������ �Է¹޾� ������ 90�� �̻��̸� �հ� �ƴϸ� ����
		System.out.print("���� �Է�:"); int ���� = scanner.nextInt();
		if(���� > 90) System.out.println("�հ�");
		else if(���� < 90) System.out.println("���հ�");
		
//		Ǯ��
		// System.out.print("����:"); int ���� = scanner.nextInt();
//		if(���� > 90) System.out.println("�հ�");
//		else (���� < 90) System.out.println("���հ�");
		
		//����7 : ������ �Է¹޾� ������ 90�� �̻��̸� A, 80�� �̻��̸� B, 70�� �̻��̸� C, �� �� �����
		System.out.println("���� �Է�:"); int ����2 = scanner.nextInt();
		if(����2 >= 90) System.out.println("A");
		else if(����2 >= 80) System.out.println("B");
		else if(����2 >= 70) System.out.println("C");
		else System.out.println("�����");
		
		
		//����8 : �α��� ������
			// [�Է�]: ���̵�� ��� �Է�
			// [����]: ȸ�����̵� admin�̰� ��й�ȣ�� 1234�� ��쿡�� �α��� ���� �ƴϸ� �α��� ���� ���
//		System.out.println("���̵� : "); int ���̵� = scanner.nextInt();
//		System.out.println("��� : "); int ��� = scanner.nextInt();
//		if ( ���̵� = admin ) { if (��� = 1234) System.out.println( "�α��� ����" ) ; }
//		else System.out.println( "�α��� ����" );
			//Ǯ��
		System.out.println("-----�α��� ������-----");
		System.out.print("���̵� : "); String ���̵� = scanner.next(); // �׳� next �̿�
			// char �ڷ��� [ ���� 1��(������x) ���� ]
			// �ڷ������δ� ���ڿ��� ������ �� ����.
				// 1. String Ŭ������ ����ϸ� ���ڿ� ���� ����
				// 2. char �迭/����Ʈ ����ϸ� ����
		System.out.print("��� : "); int ��� = scanner.nextInt();
			// ��ü�� ���� �Ұ�
				// �ڷ��� ����ϴ� ������ ������ ��� ����
				// Ŭ���� ����ϴ� ��ü�� ������ ��� �Ұ� -> �޼ҵ� [�̸� �������] �̿�
					// ���ڿ��񱳽� .equals �̿�
					// ���ڿ�1.equals(���ڿ�2) <-���ڿ�1�� ���ڿ�2 ��
				// if (���̵�.equals("admin")) ) { //���̵�� ��ü�̱� ������ �Ұ���. ��ü�񱳽� ������()���
				// if (��� == 1234) { // �н������ �ڷ��� �����̱� ������ ����
		
		//�ö��(boolean����)
//		boolean �α��μ��� = false;
//		if ( ���̵� == "admin" ) { //�Է��� ���̵� admin�̸�
//			if (��� == 1234) { //�Է��� ����� 1234�̸�
//				System.out.println( "�α��� ����" ) ;
//				�α��μ��� = true;
//			} // ��������� ���� boolean�� �̿��� �ٽ� �����. boolean : 1��Ʈ true Ȥ�� false ����
//			else {
//				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
//				 else { System.out.println("���̵� Ʋ�Ƚ��ϴ�.");}
//		if(�α��μ��� == false)	System.out.println("�α��� ����");
//			}
		
		//Ǯ��
		System.out.println("---------�α��� ������-----------");
		System.out.print(" ���̵� : ");	String id = scanner.next();
			// char �ڷ��� [ ���� 1�� ���� ] -> �ڷ������� ���ڿ��� �����Ҽ� ����.
				// 1. String Ŭ���� ����ϸ� ���ڿ� ���尡�� 
				// 2. char �迭/����Ʈ ����ϸ� ���� 
		System.out.print(" ��й�ȣ : ");	int pw = scanner.nextInt();
			// ��ü�� ����Ұ�
				// �ڷ��� ����ϴ� ������ ������ ��� ���� 
				// Ŭ���� ����ϴ� ��ü�� ������ ��� �Ұ� -> �޼ҵ�
					// ���ڿ� �񱳽� .equals
					// ���ڿ�1.equals( ���ڿ�2 ) 
		boolean �α��μ��� = false;
			// boolean : 1��Ʈ true Ȥ�� false ���� 
		if( id.equals("admin") ) {	// id �� Ŭ���� ��ü�̱� ������ == �Ұ��� // ��ü�񱳽ÿ��� .equals() ���
			// �Է��� id�� admin �̸� 
			if( pw == 1234 ) { // pw �� �ڷ��� �����̱� ������ == ����  
				// �Է��� pw 1234 �̸� 
				System.out.println(" �˸�) �α��� ���� ");
				�α��μ��� = true; // id , pw �� ��� �����ϸ� �α��μ��� ������ true ����
			}
			else { // �Է��� pw 1234 �ƴϸ� 
				System.out.println(" �˸�) ��й�ȣ Ʋ�Ƚ��ϴ�. ");
			}
		}else { // �Է��� id�� admin �� �ƴϸ� 
			System.out.println(" �˸�) ���̵� Ʋ�Ƚ��ϴ�. ");
		}
		
		if( �α��μ��� == false ) System.out.println(" �˸�) �α��� ���� ");
			// �α��� ���� ������ false �̸� ��� 
		
		//**** �̺κ� ����� �����ϰ� �Ѿ�� ***������ �����ϱ�
		
		
		//����9 [ �Է� ] : ����,����,���� �Է¹ޱ�
//			[ ���� ] (����Ǽ� 3����)
//				����� 90�� �̻��̸鼭 (if)
//					�������� 100�� �̸� '������' ���
//					�������� 100�� �̸� '������' ���
//					�������� 100�� �̸� '���п��' ���
//				����� 80�� �̻��̸鼭  (else if)
//					�������� 90�� �̻��̸� '�������' ���
//					�������� 90�� �̻��̸� '��������' ���
//					�������� 90�� �̻��̸� '�������' ���
//				�׿� ����� (else)
		System.out.println("���� : "); int ���� = scanner.nextInt();
		System.out.println("���� : "); int ���� = scanner.nextInt();
		System.out.println("���� : "); int ���� = scanner.nextInt();
		//��պ��� ���. �Ҽ��� ���� �����Ѵٸ� int��
		int ��� = (����+����+����)/3;
		// ������ ���� ��Ʈ ���
		if(���>=90) { //if��ŸƮ //����� 90�� �̻��̸�
			//if��ø 
			if(����==100) System.out.println("���� ���");
			if(����==100) System.out.println("���� ���");
			if(����==100) System.out.println("���� ���");
		} //if���� else if ����
		else if(���>=80) { //����� 80�� �̻��̸�
			if(����>=90) System.out.println("���� ���");
			if(����>=90) System.out.println("���� ���");
			if(����>=90) System.out.println("���� ���");
		} // else if ��
		else {System.out.println("������");} //�׿��̸�
		
		
	} // me
} // ce
