package Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class day10_5_��������_����Ʈ���� {
	public static void main(String[] args) {
		
		
		//1.����Ʈ(��ü) ����
		ArrayList<book> booklist = new ArrayList<>();
		//����Ʈ Ŭ����<����Ʈ �ȿ� ������ Ŭ����>
			//<Ŭ����> : ����Ʈ �ȿ� ������ Ŭ������. �ش� Ŭ������ ���� ��ü�� ����Ʈ�� ����.
			//���̴� ����[ �⺻ : 10 ] �ڵ����� �þ�� �پ���.
		
	Scanner scanner = new Scanner(System.in);
	
		while(true) {
			System.out.println("1.��� 2.��� 3.���� 4.����");
			//�Է� �ް� if
			int ch = scanner.nextInt();
			if(ch==1) {
				//1. �Է� ����
			System.out.println("������ : "); String ������ = scanner.next();
			System.out.println("���� : "); String ���� = scanner.next();
			
			
				//2. ��üȭ(���� ������ �ϳ��� ��ü��.)
			book book = new book(������, ����);
					//�Է� ���� ���� ����

			
			
				//3. �迭 ���� [������ ã�Ƽ� ����] vs ����Ʈ [���� ã�� ����]
			booklist.add(book); //����Ʈ�� ����
			// why : add ��� �޼ҵ尡 ��� ��ü�� �߰��Ҷ� ���.
				// ������ �ε����� �ڵ������� ��ü�� �߰��ȴ�.
			
			}
			if(ch==2) {
				// 1.�迭[����(null) ����] vs ����Ʈ
				System.out.println("������ \t ����");
				for(book book : booklist) {
					System.out.println(book.get������() + "\t"+ book.get����());
				}	
			}
			
			if(ch==3) {
				// 1. �迭[���� �Ŀ� �� �ε��� ����] vs �ε���[�ڵ�]
				// 1 2 3 4 [2����] 1 null 3 4    vs    1 3 4
				System.out.println("������ ������ : ");
				String ������ = scanner.next();
				
				//���� ã��
				for(book book : booklist) {
					if(book.get������().equals(������)) {
						booklist.remove(book); break;
					}
				}
				
				
			}
			if(ch==4) {
				System.out.println("������ ������ : ");
				String ������ = scanner.next();
				for(book book : booklist) {
					
					if(book.get������().equals(������)) {
						
						System.out.println("������ �����̸� : ");
						String ���� = scanner.next();
						
						//setter���� getter �ҷ�����
						book.set����(����);
						break;
					}
				}
				
				
				
			}
			
		}
		
		
		
//////////////////////////////////
	}

}
