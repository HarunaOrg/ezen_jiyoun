package Day04;

import java.util.Scanner;

public class Day4_1 {
	public static void main(String[] args) {
		
		// ���: if , switch
		// �ݺ���: for, while
			// for [] while [���ѷ���]
			// for�� �ʿ�: 1. �ʱⰪ, 2. ���ǽ�, 3.������, 4.���๮
			// while�� ����
				// �ʱⰪ ;
				// while (���ǽ�){
				// ���๮ ;
				// ������ ; }
			// for�� while ���� ��ġ�� ������
			// � ������ true �̾�߸� ����ȴ�. **
			// �������� ���� ������ ���� ������ ������. *
		
		// for ��1)
		for(int i = 1 ; i <=10 ; i++) //i�� 1�϶� 10 ���ϱ��� 1�� ���ذ��ٸ�
			// i�� 1���� 10���ϱ��� 1�� �����ϸ鼭 ���๮ �ݺ�ó�� -> 10�� ���� (�̰� �ٷ� ���� �� �־�� ��)
		{	System.out.println(i + " ");	}
		
		// while ��1)
		int i = 1 ; //1.�ʱⰪ
		while(i<=10) { //i�� 10 ���� �̸鼭.... 2. ���ǽ� (while start)
		System.out.println(i+" "); //4. ���๮
		i++; //3. ������
		} // while end
		
		// for ��2) 1~100 �����հ�
		int sum = 0;
		for(int j = 1 ; j<=100 ; j++) { // int i�� ������ while�� �����߱� ������ ������ �Ұ���(�ʱⰪ�� �ۿ��� �����ϹǷ�)
			sum += j; //�����հ�. sum = sum + j
		} System.out.println("for 1+100���� : " + sum);
				
		// while ��2) 1+100 �����հ�
		int j = 1; // 1. �ʱⰪ
		int sum2 = 0;
		while(j<=100) { // 2.���ǽ� [true�̸� ����]
			sum2 += j; // 3. ���๮; ->�����ı��� �߰��Ұ�
			j++; //j�� ������ �ϸ� 101�� �Ǵ� ���� ������.
		} System.out.println("while 1+100���� : " + sum2);
		
		// while ��3) ���ѷ��� -> ���α׷��� 24�ð� ���ư��� �� ��
		while(true) { //���ǽ��� true ���� // true ���-> ���ѷ���
			System.out.println("���ѷ���"); //���ѷ����� ������.
			Scanner scanner = new Scanner(System.in);
		 int exit = scanner.nextInt(); //��ĳ�� �����
		 if ( exit == 3 ); //exit�� 3�϶� Ż��(�극��ũ)
			break; //switch���� �ʼ������� ���� �극��ũ. �극��ũ �������� ���� ����� while��(if ���� �ݺ���) Ż��
		}
		
		
		
		
	} // me

} // c e
