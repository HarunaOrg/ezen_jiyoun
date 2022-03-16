package Day11;

import java.util.Scanner;

import Day10.book;

public class day11_4_BoardApp {
	/*�Խ��� + ��۴ޱ�
	 * 	[m]�Խù� Ŭ����
	 * 		����, ����, �ۼ���, �ۼ���, ��ȸ��
	 * 		��� ����Ʈ
	 * 	[m]��� Ŭ����
	 * 		����, �ۼ���, �ۼ���
	 * 	[c]��Ʈ�ѷ� Ŭ����
	 * 		���, ����, ����, ����, ����, ��� ����
	 * 		�Խù� ����
	 * 	[v]day11_4_BoardApp Ŭ����(����ó���� ����� v���� ������)
	 * 		����� [ �Է¹޾� ��Ʈ�ѷ����� �Է¹��� �� ���� ]
	 */
	
	 public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in); //�Է°�ü
		 
		 Controller.load(); //����[��� �Խù�]�ҷ�����
		// System.out.println("Ȯ�� : " +Controller.boardlist);
		 
		 
	while(true) {
		
		try { //���ܹ߻� : ����� ���� �Է½� ���ܹ߻� -> catch �̵�
			
			
			//��� �Խù� ���
			System.out.printf("%s\t%s\t%s\t%s\t%s\t \n","��ȣ","����","�ۼ���","�ۼ���","��ȸ��");
			//��ȣ�� ����Ǵ� ������ �ε��� ó��
			
			int i = 0; //����Ʈ �� �ε���
			for (Board board : Controller.boardlist) {
				System.out.printf("%s\t%s\t%s\t%s\t \n", i, board.getTitle(),  board.getWriter(),
						board.getDate(), board.getViewcount() );				
						//"��ȣ","����","�ۼ���","�ۼ���","��ȸ��");
				i++;
			}
			
			
			
						
			/////////////////////
			//Controller.boardlist(); //��ü ���� �޼ҵ� ȣ���� �Ǵ� ���� : static
			System.out.println("1.���� 2.����"); int ch = scanner.nextInt();
			
			//�ؽ�Ʈ���� : ���� ���� �Է� ����
			//but �ؽ�Ʈ���� �տ� �ϴ� next �ϳ��� ���
			//�ذ��� : �Ϲ� �ؽ�Ʈ�� �ؽ�Ʈ ���� ���̿� �ǹ̾��� �ؽ�Ʈ���� �߰�
		scanner.nextLine(); //<-(�������)
		
		
		if(ch == 1) { System.out.println("===== �Խù� ��� =====");
				System.out.print("���� : "); String ���� = scanner.nextLine();			
				System.out.print("���� : "); String ���� = scanner.nextLine();
				System.out.print("�ۼ��� : "); String �ۼ��� = scanner.next();
				System.out.print("��й�ȣ[����������] : "); String ��й�ȣ = scanner.next();
				
				//����� �ѱ��(�μ� ����)
				Controller.write(����, ����, �ۼ���, ��й�ȣ);
				
				
				
				
			} else if (ch == 2) {
				//�ش� �Խù� ��ȣ[�ε���]�� �Է� �޾� �ش� �Խù��� ������ ���
				System.out.println("�Խù� ��ȣ : "); int index = scanner.nextInt();
				
				//���ö��� get
				//�ش� �ε��� ���
				Board temp =  Controller.boardlist.get(index); // �ش� �ε����� ��ü�� �ӽ� ��ü [�ڵ� ���̱�]
				System.out.println("=====�Խù� ����=====");
				System.out.println("���� : "+ temp.getTitle());
				System.out.println("�ۼ��� : "+ temp.getWriter()+ "\n" + "�ۼ��� : "+ temp.getDate()+ "\n" + "��ȸ�� : "+ temp.getViewcount());
				System.out.println("���� : "+ temp.getContent());
				
				
				//������[����]
				
				//�޴�
				System.out.println("1.�ڷΰ��� 2.���� 3.���� 4.��۾���"); int ch2 = scanner.nextInt();				
				//�Է� ����
				if (ch2 == 1) {} //�׳� �ڵ尡 ������ �ݺ����� ���ư��°ǵ� �ڷΰ���ó�� ����
				
				
				else if (ch2 == 2 ) {
							//������ �ε��� ��ȣ, ����, ���� + �н����� üũ
									//���� : ������ � �ʵ��� �����͸� ������ ��

					System.out.println("�� �Խù� �н����� : "); String pw = scanner.next();
					
					scanner.nextLine(); //�Ϲ� next ���� nextline�� ����ϰ� �Ǹ� ���� �߻� [ ���� �� ��� ]
					
					System.out.println("���� ���� : "); String title = scanner.nextLine();
					System.out.println("���� ���� : "); String content = scanner.nextLine();
					
					Boolean result = Controller.update(index, pw, title, content); //������ �ε��� �ֱ�
					
					if(result) System.out.println("���� ����");
					else System.out.println("���� ����");
					
				}
				else if (ch2 == 3 ) { //�� �Խù��� �н����� ���� üũ
					System.out.println("�� �Խù� �н����� : "); String pw = scanner.next();
					//������ = �μ��� ������					
					boolean result = Controller.delete(index, pw); // ������ �ε��� ��ȣ, �н����� ->�μ��� �ȴ�.
					if(result) System.out.println("���� ����"); //result = true
					else System.err.println("���� ����(�н����� ����)");
					
				}
				else if (ch2 == 4) {
					Controller.replywriter(); // �ε��� ��ȣ, ��� ����, ��� �ۼ��� + ��� �н�����
					
				} else {}
				
				
				
				
			} else {}
		
		}catch(Exception e) { System.err.println( "����� �� ���� �Է��Դϴ�."); //�̰� �� ������ ���� ����
		 scanner = new Scanner(System.in); // trycatch�ϰ� ��ĳ�ʱ��� �ؾ� ��
		} //�ٽ� �޸� �Ҵ� [ ��� ������ ����� ]
		
	}
		 
		 
		 
		 
	/////////////////////////////////////////	 
	}
		
}
