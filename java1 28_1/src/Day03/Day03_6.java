package Day03;

import java.util.Scanner;

public class Day03_6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //�Է°�ü
		
		// ������1 : �Է¹��� ����ŭ *�� ���(�ݺ��� ���)
		System.out.println("����1) ������ : "); int s1 = scanner.nextInt();
		for(int i = 1 ; i<=s1 ; i++) {
			// i�� 1���� �Է� ���� ������ i�� 1�� �����Ѵ�.
			System.out.print("*");		}
		
		// ������2 : �Է¹��� ����ŭ *�� ��� [�� 5������ �ٹٲ� ó��]<-if ó��
		System.out.println("����2) ������ : "); int s2 = scanner.nextInt();
		for(int i = 1 ; i<=s2 ; i++) {
			// i�� 1���� �Է¹��� ������ i�� 1�� �����ϸ鼭 ���๮ �ݺ�ó��.
			System.out.print("*"); //5������ �ٹٲ� ó�� -> 5������� ���� -> ���ã�� ó��
			if(i%5==0) //i�� ������ 5������ 0���� ��������. 5��� ã��.
				System.out.println(); //�ٹٲ� ó��. ������ ��������.
			}
		
		// ������3 : �Է¹��� �ټ���ŭ ���(3�̸� ***) ������ � ������� ����
		// i�� �ٷ� �����ϰ� i=n�϶��� ����. s=���϶� i=1 <> s=1. i=2 <> s= 1 2 �̷���
		// ����ã��. i�� 1���� 5���� 1�� ����. s�� 1���� 
		System.out.print("����3) �ټ� : "); int line3 = scanner.nextInt();
		for(int i=1 ; i<=line3 ; i++ ) { //�Է¹��� �������� line���� �Է�.
			// s�� 1���� ���� �ټ����� 1�� �����ϸ� ���� ���
			// i�� 1���� �Է¹��� �� ������ 1�� ����
			
			// 1. �����
			for(int s = 1 ; s<=i ; s++) {
				System.out.print("*");
			}
			
			// 2. �ٹٲ�ó��
			System.out.println();
			// ���� �ټ��� �˷��ִ� i, ���� 1�ٴ� 1��, 2��...�þ�Ƿ� i�� 2�� s�� 2��.
		}
		
		// ������
			// ����ڰ� 3�� �Է������� i = 1 ; i<=3 [true]
				// for �� ��ø�̹Ƿ� s ����.
				// s = 1 ; 1<=1 [true] -> * ���� ���� -> s++
				// s= 2 ; 2<=1 [false] -> �ݺ��� ����
			//�ٹٲ�
				// i = 2 i<=3 [true]
				// s = 1 s<= 2 [true] -> * -> s++
				// s = 2 s<= 2 [true] -> * -> s++
				// s = 3 s<= 3 [false] -> �ݺ��� ����
			// �ٹٲ�
				// i = 3 ; i <= 3 [true]
				// s = 1 ; s<= 3 [true] -> * -> s++
				// �ݺ�. s = 4 ; s<=4 [false] -> �ݺ��� ����
			// �ٹٲ�
				// i = 4 ; i<=3 [false] �ݺ��� ����
		
		//������4
		System.out.print("����4) �Ųٷ� �� : "); int line4 = scanner.nextInt();
		for(int i=1 ; i<=line4 ; i++ ) { 
			// i�� �Է� ���� ������ 1�� ���� �ٹٲ�. s�� 1���� �Է� ���� ��-���� �ټ����� 1�� ����. �����
			// 1. �����
			// i�� ���� 1�� �����ϹǷ� �� �Ϳ� �ٽ� 1�� ���ؾ� 5 4 3 2 1�� �ȴ�. ������ ã�ƾ���
			for(int s = 1 ; s<=line4-i ; s++) {
				System.out.print("*");	
			}
			// 2. �ٹٲ�
			System.out.println();
		}
		
		// ������5 : �Է¹��� �ٸ�ŭ ��� (���� ��� i, ������ ��� b. ���� ���s �ʿ�)
		System.out.print("����5) ���� �� : "); int line5 = scanner.nextInt();
		for(int i=1 ; i<=line5 ; i++) {
			//1. �������
			for(int b = 1 ; b<=line5-i ; b++) {
				System.out.print(" "); // ���� -> �����̽�
			}
			//2. �����
			for(int s = 1 ; s<=i ; s++) {
				System.out.print("*");
			}
			//3. �ٹٲ�
			System.out.println();
		} //�߾ȵȴ� �ٽ� �غ���	/ ln�������� print�� �ϰ�. 1�̶� i�򰥸��� �ʱ�*****
		
		
		//������6 : �Է¹��� �ٸ�ŭ ��� ****���� �ʿ�
		System.out.print("����6) �Ųٷ� ���� �� : "); int line6 = scanner.nextInt();
		for(int i=1 ; i<=line6 ; i++) { //i�� 1���� �Է¹��� ������ ���
			//1. �������
			// i������ �ƴ϶� i������. -i(b<=i-1)�� �ϰų� �̸�(b<i)ó���ϱ�
			for(int b = 1 ; b<=i-1 ; b++) {
				System.out.print(" ");
			}
			//2. �����
			// s�� 5 4 3 2 1 �̹Ƿ� �Է¹��� ��-1. �Է¹��� ���� ���� ����i�� ���� 1�� ���Ѵ�.
			for(int s = 1 ; s<=line6-i+1 ; s++) {
				System.out.print("*");
			}
			//3. �ٹٲ�ó��
			System.out.println();
		} //�������� ������� �����ϴ� ������ ã��

		//������7 : �Է¹��� �ٸ�ŭ ���
		System.out.println("����7) Ʈ�� : "); int line7 = scanner.nextInt();
		for(int i=1 ; i<=line7 ; i++) {
			//1.�������
			for(int b=1 ; b<=line7-i ; b++) {	System.out.print(" ");	}
			//2. �����
			//ó������ 2�� ���ϸ� 2���� ��µǹǷ� -1�� ��´�.
		for(int s =1 ; s<=i*2-1 ; s++) {	System.out.print("*");
		} System.out.println("");
		}
		
		//��������8 : Ʈ����� ����
		System.out.println("����8) ����Ʈ�� : "); int line8 = scanner.nextInt();
		for(int i=1 ; i<=line8 ; i++) {
			//1.�������
			for(int b=1 ; b<=line8-i ; b++) {	System.out.print(" ");	}
			//2. �����
			//ó������ 2�� ���ϸ� 2���� ��µǹǷ� -1�� ��´�.
			//��°� ���� �ƴ϶� i�� �ٲ۴�.
		for(int s =1 ; s<=i*2-1 ; s++) {	System.out.print(i);
		} System.out.println("");
		}
		
		//������9 : �Է¹��� �ٸ�ŭ ���
		System.out.println("����9) �Ųٷ� Ʈ�� : "); int line9 = scanner.nextInt();
		for(int i=1 ; i<=line9 ; i++) {
			//1. �������
			for(int b = 1 ; b<=i*2+1 ; b++) { System.out.print(" ");		}
			//2. �����
			for(int s=1 ; s<=i+1 ; s++) {	System.out.print("*");}
			for(int b = 1 ; b<=i*2-1 ; b++) { System.out.print(i);		}
			System.out.println(" ");
		} 
		
		
//		System.out.print("����6) �Ųٷ� ���� �� : "); int line6 = scanner.nextInt();
//		for(int i=1 ; i<=line6 ; i++) { //i�� 1���� �Է¹��� ������ ���
//			//1. �������
//			// i������ �ƴ϶� i������. -i(b<=i-1)�� �ϰų� �̸�(b<i)ó���ϱ�
//			for(int b = 1 ; b<=i-1 ; b++) {
//				System.out.print(" ");
//			}
//			//2. �����
//			// s�� 5 4 3 2 1 �̹Ƿ� �Է¹��� ��-1. �Է¹��� ���� ���� ����i�� ���� 1�� ���Ѵ�.
//			for(int s = 1 ; s<=line6-i+1 ; s++) {
//				System.out.print("*");
//			}
//			//3. �ٹٲ�ó��
//			System.out.println();
//		} //�������� ������� �����ϴ� ������ ã��
		
		//������10 (7+9)
		
		
		
		// --------------------�ǵ��� x
	} // me
} //ce
