package study4;

import java.util.Random;
import java.util.Scanner;

/* �ζ� �Ǻ���
1. ����� 6�� �� �Է¹ޱ� -> �迭 ����
	1. 1~45 ���� ���� �Է¹ޱ� �ƴϸ� ���Է�	2. �ߺ�x ���Է�
2. ��÷��ȣ : ��ǻ�� ���� 6�� �߻� -> �迭 ����
	1. 1~45����	2. �ߺ�x
3. ����� ��ȣ�� ��ǻ�� ��÷��ȣ�� ���ϼ��� ����
*/

public class loto5 {
public static void main(String[] args) {

	// �迭 �����
	int[] mynumber = new int[6]; int[] comnumber = new int[6];
	//�Է� �ޱ� ���� ��ĳ�� ����
	Scanner scanner = new Scanner(System.in);
	
	//�Է� �ޱ�
	for(int i = 0; i<6; i++) { //0~5���� 6��
		System.out.println("1~45 ���� �Է� : ");
		int number = scanner.nextInt();		
	//�� Ȥ�� ���� (why?)
		boolean safe = true;
		
	//1~45 ������ ��
	if(number < 1 || number > 45) { //���� �Է� ���� ��ȣ�� 0���� �۰ų� 46�� �����鼱�� �ʱ�ȭ. int i=1
		System.err.println("�˸�) �Ұ����� ��ȣ�Դϴ�. �ٽ� �Է����ּ���."); i--; safe = false;
		//i�� �����ϰ� ����� false�� �ٲ� �������� �ʴ´�.
		} //if end
		
	// �ߺ� üũ
	// �迭 �� �ε����� ��� ȣ���Ͽ� �Է¹��� ���� ������ ��
		
		for(int j = 0; j<6; j++) { //j�� 5���� 1�� �����ϸ� �ϳ��� �񱳵ȴ�.
			if(number == mynumber[j]) { //���� �� ��ȣ�� �迭 �ȿ� �Էµ� ��ȣ�� ������?
				//������
				System.err.println("�˸�) �̹� �Էµ� ��ȣ�Դϴ�. �ٽ� �Է����ּ���."); i--; }
			safe = false; } //�������� �ʰ� �Ѿ��.
	//�ߺ����� 1~45 ������ ���� �Է��Ͽ����� �����Ѵ�.
		mynumber[i] = number; } //for end
	
	System.out.println("\n �Է��� ��ȣ : "); //�Է��� ��ȣ�� �����ؤ�,
	//temp�� ���� �Է��� ��ȣ�϶�
	for(int temp : mynumber) { System.out.println(temp + "\t");}

	//��ǻ�� �� �Է�(��������)
	for(int i = 0; i<6 ; i++) { Random random = new Random(); //�������� �����ϵ��� ���� �ڵ带 �ְ�
		int number = random.nextInt(45)+1; //0~44+1�� ���ڸ� �������� 6�� �������� �Ѵ�.
	
	//������ �Ǻ�
		boolean safe = true;
		for(int temp : comnumber) { if (number == temp) {
			//temp�� ��ǻ���� �����̰� ���� �Էµ� ���ڰ� �װͰ� ������
			i--; safe = false;  } }
		
		if(safe) comnumber[i] = number; } //�ߺ��� ���� ��� ����x
	System.out.println("\n comnumber : "); //��ǻ���� ���ڸ� ��Ÿ����.
		for(int temp : comnumber) { System.out.println(temp + "\t"); }
	// �������� ��� �� 36�� ��

		int same = 0;
		//���� ���ڸ� 0���� �ʱ�ȭ �������ش�.
	for(int i = 0; i<mynumber.length; i++) { //length�� �� �� ����.
		//i1�� 0�϶� �� ���ڿ� �ϳ��� �÷����� ���Ѵ�.
		for (int j = 0; j<comnumber.length; j++) { if(mynumber[i] == comnumber[j])
			//���� ������ ������ ���� ������Ų��.
			{same++;}
		}
	} // for end
	System.out.println("������ ���� ���� : "+ same);
	//������ ���ڸ� ��Ÿ���� �����Ѵ�.


//			 * for (int ���ؼ� : ����ڹ�ȣ) { //����ڹ�ȣ �迭�� �ϳ��� �񱳱��� ����
//			 * for (int �񱳴�� : ��÷��ȣ) { //��÷��ȣ �迭�� �ϳ��� �񱳴�� ����
//			 * if (���ؼ� == �񱳴��) �����Ѽ�++ ;
//			 * } }
//			 * ���� ������ ������ ���� �� �ö󰣴�.
//			 * ����ڰ� ������ ��ȣ�� �ϳ��� �����ͼ� �� �� �� ���� ���� ��÷��ȣ�� �����ͼ� ��.
//			 * ����� ��ȣ�� 1�� �� �� ��÷��ȣ�� 6�� ����.

	///////////////////////////////////////
	} // me
}
