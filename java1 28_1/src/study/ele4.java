package study;

import java.util.Random;
import java.util.Scanner;

public class ele4 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		while(true) { System.out.println("1������ 15������ ��մϴ�.");
		System.out.println("���� �ִ� ���� : "); int me = scanner.nextInt();
		
		int ele = random.nextInt(15)+1;
		System.out.println("���� ���������ʹ� : "+ele+"��");
		
		System.out.println("�̵��� ��ġ�� : "); int move = scanner.nextInt();
		
			while(true)
			{ if(ele==me); { System.out.println("���������Ϳ� ž���Ͽ����ϴ�."); }
			 System.out.println("���������͸�"+ele+"������ ȣ���մϴ�. 1.ȣ��"); int ho = scanner.nextInt();
					if(ho==1) { int arr=0;
						if(ele>me) { System.out.println("���������Ͱ�"+ele+"������ �����ɴϴ�.");
							arr = me-ele; ele=ele-me; System.out.println("���������Ͱ�"+me+"���� �����Ͽ����ϴ�. ž�����ּ���.");}
						else if(ele<me) { System.out.println("���������Ͱ�"+ele+"������ �ö�ɴϴ�.");
							arr = ele-me; ele=ele-me; System.out.println("���������Ͱ�"+me+"���� �����Ͽ����ϴ�. ž�����ּ���.");}
						else {System.out.println("�˸�)ȣ�� ��ȣ�� �����ּ���,");  } break;} 
				else {System.out.println("�˸�)ȣ�� ��ȣ�� �����ּ���,");}
				
		
			} //wile2 end
				
		}//while end
		////////////////////////////////
	}

}
