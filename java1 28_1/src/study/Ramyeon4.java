package study;

import java.util.Random;
import java.util.Scanner;

public class Ramyeon4 {
	public static void main(String[] args) {
		
		 /* ��� ������
		  * 1. �� 3���� �ְ� ���� ������ ��, �и������� �ִ´�.
		  * ���⿡ ���� ���Ŀ� ����� �ִ´�.
		  */
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		
	while(true) { System.out.println("��� ���̱⸦ �����մϴ�.\n���� ���� �� �� ä����? : "); int water = scanner.nextInt();
		System.out.println("���� ���� "+water+"��ŭ ä�����ϴ�.");
		
		//�������
		System.out.println("���� ������ 1. ���� ���� 2. ������ ����"); int ch = scanner.nextInt();
			if(ch==1) { //���� ����
				System.out.println("���� ������ ������ �����ϰ� ��Ḧ �߰����ּ���."); }
			else if (ch ==2 ){System.out.println("������ Ǯ������ ���� �����ϰ� ��Ḧ �߰����ּ���.");}
			else {System.out.println("�߸��� �����Դϴ�.");}
		
		//��� �߰�
		
			while(true) { System.out.println("�߰��� ��ᰡ �ֳ���? 1. ���� 2. ��� 3. ����"); int ch2 = scanner.nextInt();
				if(ch2==1) { // ���� �߰�
					System.out.println("���ĸ� �󸶳� �߰��ұ��? : "); int pa = scanner.nextInt();
					System.out.println("��鿡 ���ĸ� "+pa+"��ŭ �߰��Ͽ����ϴ�.");	}
				else if(ch2==2) { System.out.println("����� �󸶳� �߰��ұ��? : "); int egg = scanner.nextInt();
				System.out.println("��鿡 ����� "+egg+"��ŭ �߰��Ͽ����ϴ�.");	}
				else { //������				
				System.out.println("�� ����� �ϼ� �˴ϴ�.");}
				
				//�ϼ�
				
				System.out.println(random.nextInt(5)+"�� ¥�� ����� �ϼ��Ǿ����ϴ�.");
				break;
			}//while2 end
	} // while end
		///////////////////////////////////////////////////
	}

}
