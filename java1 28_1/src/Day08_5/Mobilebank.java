package Day08_5;

import java.util.Scanner;

import javax.xml.transform.Result;

import Day08_5.Member;
import Day08_5.Loanclass;

public class Mobilebank {
	

	// ����� ��ũ ���α׷� [ 2�� ���� ]
		// �䱸����
		// ȸ�� �ֿ��� : 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣ ã��
			// ȸ������ : �̸�, ��ȣ, ���̵�, ��й�ȣ ����. ���̵� �ߺ��˻�

		// ���� �ֿ��� : 1.���»��� 5.���� 6.���¸�� / 2.�Ա� 3.��� 4.��ü
							// (����)               (����)
		// ȸ���� ���� ���� ���
				// ���¹�ȣ ���� 5�ڸ� �Է� (���º�� �����Ǹ�...)
	
		// ������(�����) ���� ��ǰ�� ����ϸ� ��ϵ� �����ǰ�� ȸ���� �����ؼ� ���� ���
				// �������� ���� ��� �޴� 1.��ǰ �̸� 2.��ǰ ���� 3. ���� �ѵ�
	
	// ���� : ����, ����, ȸ��
			// �ʵ�
			// �޼ҵ�

	static Scanner scanner = new Scanner(System.in);
	static Loanclass loanclass = new Loanclass();
	static Member[] members = new Member[1000];	
		
	public static void main(String[] args) { 

	
		
		
		
		
		

		while (true) { System.out.println("---------------MOVBILE BANK---------------");	
		System.out.println("1.ȸ������ 2.�α��� 3.���̵� ã�� 4.��й�ȣ ã��");
		int ch = scanner.nextInt();
		Member member = new Member();

		if(ch == 1) { boolean result = member.ȸ������();
				if(result) { System.out.println("�˸�) ȸ������ ����");}
				else {System.out.println("�˸�)ȸ������ ����");} }
				else if (ch == 2) { String result = member.�α���();
				if (result == null) {  System.out.println("�˸�) ������ ȸ�� ������ �����ϴ�."); 	}
	} else if (ch == 3) { member.���̵�ã��(); } else if (ch==4) {member.��й�ȣã��();} 
				else { System.out.println("�˸�) �α��� ����! "); } }
		 //void menu end
	
	
	
	
	
	
	
	
	
	
	}
}
