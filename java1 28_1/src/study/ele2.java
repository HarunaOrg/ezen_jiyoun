package study;

import java.util.Random;
import java.util.Scanner;

public class ele2 {

	public static void main(String[] args) {
		
		/* ���������� �ڵ�ȭ �ϱ�
		 * 1. ������������ ���� ��
		 * 2. ���� �ִ� ���� ��
		 * 3. ���������� �̵�
		 */

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		while(true) { System.out.println("1������ 15������ ��մϴ�.");
			System.out.print("���� �ִ� ������ : "); int here = scanner.nextInt();

			//���������� ��ġ �Է°� ����
			int elevator = random.nextInt(15)+1; // 0~14+1 = 15
			System.out.println("���� ���������� ��ġ�� : "+elevator+"�� �Դϴ�.");
		
			System.out.println(here + "������ �̵��� ��ġ�� : "); int move = scanner.nextInt();

				while(true) {
					if(elevator==here); {System.out.println("���������Ϳ� ž���մϴ�.");}
					//���� �ִ� ���� ���������Ͱ� ������ ����
				
					//�ٸ� ���� �ִ� ���������� ȣ��
					 { System.out.println("���������͸� " +elevator+ "������ ȣ���մϴ�. 1. ȣ��"); int ch2 = scanner.nextInt();
					 if (ch2 == 1) { int arr = 0; //0�� �Ǿ�� ���� ���� �ִ� ��	
					 
					 
						 if(elevator > here) {System.out.println("���������Ͱ� "+elevator+"������ �����ɴϴ�.");
							arr = here - elevator; elevator=elevator-arr; //���� �ִ� ������ ���������� ��ġ�� ���� 0�� �Ǹ� ž�� ����
							System.out.println(here+"���� ���������Ͱ� �����Ͽ����ϴ�. ž�����ּ���."); }
						//���� �ִ� ������ ��������Ÿ�� ���� ������
					
						 
						else if(elevator < here) {System.out.println("���������Ͱ� "+elevator+"������ �ö�ɴϴ�.");
							arr = elevator - here ; elevator=elevator-arr; //���� �ִ� ������ ���������� ��ġ�� ���� 0�� �Ǹ� ž�� ����
							System.out.println(here+"���� ���������Ͱ� �����Ͽ����ϴ�. ž�����ּ���."); }
						//���� �ִ� ������ ���������Ͱ� �Ʒ� ������
					
						 
						else {System.out.println("�˸�)ȣ�� ��ư�� �����ּ���.");} //�߸� ȣ��?
					break;} else {System.out.println("�˸�)ȣ�� ��ư�� �����ּ���.");}
				}
			
				} // while2 end
		} //while end	
	} // m e
	
} // c e
