package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class day13_3 {
	public static void main(String[] args) {
		
		
		//�޼ҵ�ȭ ���ѳ����� ���߿� �ٽ� �ҷ��� �� ���ϰ� �μ��� ���� ����� �ٸ��� �� ���� �ִ�.
		
		
		Scanner scanner = new Scanner(System.in);
		//��ĳ�ʷ� �Է� �޴� ����� ����(2�� �ּ�ó��)
		System.out.print("���� : ");  int year = scanner.nextInt();
		System.out.print("�� : ");  int month = scanner.nextInt();
		//�̷��� console���� 2022, 4 �˻��ϸ� �޷� ���´�.
		
		�޷�(year, month);
		
		
		
		
		////////////////
		
	//�޼ҵ� ����� �ּ�
//		//1. Ķ���� Ŭ���� �� ���� ��¥/�ð� ��ü ȣ��
//		Calendar calendar = Calendar.getInstance();
//			//���� ���� ���Ǵµ� ���� ���� ���� �ñ��ϴٸ� ���� Ȯ��
//		
//		
//			//2.����, ��, ��
////		int year = calendar.get(Calendar.YEAR);
////		int month = calendar.get(Calendar.MONTH)+1;
//		int day = calendar.get(Calendar.DAY_OF_MONTH);
//		
//		
//		//�ش� ���� 1���� ���� ã��
//				//1. ����� ���� Ķ���� ����
//				calendar.set(year, month-1, 1); //���ϴ� �⵵, �� �ְ� �Ʊ� +1������ ��ǻ�Ͱ� ���� ������ 1 �����
//						// 22�� 3�� 1����
//					//���� ��¥�� getinstane�� ����ڰ� ���鶧���� Ķ����.set
////				System.out.println("����ڰ� ��¥����� : " +calendar.toString());
//			
//			
//				//2.int sweek = 3�� 1���� ���� ���ϱ�
//				int sweek = calendar.get(Calendar.DAY_OF_WEEK);
//					//1���� �������� ȭ�����̹Ƿ� 3�� ���´�.
////				System.out.println(sweek);
//			
//			
//				//3.3���� ������ ��
//				int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//		//		System.out.println(eday);
//			
//			
//				
//				
//			//3. ���
//		System.out.println("====="+year+"�� "+month+"�� "+day+"��"+"=====");
//		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
//		//�޷� ���鶧 �ݺ��� ������ ������ �߿��Ѱ� 1���� ��� ���� ������ ����**
//		//1��� ������ ������ �ݺ��� ������
//		
//		
//		
//			//���� �� 1���� ��ġ �տ� ���� ä���
//				//����� �Ѱ�ó��!! 2�� �ǳʼ� ȭ���Ͽ� 1 ���(���� 2�� ��� 1 ���)
//			for(int i = 1; i<sweek; i++);{ //���� ���ϱ��� ������
//								//3�� 1�� = ȭ = 3
//				//���Ϻ��� ȭ���ϱ��� -1�� �߰��ϰڴٴ� ��
//					 	System.out.println("\t");
//				}  //1�Ϻ��� ������ ������ ���
//				//2���� �ݺ����� ������ ���� ���
//			
//			
//			for(int i = 1; i <=eday; i++);{
//				
//				//���� üũ
//		//		if(i == day) System.err.print(i+"\t");
//		//		else System.out.print( i + "\t"); //i�� �ϼ��� ���
//				 //����ϸ��� ������ �����Ƿ� ����ؼ� ��������
//					//������� 7�̹Ƿ� ������ 7������� ����
//				
//					if( sweek % 7 == 0)	//7�� ��� ã��
//						System.out.println(); //������� �ٹٲ�
//					sweek++; //�Ϸ羿 ������ ����
//					
//			}
		
		////////////////////////////
	
		
		
/////////////////////////////////		
	}
	
	
	//1. �޷� �޼ҵ�
		//���� ��, Ŭ���� ��
	public static void �޷�(int year, int month) {
		//�̰� ���� �� �ȿ� ����
	
		
	while(true) {	
		//���ѷ��� �߰�
				
			
			//1. Ķ���� Ŭ���� �� ���� ��¥/�ð� ��ü ȣ��
			Calendar calendar = Calendar.getInstance();
				//���� ���� ���Ǵµ� ���� ���� ���� �ñ��ϴٸ� ���� Ȯ��
			
			
				//2.����, ��, ��
		//	int year = calendar.get(Calendar.YEAR);
		//	int month = calendar.get(Calendar.MONTH)+1;
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			
			
			//�ش� ���� 1���� ���� ã��
					//1. ����� ���� Ķ���� ����
					calendar.set(year, month-1, 1); //���ϴ� �⵵, �� �ְ� �Ʊ� +1������ ��ǻ�Ͱ� ���� ������ 1 �����
							// 22�� 3�� 1����
						//���� ��¥�� getinstane�� ����ڰ� ���鶧���� Ķ����.set
		//			System.out.println("����ڰ� ��¥����� : " +calendar.toString());
				
				
					//2.int sweek = 3�� 1���� ���� ���ϱ�
					int sweek = calendar.get(Calendar.DAY_OF_WEEK);
						//1���� �������� ȭ�����̹Ƿ� 3�� ���´�.
		//			System.out.println(sweek);
				
				
					//3.3���� ������ ��
					int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			//		System.out.println(eday);
				
				
					
					
				//3. ���
			System.out.println("===== "+year+"�� "+month+"�� =====");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			//�޷� ���鶧 �ݺ��� ������ ������ �߿��Ѱ� 1���� ��� ���� ������ ����**
			//1��� ������ ������ �ݺ��� ������
			
			
			
				//���� �� 1���� ��ġ �տ� ���� ä���
					//����� �Ѱ�ó��!! 2�� �ǳʼ� ȭ���Ͽ� 1 ���(���� 2�� ��� 1 ���)
				for(int i = 1; i<sweek; i++);{ //���� ���ϱ��� ������
									//3�� 1�� = ȭ = 3
					//���Ϻ��� ȭ���ϱ��� -1�� �߰��ϰڴٴ� ��
						 	System.out.println("\t");
					}  //1�Ϻ��� ������ ������ ���
					//2���� �ݺ����� ������ ���� ���
				
				
				for(int i = 1; i <= eday; i++ ) {
					
					//i�� �ϼ��� ���
					System.out.print(i+"\t");
					
			//		else System.out.print( i + "\t"); 
					
					 //����ϸ��� ������ �����Ƿ� ����ؼ� ��������
						//������� 7�̹Ƿ� ������ 7������� ������
						if( sweek % 7 == 0)	//7�� ��� ã��
							System.out.println(); //������� �ٹٲ�
						sweek++; //�Ϸ羿 ������ ����
						
				}
			
				
				
				
				//��ư �ϳ� ����� 1. ������ 2. ������ 3. �ٽð˻�
				

			//�࿩ ���ܰ� ������ �ʵ��� try catch �־����
			try {//���� try{} �ȿ��� ����(����)�� �߻��ϸ� catch�� �̵��Ѵ�.
						//�ڵ� ������ �ƴ϶� ����� ��� ���� ����Ͽ� ���α׷� �ٿ��� ���.
				
				System.out.println("\n 1. ������ 2. ������ 3. �ٽð˻� 4. ����");	
				Scanner scanner = new Scanner(System.in); int  ch =scanner.nextInt();
				//�Է°�ü ����
				//���ѷ��� �ʾ�!!!!!!!!!!!!
				
				if(ch == 1) { month -= 1;
					//month���� -1�� ��´�. -=�� �̿��ؼ� ��ƾ���.
					// ��� �� ���嵵 �ʾ�
				
					//���� ���� 0�� �Ǹ� ������ 1�� �����ϰ� ���� 12�� �ǵ��� �����.
						if (month == 0) {
							year -= 1; month = 12;
						}
				
				} else if (ch == 2) { month += 1;
					//+= : ���ϰ� �����϶�� �� (���Կ�����)
						if (month == 13) //���� month�� 13�̸� month�� 1�� ����� ������ +1�� ����
							{ month = 1; year += 1; }				
				
				} else if (ch == 3) {
					System.out.print("���� : "); year = scanner.nextInt();
					System.out.print("�� : "); month = scanner.nextInt();
					
				} else if (ch == 4) {
					System.out.println("�޷� ���α׷� ����");
					break; //����
					//�������� �ڵ尡 �����Ƿ� �޼ҵ� ����
				}
		
		// **************************
			} catch (Exception e) { //���� try���� ���ܰ� ���� ��� �ش� �ڵ带 ���
				System.err.println("�������� �Է��� ���ּ���."); }
			
		
		
		} //while end
		
		
		
	} //void end
	
	
} // class
