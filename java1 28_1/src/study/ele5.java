package study;

import java.util.Random;
import java.util.Scanner;

public class ele5 {

	public static void main(String[] args) {
		
		
		/* 1. ������������ ���� ��
		 * 2. ���� �ִ� ���� ��
		 * 3. ���������� �̵�
		 */
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("1������ 15������ ��մϴ�.");
		//���� ���� �ִ� ��
		System.out.println("���� ���� �ִ� ������ : "); int me = scanner.nextInt();
		
		//���������Ͱ� �ִ� ��
		int ele = random.nextInt(15)+1; System.out.println("���������Ͱ� �ִ� ���� : "+ele);
		
		//������ ��
		System.out.println(me+"������ �̵��� ���� : "); int mo = scanner.nextInt();
	
		
		//���������� ȣ��
			while(true) { if(ele==me) { System.out.println("���������Ϳ� ž���մϴ�.");} // ���� �ִ� ���� ���������Ͱ� ��ġ�ϸ� ž��
			else { // ��ġ���� ������ ȣ��
				System.out.println(ele+"���� �ִ� ���������͸�"+me+"������ ȣ���մϴ�. 1.ȣ��"); int ho = scanner.nextInt();
				//ȣ�Ⱚ ho
					if (ho == 1) { //ȣ���Ͽ�����, ���������͸� 0���� �����.
						int ele2 = 0;
							if(ele>me) { System.out.println("���������Ͱ� "+ele+"������ �����ɴϴ�.");
									ele2 = me-ele; ele=ele-ele2;
									System.out.println("���������Ͱ� "+me+"���� ���������� ž���Ͽ��ּ���.");
									}else if(ele<me) { System.out.println("���������Ͱ�"+ele+"������ �ö�ɴϴ�.");
									ele2 = ele-me; ele=ele-ele2;
									System.out.println("���������Ͱ� "+me+"���� ���������� ž���Ͽ��ּ���.");					
					} else {System.out.println("�˸�)���������͸� ȣ�����ּ���.");
					} break;
				
				} //else end
					System.out.println("�˸�)���������͸� ȣ�����ּ���.");
			}
			} //while end
		
	} // me
	
} // c e
