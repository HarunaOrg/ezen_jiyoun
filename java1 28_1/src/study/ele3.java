package study;

import java.util.Random;
import java.util.Scanner;

public class ele3 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("1������ 15������ ��մϴ�.");
		System.out.println("���� ���� �ִ� ���� : "); int here = scanner.nextInt();
		
		//���������� ����
		int ele = random.nextInt(15)+1; //����
		System.out.println("���� ���������� ��ġ�� : "+ele+"��");
		
		System.out.println(here+"������ �̵��� ��ġ�� : "); int mov = scanner.nextInt();
		
		while(true) { if(ele==here) { System.out.println("���������Ϳ� ž���մϴ�.");}
		else { //���� ������ ȣ��
			System.out.println(ele+"���� �ִ� ���������͸� "+here+"������ ȣ���մϴ�. 1.ȣ��"); int ho = scanner.nextInt();
			//���������� ȣ�Ⱚ ho
			//����
				if (ho == 1) { int ar = 0;
				
					if(ele>here) { System.out.println("���������Ͱ� "+ele+"������ �����ɴϴ�.");
						ar = here-ele; ele=ele-ar;
						System.out.println("���������Ͱ� "+here+"���� �����Ͽ����ϴ�.");
					} else if (ele<here) { System.out.println("���������Ͱ� "+ele+"������ �ö�ɴϴ�.");
						ar = ele-here; ele=ele-ar;
						System.out.println("���������Ͱ� "+here+"���� �����߽��ϴ�.");
					} else {
						System.out.println("�˸�)���������͸� ȣ�����ּ���.");
					}
					break;
				} else {System.out.println("�˸�) ���������͸� ȣ�����ּ���.");}
			
		}
	
		
		} // while end
	} // me

} // ce
