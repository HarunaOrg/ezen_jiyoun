package Day12;

import java.util.Random;
import java.util.Scanner;

import javax.swing.event.CaretListener;

public class day12_4 {
	
	//������ȣ ���� ���α׷�
	//����
		//���� 0000-9999 ������ ���� 10�� �����ؼ� �迭�� ����
		//��� ���� ��ȣ�� �迭�� ����
		//���ڸ� ��ȣ�� Ȧ/¦ ����
		//���� ���ڸ� ��ȣ�� Ȧ�� ���� ���
		//���� ���ڸ� ��ȣ�� ¦�� ���� ���
		//Ȧ������ �迭 ��� //¦������ �迭 ���
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	String[] carlist = new String[10]; //���ڿ� 10�� ������ �� �ִ� �迭(�ִ� 10��)
	String[] evenlist = new String[10]; //¦������
	String[] oddlist = new String[10]; //Ȧ������
	
//	for(String temp : carlist) {
//		if( temp != null) System.out.println(temp);
//	}//���� ������ ���� �ƴϸ� ������ȣ ����
//	
//	
	
	
	while(true) {
		System.out.println("\n �������� ��� ���� ��ȣ");
		for(String temp : carlist) {
			//������ ������� ������ ���� �߰�
			if(temp != null) {
				
				if(Integer.parseInt(temp)%2 == 0) {
					// ��%2==0 �������� 0�̸� ¦��
						System.out.println(temp+"[¦]");			
						
				} else {System.out.println(temp+"[Ȧ]");}
			} //���� �迭 �߰�
		} // for end	
		//���ڴ� �����Ⱑ �� �ǹǷ� ���ڷ� �ٲ� �� ������,
	
			
		
		
		

		/////////////////////////////////////////////////////////////////
		
		
		
		
		// Ȧ������ ��ȣ ��� 
		System.out.println(" \n �������� ��� Ȧ�� ���� [ ���� 2���� ]");
			for( String temp : oddlist  ) {
				if( temp != null ) { System.out.print( temp+" " ); }
				}
					
		// ¦������ ��ȣ ��� 
		System.out.println(" \n �������� ��� ¦�� ���� [ ���� 2���� ]");
			for( String temp : evenlist  ) {
				if( temp != null ) { System.out.print( temp+" " ); }
				}
		
			
			
			
	///////////////////////////////////////////////////////	
		System.out.println("1.���� ����"); int ch = scanner.nextInt();
			if(ch==1) { //������ȣ ��������
				Random random = new Random(); //������ä
				int intnum = random.nextInt(10000); //0~9999���� �߻�
			String �����ѹ� = String.format("%04d", intnum);
			// %d: ����, %f: �Ǽ� , %s : ���ڿ�, %c :����
			// %����d:���ڸ�ŭ �ڸ���[���� �ش� �ڸ����� ������ ����]
			// %0����d: ���ڸ�ŭ �ڸ���[���� �ش� �ڸ����� ������ 0]
			//�̰� �迭�� ����
		
			//�迭�� ������ ã�� ������ȣ ����
			boolean save = false;
			for( int i = 0 ; i<carlist.length ; i++ ) {
				if( carlist[i] == null ) { carlist[i] = �����ѹ�; save=true; break; }
			}
			
			if( save == true ) {
				// ¦��Ȧ�� ���� �й� 
				if( Integer.parseInt(�����ѹ�) % 2 == 0 ) { // ��%2==0 �������� 0�̸� ¦�� 
					// ¦�������迭�� ���� 
					for( int i = 0 ; i<evenlist.length ; i++) {
						if( evenlist[i] == null ) { evenlist[i] = �����ѹ�; break; }
					}
				}else {		// ��%2 == 1 �������� 1�̸� Ȧ�� 
					for( int i = 0 ; i<oddlist.length ; i++) {
						if( oddlist[i] == null ) { oddlist[i] = �����ѹ�; break; }
					}
				}
			}
			
			// ���࿡ ������� ������ ���� 
			if( save == false )System.err.println(" ���� [ ���� �Ұ� ] ");
		}
	}
	
	//���� 0000-9999 ������ ���� 10�� �����ؼ� �迭�� ����
			//��� ���� ��ȣ�� �迭�� ����
	
	
	
	

////////////////////////////////////////////////////	
	}	
	
}
