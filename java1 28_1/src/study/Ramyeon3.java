package study;

import java.util.Random;
import java.util.Scanner;

public class Ramyeon3 {

	public static void main(String[] args) {
		
		 /* ��� ������
		  * 1. �� 3���� �ְ� ���� ������ ��, �и������� �ִ´�.
		  * ���⿡ ���� ���Ŀ� ����� �ִ´�.
		  *///////////////////////////////////////////////////

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		while(true) { System.out.println("----------��� ���̱� ����----------");
			System.out.println("���� ���� �� �� ä����? : "); int water = scanner.nextInt();
			System.out.println("���� ����"+water+"��ŭ ä�����ϴ�.");
			
			//��� ����
				System.out.println("���� �����ϴ�. 1. �� ���� 2. ���� ����"); int ch = scanner.nextInt();
					if(ch == 1) { System.out.println("���� ������ ������ �ְ� ��Ḧ �߰����ּ���,"); }
					else if (ch == 2) {System.out.println("������ Ǯ������ ���� �ְ� ��Ḧ �߰����ּ���.");}
					else {System.err.println("�˸�) �ùٸ� �������� ����ּ���.");}
					
					//��� �߰�
				while(true) {
					System.out.println("�߰��� ��Ḧ �������ּ���. 1.���� 2.��� 3.���� 4.����"); int ch2 = scanner.nextInt();
						if(ch2 == 1) {System.out.println("���ĸ� �� �� �߰��Ͻðڽ��ϱ�?"); int pa = scanner.nextInt();
							System.out.println("���ĸ� "+pa+"��ŭ �߰��Ͽ����ϴ�.");	}
						else if(ch2 == 2) {System.out.println("����� �� �� �߰��Ͻðڽ��ϱ�?"); int egg = scanner.nextInt();
						System.out.println("����� "+egg+"��ŭ �߰��Ͽ����ϴ�.");
						} else if(ch2 ==3) {System.out.println("���ĸ� �� �� �߰��Ͻðڽ��ϱ�?"); int pa2 = scanner.nextInt();
						System.out.println("���ĸ� "+pa2+"��ŭ �߰��Ͽ����ϴ�.");
	
						}else {System.out.println("�� ����� �ϼ� �˴ϴ�.");} //��� ����
						
						System.out.println("����� �ϼ��Ǿ����ϴ�.");
					System.out.println("������ : "+random.nextInt(5));
				break;
				}
					
		} // while end
		
		
		
		
		///////////////////////////////////////////////////////
	}
}
