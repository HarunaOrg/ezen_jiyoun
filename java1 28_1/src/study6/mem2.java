package study6;

import java.util.Scanner;

public class mem2 {
	public static void main(String[] args) {

		// ȸ���� �湮�� ���α׷�
		// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ]
			// 1. ȸ������ [ ���̵�, ���, �̸�]
			// 2. �α��� [ ���̵�, ��� �����ϸ� �α��� ó��]
		// 2. �α��� �� �޴� [ 1. �湮�� ���� 2.�α׾ƿ�]
			// 1. �湮�� ���� [ ����, ����, �ۼ���(�α��� ���̵�)]
			// 2. �α׾ƿ� [�ʱ�޴��� ���ư���]

//		int[][] �迭2 = new int[2][3]; 
//		//2���� �迭. ���� ��, �ڰ� ��. 4����Ʈ * 2 * 3 => 24����Ʈ �迭
//		�迭2[0][0] = 80; �迭2[0][1] = 90; �迭2[0][2] = 100;
//		�迭2[1][0] = 40; �迭2[1][1] = 50; �迭2[1][2] = 60;

////////////////////////////////////////
	

		Scanner scanner = new Scanner(System.in);
		
		String[][] memlist = new String [10][3]; //ȸ��
		String[][] boardlist = new String [10][3]; //����

		//1. �� ó�� ������
	while(true) { System.out.println("=====ȸ���� �湮��=====");
		System.out.println("1. ȸ������ 2. �α���"); int ch = scanner.nextInt();
		
		//2. ȸ������
		if(ch==1) { System.out.println("=====ȸ������ ������=====");
			System.out.print("���̵� : "); String id = scanner.next();
			System.out.print("��й�ȣ : "); String pw = scanner.next();
			System.out.print("�̸� : "); String name = scanner.next();
		//memlist�� ����
		
		//�Է� ���� ���̵� �ߺ� üũ�ϰ� ��ġ�ϸ� false, ����ġ�ϸ� true. boolean ���
		boolean idcheck = true; //üũ ���ΰ� ����϶�
		for(int i = 0; i<memlist.length ; i++) { //�ϳ��� �����ϸ� ��
			if(memlist[i][0] != null && memlist[i][0].equals(id)) {
				System.out.println("������ ���̵� �����մϴ�."); idcheck = false;	break; } 
			} // for end
		
		//�ߺ� üũ ����� ����
		if (idcheck) { for(int i = 0 ; i<memlist.length ; i++) { 
		if(memlist[i][0] == null) {  memlist[i][0] = id; memlist[i][1] = pw; memlist[i][2] = name;
		//����ִ� �迭�� ã�� ���̵�, ��й�ȣ, �̸��� ������� ����
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�."); break; }	
		} // for end
	} //idcheck if end	
	//******��ȣ ����	
		
		//3. �α���
	}//if end
		else if (ch == 2) { System.out.println("=====�α��� ������=====");
		System.out.print("���̵� : "); String id = scanner.next();
		System.out.print("��й�ȣ : "); String pw = scanner.next();
		
		//true false�� Ȯ���ϱ� ���� boolean
		boolean logincheck = false; //�α��� ������ �ʱⰪ���� �ǵ�����.
		for(int i = 0; i<memlist.length; i++) { //�迭 �� ���� �Է¹��� ���� �������� Ȯ��
		if (memlist[i][0].equals(id) && memlist[i][1].equals(pw) ) {
	System.out.println("�α��� ����");
	logincheck = true;
			
		
	//4. �湮��
		while(true) { System.out.println("=====�湮�� ������=====");	
			System.out.println("��ȣ\t�ۼ���\t����\t����");
			
		//����� �湮�� ���
		for( int j = 0 ; j<boardlist.length ; j++  ) {
		if( boardlist[j][0] != null ) { System.out.printf("%d\t%s\t%s\t%s\n" , 
			j , boardlist[j][2] , boardlist[j][0] , boardlist[j][1] ); }
		} // for end
		
		System.out.print("1.�湮�� ����� 2.�α׾ƿ�"); int ch2 = scanner.nextInt();
		
		//�湮�� �۾���
		if( ch2 == 1 ) { System.out.println("=====�۾��� ������=====");	
		System.out.print(" ���� : "); 	String title = scanner.next();
		System.out.print(" ���� : ");	String content = scanner.next();
		//string���� �Է� �޴´�.
		
		for( int j = 0 ; j<boardlist.length ; j++ ) { //�ϳ��� ���ذ���
		if( boardlist[j][0] == null  )
		{ boardlist[j][0] = title; boardlist[j][1] = content;
		 boardlist[j][2] = id; //�α��ξ��̵�
		 
			System.out.println("�湮���� �ۼ��Ǿ����ϴ�.");break; }
		}//for end
		
		
		
	} else if( ch2 == 2 ) { System.out.println(" �α׾ƿ� �Ǿ����ϴ�."); break; }
		
	else { System.err.println(" �˼� ���� ��ȣ�Դϴ�."); }
				
	} // while end 
			
	} // if end 
	} // for end 
		if( logincheck == false ) System.out.println(" ȸ�������� ���ų� �ٸ��ϴ�."); } 
	else { System.err.println(" �˼� ���� ��ȣ�Դϴ�."); }
		
	} //while end	
	
////////////////////////////////////////
	}//main end
}
