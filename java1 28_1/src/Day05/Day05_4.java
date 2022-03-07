package Day05;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Day05_4 {

	/* 1. ����� 2.����/�ڷ���/���� 3.����/�ݺ� 4.�迭
	 * ���� �뿩 console ���α׷�
	 * 	1. �迭 : ȸ��(���̵�(�ߺ�x), ��й�ȣ), ����(������(�ߺ�x), �����뿩����, �뿩��)
	 *  2. �ʱ�޴� : ȸ������, �α��� -> ȸ�����Խ� ���̵� �ߺ�üũ
	 *  -------------------------------------------------
	 *  3. �α��ν� �޴�
	 *  	���� �˻�, ���� ���, ���� �뿩, ���� �ݳ�, �α׾ƿ�
	 *  		- ���� �˻� �� �������� ��ġ�ϸ� ������� ���� �뿩����(����, �Ұ���) ���
	 *  		- ������Ͻ� ��� ������ ���
	 *  		- �����뿩�� �����뿩���ΰ� �����Ҷ� �����뿩 ó��
	 *  		- �����ݳ��� ������ �뿩�� ������ �ݳ� ó��
	 *  		- �α׾ƿ��� �ʱ�޴���
	 *  -------------------------------------------------
	 *  4. �α��ν� ���̵� admin�̸� ������ �޴�
	 *  	: �������, �������, (�Ҽ������� ���� ������) �α׾ƿ�
	 *  		- ���� ��� �� �������� �Է¹޾� ���� ���ó��
	 *  		- ���� ��� �� ��� ������ ���
	 *  		- ���� ���� �� ������ �������� �Է¹޾� ������ ������ ����[null]
	 *  		- �α׾ƿ��� �ʱ�޴���
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// ȸ�� 100��[id,password] �����ϴ� �迭
		String[][] memberlist = new String[100][2]; // 100�� 2��	=> ȸ���� 1��	[1��=id][2��=pw]
		
		//���� ��� �����
		String[] bookArray = {"�����","�����","��Ǭ��","ȣ��","����"};
		ArrayList<String> booklist = new ArrayList<>(Arrays.asList(bookArray));

//		int[][] �迭2 = new int[2][3]; 
//		//2���� �迭. ���� ��, �ڰ� ��. 4����Ʈ * 2 * 3 => 24����Ʈ �迭
//		�迭2[0][0] = 80; �迭2[0][1] = 90; �迭2[0][2] = 100;
//		�迭2[1][0] = 40; �迭2[1][1] = 50; �迭2[1][2] = 60;
		
		//////////////////////////////////////////////////////////////////////////
	
		while(true) {
			System.out.println("------------------------");
			System.out.println("-------- ���� �뿩 --------");
			System.out.print("1.ȸ������ 2.�α��� ���� : "); int ch = scanner.nextInt(); 
		
		// 1. ȸ������

		if ( ch == 1) { System.out.println("-------- ȸ������ ������ ---------");
			System.out.print(" MEMBER ID : "); 			String id = scanner.next();
			System.out.print(" MEMBER PASSWORD : "); 	String pw = scanner.next();
			boolean idcheck = true;
			for(int i = 0 ; i<memberlist.length ; i++ ) {
				if( memberlist[i][0] !=null && memberlist[i][0].equals(id) ) {
					System.err.println(" �˸�]] ������ ���̵� �����մϴ�.");
					idcheck = false; // ȸ������ �Ұ����ϰ� idcheck ������ false ����
					break;
				}
			}
			if( idcheck ) { // idcheck �� true �� ��쿡�� ȸ������ó�� 
				for( int i =0 ; i<memberlist.length ; i++ ) {
					if( memberlist[i][0] == null ) {
						memberlist[i][0] = id;	memberlist[i][1] = pw; 
						System.err.println(" �˸�]] ȸ�������� �Ǿ����ϴ�.");
						break; 
				}
			}
		}	
			
		} // if end
		
		else if( ch == 2 ) { System.out.println("-------- �α��� ������ ---------");
			System.out.print(" MEMBER ID : "); 			String id = scanner.next();
			System.out.print(" MEMBER PASSWORD : "); 	String pw = scanner.next();
			
			boolean logincheck = false; 
			for(int i =0; i<memberlist.length; i++) {
				if( memberlist[i][0] !=null && memberlist[i][0].equals( id ) &&
				memberlist[i][1].equals(pw) ) { System.err.println(" �˸�]] �α��� ���� ");
			logincheck = true; // �α��� ���� �� ����
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
			
			while(true) { //�α��� �� �޴�. ���� : �α׾ƿ�
				System.out.println("------------------------");
				System.out.println("-------���� �뿩 ���-------");
				System.out.print("1.���� �˻� 2.���� ��� 3.���� �뿩 4.���� �ݳ� 5.�α׾ƿ� "); int ch2 = scanner.nextInt(); 
				
				if(ch2 == 1) { System.out.println("���� �˻� : "); 
							String �˻� = scanner.next(); int index = booklist.indexOf(�˻�);
					 System.out.println("�˻��� ���� : " + �˻� + "\n" + "�뿩 ���� ���� : " + booklist.indexOf(�˻�) );
					 	// å�� �뿩 ���̸� ���� ����, �ƴϸ� ���� �Ұ���
					 
				} else if (ch2 == 2) { System.out.println("\t���� ���\t");
									System.out.println(booklist);
									//�뿩���ɿ��ε� ��Ÿ������
									
				} else if (ch2 == 3) { System.out.println("�뿩�� ���� �̸� : " );
								//�뿩 ���� ���ο� ����
									System.out.println( "�뿩�� �Ϸ�Ǿ����ϴ�."); 
							//�뿩�� å�� ����Ʈ���� �����ϰ� �뿩�� �� �� �� �뿩�� �Ұ����ϴ�********��� �ڵ� ¥����

				} else if (ch2 == 4) {//������ �뿩�� ������ �ݳ�ó��
					System.out.println("�ݳ��� �� �ִ� ���� ���"); // �뿩�� ���� ���
				System.out.println("�ݳ��� ���� �̸� : ");  String �ݳ� = scanner.next(); //�뿩�� ������ �´� �� Ȯ��
				System.out.println( �ݳ� + "��(��) �ݳ��Ͽ����ϴ�."); 
				
				} else if (ch2 == 5) { System.err.println("�˸�)�α׾ƿ� �Ǿ����ϴ�."); //////�α׾ƿ��� �ʱ�޴���
				} else {	System.err.println("�˸�) �� �� ���� ��ȣ�Դϴ�.");		}
				
//				- ���� �˻� �� �������� ��ġ�ϸ� ������� ���� �뿩����(����, �Ұ���) ���
//				   		- ������Ͻ� ��� ������ ���
//				   		- �����뿩�� �����뿩���ΰ� �����Ҷ� �����뿩 ó��
//				   		- �����ݳ��� ������ �뿩�� ������ �ݳ� ó��
//				   		- �α׾ƿ��� �ʱ�޴���
				//////////////////////////////////////////////////////////////////////////////////////
				
			} //�α��νø޴� while end
			
			}
		}
			
			// �α��ν� ���н�
			if( logincheck == false ) System.err.println(" �˸�]] ȸ�������� ���ų� �ٸ��ϴ�.");			
		} // ch==2 if end 
		else { System.err.println(" �˸�]] �˼� ���� ��ȣ�Դϴ�.!!"); }
			
		
		} // wirle true end
		////////////////////////////////
	} //m e
} // c e
