package Day07;

import java.util.Scanner;

public class Day07_5_BookApplication {

	//����¸�
	//BookApplication Ŭ���� : ����� ���� �ڵ�
	//Book Ŭ���� : ���� ���� �ڵ�
	//Member Ŭ���� : ȸ�� ���� �ڵ�
	
	//*���� �뿩 console ���α׷�[Ŭ���� ����]
		//Ŭ���� ����(����) (��)
			// 1. book
				// �ʵ�: ISBN, ������, �۰�, �����뿩����, �뿩ȸ��
				// �޼ҵ�: 1.�����˻� 2.������� 3.�����뿩 4.�����ݳ�
			// 2. member
				// �ʵ�: ȸ����ȣ, ���̵�, ��й�ȣ, �̸�, ����ó
				// �޼ҵ�: 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã�� 5.�α׾ƿ�
		//ȭ�� ����(����) (����Ʈ)
			// 1. �ʱ�޴�
				// 1.ȸ������ 2.�α��� 3.���̵� ã�� 4.��й�ȣ ã��
				// �Ϲ� ȸ�� �޴� 1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�
				// ������ �޴� 1.������� 2.������� 3.�������� 4.�α׾ƿ� (������ ������ ��赵)
	
	/////////////
	
	// main �ۿ� ������ �����ϴ� ���� : ��� �޼ҵ忡�� ����ϱ� ���ؼ�
		// �������� : {���� ����} ��ȣ ������ ����� ������ {}������ ���� �� ����.
			//���� �ٸ� �޼ҵ忡�� ����ϴ� ����, ���� �ٸ� {}������ ����->��������
			//��������,�������� static : ���α׷� ����ñ��� �޸� �Ҵ�
				//���α׷� ���۽� �޸𸮰� �Ҵ�ǰ� ���α׷� ����� �޸𸮰� �ʱ�ȭ�ȴ�.
				//���α׷� ���������� ��� ���� ���Ǵ� �޸�[����] ->��� ���� ���� �Ÿ� ����������.
	
	static Scanner scanner = new Scanner(System.in);
	// => book, member �� �� �����ͼ� �� �� �ִ� �ڵ�
	static Member[] members = new Member[1000];
	//��� ������ ����� ���̴� static�� ����	
	static Book[] books = new Book[1000];
	//��� ������ ���̴� �����ʵ� Static. �������� ������
	
	
	//main�� ���� : �ڵ带 �о��ִ� ������. �޼ҵ�. [������]
	public static void main(String[] args) { // main start

		// menu(); // ����ȣ�� �Ұ���.

		//�޼ҵ� ȣ��
			// ����ȣ��
			// ��? static�� �־. �޸𸮰� �켱�Ҵ��̱� ������. static �� �޼ҵ�, �ʵ带 ���� ����
			// static�� ���� �Ҵ��ϰ� void�� �Ҵ� ���̶� ���� ����
			//main �޼ҵ�: static �޼ҵ��̱� ������ static �޼ҵ常 ���� ȣ�� ����
			// static���� �޸� �Ҵ�

			// �ܺ�ȣ��
				//1. ��ü ����(�޸� �Ҵ�) -> �޼ҵ� ȣ��
				// void �տ� static ���̸� �޸𸮰� �Ʊ��
				// ���� Ŭ���� �������� �޼ҵ� ȣ��
		
		Day07_5_BookApplication application = new Day07_5_BookApplication();
		//���� ���� Ŭ������ �ִ� ��ü�� �ٽ� Ŭ����(����)�� ���� �� �ִ�.
		application.menu();
		//�̷����ϸ� menu();, static+void menu ������� �ʾƵ� �ȴ�.
		
		
	}	//main end 
	
	//1. �޼ҵ� ���� : �ʱ� �޴�
	//void�տ� static ������ ������ �ȴ�.
	void menu() {

   

		while(true) {
		System.out.println("--------------���� �뿩 ���α׷�--------------");
		System.out.println("1.ȸ������ 2.�α��� 3.���̵� ã�� 4.��й�ȣ ã��");
		
		//ȣ���� ���� ��ü�� �ʿ�. member Ŭ����.
			int ch = scanner.nextInt();
			
			Member member = new Member();
			// ch==1���� �ƴ϶� ���⿡ �ۼ��Ͽ� ��� ������ ����� �� �ֵ��� ��
			// 1~4 {} ��ȣ���� ��� ����
			
			if(ch == 1) { // ȸ������ �޼ҵ� ȣ��
				//1. ��ü ����
			 //��ȯ Ÿ���� ������ ���������� �˷�����Ѵ�. ���� boolean ����
				boolean result = member.ȸ������(); //ȸ������ �޼ҵ� ȣ��
				if(result) System.out.println("�˸�) ȸ������ ����");
				else System.out.println("�˸�)ȸ������ ����");}
			
			else if (ch == 2) { // �α��� �޼ҵ� ȣ��
				String result = member.�α���();

				if (result == null) { //�α��� ����
					System.out.println("�˸�) ������ ȸ�� ������ �����ϴ�.");
					// 2. ������ �޴� �޼ҵ� ȣ��					
				} else	if(result.equals("admin")) { //null�ε� �������� ��
					System.out.println("�ȳ��ϼ���! "+result+"���� ȯ���մϴ�.");
					adminmenu(); //���� �޼ҵ� ȣ��

					// 1. �Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
				} else { //�Ϲ�
					System.out.println("�ȳ��ϼ���! "+result+"���� ȯ���մϴ�.");
					membermenu(result);
					
				}
			}
			else if (ch == 3) { // ���̵� ã�� �޼ҵ� ȣ��. �̸�, ����ó �ޱ�
				member.���̵�ã��();
				
			}
			else if (ch == 4) { // ��й�ȣ ã�� �޼ҵ� ȣ��. ���̵�, ����ó �ޱ�
				member.��й�ȣã��();
				
			}
			else {System.err.println("�˸�)�߸��� ��ȣ�� �Է��Ͽ����ϴ�.");}
			
		} //while end
		
		
	}
	
	
	//�����ڶ� �Ϲ�ȸ�� �޴� �޼ҵ�� �ٸ���.
	
	//2. �Ϲ�ȸ�� �޴� �޼ҵ�
	void membermenu(String loginid) { //�μ� �������� �޶� ������ �ڷ����� �����ؾ���
		while(true) {
		System.out.println("--------------ȸ�� �޴�--------------");
		System.out.println("1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5.�α׾ƿ�");
		
		//�Է�
		int ch = scanner.nextInt();
			Book book = new Book(); //������ڷ� ��ü -> �޼ҵ� ȣ��� 
		if(ch == 1) { book.�����˻�(); }
		else if (ch == 2) { book.�������();}
		else if (ch == 3) { book.�����뿩(loginid);} //loginid �μ��� �޾ƿ;��Ѵ�.
		else if (ch == 4) { book.�����ݳ�(loginid);}
		else if (ch == 5) { System.err.println("�˸�) �α׾ƿ� �Ǿ����ϴ�.");
			return; // �Ϲ�ȸ�� �޼ҵ� ���� [�α׾ƿ�]
		} else {
			
		}
		
	}
	} // while end
	
	//3. ������ �޴� �޼ҵ�
	void adminmenu() {
		while (true) {
		System.out.println("--------------������ �޴�--------------");
		System.out.println("1. ������� 2. ������� 3. �������� 4.�α׾ƿ�");
		int ch = scanner.nextInt();
			Book book = new Book();
		if(ch == 1) {
			book.�������();

		} else if (ch == 2) {
			book.�������();

		} else if (ch == 3) {
			book.��������();

		} else if (ch == 4) { System.err.println("�˸�) �α׾ƿ� �Ǿ����ϴ�.");
			return; // ������ �޼ҵ� ���� [�α׾ƿ�]
		} else {
			
		}
		
	}
		
	} // while end
		/////////////////////////////////////////////////////////////

}
