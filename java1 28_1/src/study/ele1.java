package study;

import java.util.Random;
import java.util.Scanner;

public class ele1 {
	public static void main(String[] args) {
		
		/* ���������� �ڵ�ȭ �ϱ�
		 * 1. ������������ ���� ��
		 * 2. ���� �ִ� ���� ��
		 * 3. ���������� �̵�
		 */
		Random random = new Random();
		//���� ��ü ����
		Scanner scanner = new Scanner(System.in);
		// ��ĳ�� ����
		
		while (true) {
			
			System.out.println("1������ 15������ �����մϴ�.");
			// ����ڰ� �Է��� �� �ִ� ���� ��Ÿ����.
			System.out.print("���� �ִ� ������ : " ); int here = scanner.nextInt();
			//���� ���� �ִ� ������ �Է� �޾� �����Ѵ�.
			
			int elevator = random.nextInt(15)+1;	// ���������� ��Ҵ� ����. 0~14+1=15
			System.out.println("���� ������������ ��ġ�� " + elevator+ "��");
			//�������� ���� ���������� ���� �����ش�.
				
			System.out.print(here+"������ �̵��� ��Ҵ� : "); int move = scanner.nextInt();
		//���� �̵��� ��Ҹ� �����ϰ� ���� �����Ѵ�.
			
				while (true) { //while2 start
					if(elevator == here) { System.out.println("���������Ϳ� ž���մϴ�."); }
				//���� ���� �ִ� ��ҿ� ���������Ͱ� ������  ��
				
				// ���� �ִ� ��ҿ� ���������Ͱ� �ٸ��� ��ư�� ������ ���������Ͱ� ���� �ִ� ��ҷ� �̵��ϵ��� �Ѵ�.
					else { System.out.println("���������Ͱ� "+elevator+"���� �ֽ��ϴ�. 1. ȣ��"); int ch2 = scanner.nextInt();
					//ȣ�� ���� �޾� if ����
					if (ch2 == 1) {	int c = 0; //���������Ϳ� ���� �ִ� ��Ұ� �Ȱ��� ������ c�� ����	
						if(elevator > here) { // ���� �ִ� ��Һ��� ���� ������ 0���� ������ش�.
							c = here - elevator; elevator=elevator+c;
							System.out.println("���������Ͱ� �ϰ��Ͽ����ϴ�. ž�����ּ���.");}
						else if(elevator < here) { // ���� �ִ� ��Һ��� ���� ������ 0���� ������ش�,
							c = elevator - here; elevator=elevator-c;
							System.out.println("���������Ͱ� ����Ͽ����ϴ�. ž�����ּ���.");} 
						//���������Ͱ� ���� ž���ϰ�, �߸��� �������� ���� �˸� ����
						} else {System.err.println("�ùٸ� ��ư�� �����ּ���.");} //else end
					
					break;
			
		} //while2 end
	}// while end

		}
	///////////////////////////////////////////////
	} // me
} // c e
