package study;

import java.util.Random;
import java.util.Scanner;

public class Ramyeon2 {

	public static void main(String[] args) {
		
		 /* ��� ������
		  * 1. �� 3���� �ְ� ���� ������ ��, �и������� �ִ´�.
		  * ���⿡ ���� ���Ŀ� ����� �ִ´�.
		  */
 
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//1. ���� ���� ä���
	while (true) {			
		System.out.println("------------��� ���̱� ����------------");
		System.out.println("���� ���� �� �� ä����? : "); int water = scanner.nextInt();
		System.out.println("���� ���� "+ water +"�� ä�����ϴ�.");
		
		//2. ��� ������ �ִ´�.

		System.out.println("���� �����ϴ�. 1. ���� �ִ´�. 2. ������ �ִ´�."); int ch = scanner.nextInt();
			if(ch == 1) { System.out.println("���� ���� �־����ϴ�.");
				System.out.println("���� ������ ������ �ְ� ��Ḧ �߰����ּ���.");
			} else if (ch == 2) { System.out.println("������ ���� �־����ϴ�.");
			System.out.println("������ Ǯ������ ���� �ְ� ��Ḧ �߰����ּ���.");				
			} else {System.err.println("�˸�) �߸��� ���ڸ� �Է��Ͽ����ϴ�.");	}
		
		//3. ��Ḧ �߰��Ѵ�.
	while(true) {
			System.out.println("�߰��� ��ᰡ �ֳ���? 1. ���� 2. ��� 3. ����"); int ch2 = scanner.nextInt();
				if(ch2 == 1) { //���� �߰�
					System.out.println("���ĸ� �� �� �߰��ұ��? : "); int pa = scanner.nextInt();
					System.out.println("���ĸ� "+pa+"�� �߰��Ͽ����ϴ�.");					
				} else if(ch2 == 2) { // ��� �߰�
					System.out.println("����� �� �� �߰��ұ��? : "); int egg = scanner.nextInt();
					System.out.println("����� "+egg+"�� �߰��Ͽ����ϴ�.");					
				} else { System.out.println("�� ����� �ϼ� �˴ϴ�.");} // ��� ����
			
		// �ϼ�
				System.out.println(random.nextInt(5)+"��¥�� ����� �ϼ��Ǿ����ϴ�.");
			break;	
			}// while2 end
		
		} // while end
	} // me
} // ce
