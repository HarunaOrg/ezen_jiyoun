package test;

import java.util.Scanner;

public class Board { //����ϴ� ��
	public static void main(String[] args) {

		//�л� �̸�,���� �Է� �޾Ƽ� ����,���,���� ��Ÿ����
		//�����ϰ� �Ǿտ��� ����ǥ ����ϱ�
		//��� ���� �����
		
		Scanner scanner = new Scanner(System.in);
		
	// 	Controller.load(); //��� �Խù� �ҷ�����
		
		
	while(true) {

		try {
			System.out.println("===========����ǥ============");

		//	System.out.println("��ȣ �̸� ���� ���� ���� ���� ��� ����");
			
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%.1f\t%s \n",
						"��ȣ","�̸�","����","����","����","����","���","����");
				
				System.out.println("==========================");
				//��ȣ�� ����Ǵ� ������ �ε��� ó��

				int i = 0; //����Ʈ �� �ε���
				for (student student : Controller.studentlist) {
					System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%d \n", i,
							student.getIndex(),
							student.get�̸�(), student.get����(),
							student.get����(), student.get����(),
							student.get����(), student.get���(),
							student.get����());
						i++; } // for end
				
			
			System.out.println("�޴� : 1. �л����� ��� 2.�л����� ����"); int ch = scanner.nextInt();
			
			scanner.nextLine();
			//���� ������� �߶���
			
				if(ch == 1) { System.out.println("===== �л����� ��� =====");
				System.out.println("��ȣ : "); int index = scanner.nextInt();	
				System.out.println("�̸� : "); String �̸� = scanner.next();			
				System.out.println("���� : "); int ���� = scanner.nextInt();
				System.out.println("���� : "); int ���� = scanner.nextInt();
				System.out.println("���� : "); int ���� = scanner.nextInt();
				
				//����� �ѱ��(�μ� ����)
				Controller.write(index, �̸�, ����, ����, ����);
				
				} else if (ch == 2) { System.out.println("===== �л����� ���� =====");
				System.out.println("������ �л� ��ȣ : "); int index = scanner.nextInt();
				System.out.println("������ �л� �̸� : "); String �̸� = scanner.nextLine();	
					boolean result = Controller.delete(index, �̸�);{
					if(result) System.out.println("���� ����");
					else System.out.println("���� ����.�ٽ� �Է����ּ���.");
					}
				}
				else { System.out.println("�ٽ� �Է����ּ���."); }
			
	
			
			} catch(Exception e) { System.out.println("�ٽ� �Է����ּ���.");
				scanner = new Scanner(System.in);
				
			}
			
	}
		
		
		
////////////////////////////////////////////////////
	}
}
