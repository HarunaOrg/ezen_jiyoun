package study;

import java.util.Random;
import java.util.Scanner;

public class Ramyeon5 {
	
	 /* ��� ������
	  * 1. �� 3���� �ְ� ���� ������ ��, �и������� �ִ´�.
	  * ���⿡ ���� ���Ŀ� ����� �ִ´�.
	  */
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//��
	while(true) {System.out.println("���� ���� �� �� ä����? : "); int water = scanner.nextInt();
			System.out.println("���� ����"+water+"�� ä�����ϴ�.");
			
	//��� ����
			System.out.println("���� �����ϴ�. 1. �� ���� 2. ���� ����"); int ch = scanner.nextInt();
			if(ch == 1) { System.out.println("���� ���� �־����ϴ�.\n���� ������ ������ �ֽ��ϴ�.");
			} else if(ch==2) { System.out.println("������ ���� �־����ϴ�.\n������ Ǯ������ ���� �ֽ��ϴ�.");
			} else {System.out.println("�˸�)�ùٸ� ��ȣ�� �������ּ���.");}

	//�߰����		
			while(true) { System.out.println("�߰� ��Ḧ �����ϼ���. \n 1.���� 2.��� 3.����"); int ch2 = scanner.nextInt();
				if(ch2==1) {System.out.println("���ĸ� � �����ðڽ��ϱ�? : "); int pa = scanner.nextInt();
				System.out.println("���ĸ� "+pa+"�� �־����ϴ�.");} //���� end
				else if(ch2==2) { System.out.println("����� � �����ðڽ��ϱ�? : "); int egg =scanner.nextInt();
				System.out.println("����� "+egg+"�� �־����ϴ�.");}//��� end
				else {System.out.println("�� ����� �ϼ� �˴ϴ�.");} //������
				
	//�ϼ�
			System.out.println("����� �ϼ��Ǿ����ϴ�.");
			System.out.println("�� ����� "+random.nextInt(5)+"��¥�� ����Դϴ�.");
				break;
			}//while2 end
	} // while end

	
	
	///////////////////////////////////////////////
	}
	
}
