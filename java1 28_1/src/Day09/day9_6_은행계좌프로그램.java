package Day09;

import java.util.Scanner;

public class day9_6_����������α׷� {
	
	//����������α׷� [ ��� ] 
		//sub :  ��������, ��������, �ϳ�����
		// �� ��� : 1. ���»��� 2.�Ա� 3.��� 4.��ü 5.�����¸�� 6.����

	
		// main�ۿ��� �����ϴ� ���� : ��� Ŭ�������� ����ϱ� ���� static �迭�� ����
			//static ������ ���뺯���̸� ���α׷� ���� �� �޸� �Ҵ�. ���α׷� ���� �� �޸� �ʱ�ȭ
	public static day9_6_����[] ���¸���Ʈ = new day9_6_����[100];
	
	
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//�ִ��� �޸𸮸� �Ƴ��� ���� ���� �ۼ�
		
		while(true) {
			System.out.println("-------------���� �ý���-------------");
			System.out.println("1.���� ���� 2.�Ա� 3.��� 4.��ü 5.�� ���� ��� 6.����");
			//�Է��� �޾ƺ���. (��ĳ�� �ʿ�)
			int ���� = scanner.nextInt();
			
		//��Ʈ�ѷ� �޼ҵ� ȣ��� ��ü
			day9_6_������Ʈ�ѷ� ��Ʈ�� = new day9_6_������Ʈ�ѷ�();
			//�޸𸮸� �־��ְ� ȣ��
			
			
			if(���� == 1) { System.out.println("-----���� ��� ������-----");
			//���¹�ȣ�� ������
			System.out.println("��й�ȣ : "); String ��й�ȣ = scanner.next();
			System.out.println("������ : ");	String ������ = scanner.next();		
			System.out.println("���� ���� \n 1.���� 2.���� 3.�ϳ�"); int �����ȣ = scanner.nextInt();
			//�Է��� ���� ������Ʈ�ѷ� Ŭ������ �ű��.(�� 3��)

			
			//��Ʈ�ѷ� ����
			String ���¹�ȣ = ��Ʈ��.���»���(��й�ȣ, ������, �����ȣ); //�޼ҵ� ȣ��
			//�μ� 3���� �־��ְ� �޼ҵ� ��ȯ�� ���� = ���¹�ȣ Ȥ�� null
			
			
			//�޼ҵ� ���� �� �޽��� ���
			if(���¹�ȣ != null) { //result�� true�̸�
				System.out.println("���� ����");
				System.out.println("������ ���¹�ȣ : "+���¹�ȣ);
			} else {System.err.println("���� ��� ���� (�����ڿ��� ����)");}
			
			//result�� true�̸�
//			if(���¹�ȣ) {	System.out.println("���� ����"); // true;
//			} else { System.out.println("�˸�) ���µ�� ����");} //false//
			
				
			} else if(���� == 2) { System.out.println("-----�Ա� ������-----");
				System.out.println("���¹�ȣ : " ); String ���¹�ȣ = scanner.next();
				System.out.println("�Ա��� �ݾ� : "); 	int �Աݾ� = scanner.nextInt();
				//���� ��Ʈ�ѷ��� 2������ ������.
				
			boolean result = ��Ʈ��.�Ա�(���¹�ȣ , �Աݾ�);
			
			if(result) { System.out.println("�Ա� ����");
				
			} else {System.out.println("�Ա� ����. ������ ���°� �������� �ʽ��ϴ�.");}
					
				
			} else if(���� == 3) { System.out.println("-----��� ������-----");
			System.out.println("���¹�ȣ : " ); String ���¹�ȣ = scanner.next();
			System.out.println("��й�ȣ : " ); String ��й�ȣ = scanner.next();
			System.out.println("����� �ݾ� : "); 	int ��ݾ� = scanner.nextInt();
			// ���� ��Ʈ�ѷ� 3������ ������.
			
			int result = ��Ʈ��.���(���¹�ȣ, ��й�ȣ, ��ݾ�); //������ �����ʵ� �޾Ҵٰ� �Է�
			//�޼ҵ� ȣ�� : ��ü��.�޼ҵ��(�μ�1,�μ�2,�μ�3);
			
			if(result == 1) {
				System.out.println("�ܾ��� �����մϴ�.");
			} else if (result == 2) {
				System.out.println("��� ����");
			} else if (result == 3) {
				System.out.println("�ùٸ� ������ �ƴմϴ�.");
			}
			
			
				
			} else if(���� == 4) { System.out.println("-----��ü ������-----");
			System.out.println("���¹�ȣ : " ); String ���¹�ȣ = scanner.next();
			System.out.println("��й�ȣ : " ); String ��й�ȣ = scanner.next();
			System.out.println("��ü�ݾ� : "); 	int ��ü�� = scanner.nextInt();

			System.out.println("��ü���� : "); String �޴°��� = scanner.next();
////////////////////�ݴ�� ��(�̵� ����)
			
			int result = ��Ʈ��.��ü(���¹�ȣ, ��й�ȣ, ��ü��, �޴°���);			
			
			if(result == 1) {
				System.out.println("�ܾ��� �����մϴ�.");
			} else if (result == 2) {
				System.out.println("��ü ����");
			} else if (result == 3) {
				System.out.println("�޴� ���� ������ Ʋ���ϴ�.");
			} else if(result == 4) {
				System.out.println("������ ���� ������ �����ϴ�.");
			}
			
			
			
			} else if(���� == 5) { System.out.println("-----�� ���� ��� ������-----");
				System.out.println("������ : "); String ������ = scanner.next();
				//�޼ҵ� ȣ��
				day9_6_����[] �����¸�� = ��Ʈ��.���¸��(������);
			
				System.out.println("�˻��� ������ ���� ���¸��");
				int i = 1;
				for(day9_6_���� temp : �����¸��) {
					if(temp != null) //����Ʈ�� �̰� �� �ص� �ȴ�.
				System.out.println(i+ "�� ���¹�ȣ : "+ temp.get���¹�ȣ() );
				i++;}
				
			} 
			
			
			
			
			else if(���� == 6) { System.out.println("-----���� ������-----");
				
			} else { System.err.println("�߸��� �Է��Դϴ�.");}
			
			
		} //while end
		
		
		
		
//////////////////////////////////		
	}

}
