package Day07;

import java.net.MulticastSocket;

public class Book {
	// ���� Ŭ����
	
	// 1. �ʵ�
	String ISBN;	// ISBN
	String bname; // ������
	String bwritter; // �۰�
	boolean brental; // �����뿩����
	String mid;	// �뿩��ID
	
	// 2. ������
		// 1. �������[�⺻������] : �޼ҵ� ȣ���
		// ctrl+space�� �ڵ��ϼ�
	public Book() { //�� �ؾ ����. �ʵ�� �ִµ� �� �ȿ� �ƹ��͵� ����. Ȱ��x �޼ҵ� ȣ���
		 
	}


		// 2. �û�����[��� �ʵ� �޴� ������] : �������
	// ��Ŭ�� �ҽ� �ʵ带 ���� ������ (���۴� ����)
	public Book(String iSBN, String bname, String bwritter, boolean brental, String mid) {
		ISBN = iSBN;
		this.bname = bname;
		this.bwritter = bwritter;
		this.brental = brental;
		this.mid = mid;
	} // �ʿ信 ���� �߰� ����
	
	
	// 3. �޼ҵ� (��� ��ȯ��x)
		//1. �����˻�
	void �����˻�() {
		
		//���� ����
//		System.out.println("------ ���� �˻� ������ ------");
//		System.out.print(" �˻��� ������ : "); String bname = Day07_5_BookApplication.scanner.next();
//		int index = Book.indexOf(bname);
//		if(index >= 0)  {System.out.println("�˻��� ���� : " + bname + "\n" + "�뿩 ����" );}
//		else {System.out.println("�˻��� ���� : " + bname + "\n" + "�뿩 �Ұ���" );}
		// å�� �뿩 ���̸� ���� ����, �ƴϸ� ���� �Ұ��� ******���� å�̸� ���ٰ� ������
	}

	
		//2. �������
	void �������() {
		System.out.println("------ ���� ��� ������ ------");
		System.out.print("ISBN\t������\t�۰�\t�뿩���ɿ���\n");
		
		for( Book temp : Day07_5_BookApplication.books) {
			if(temp != null) { //temp�� null�� �ƴϾ���� //������ �����ϸ�
			if(temp.brental) //temp�� �ִ� ��Ż�� true�̰ų� false�϶��� �ۼ�
				//�����뿩 ����. �ش� ���� �뿩���ΰ� true
			System.out.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwritter+"\t" + "����");
			else //�����뿩 �Ұ���. �ش� ���� �뿩���ΰ� false
			System.out.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwritter+"\t" + "�뿩��");
			}
		}
	}	
	
	
	//����� �α����� ����� �μ��� ����. �̰� ���� �뿩�� �ű�� �� �μ��� �����뿩�� �ٽ� ����.
		//3. �����뿩
	void �����뿩 (String loginid) { //�μ��� �޾Ƽ� ���⿡ string loginid ������*�߰�. ������ �Ϲ�ȸ�� �޼ҵ� �κ�
		System.out.println("------ ���� �뿩 ������ ------");
		System.out.print(" �뿩�� ������ : "); String bname = Day07_5_BookApplication.scanner.next();
		//���ǿ����� ���ڵ� ��µ� �װ� ISBN�̶�� �����ϸ� ����
	
		//���⿡ �ݺ��� i  �����ϰ� �ε��� �־� ����� ����� ����
		//�����ݳ��Ҷ� ������ �ƴ϶� i�� ã�� ����
		int i = 0;
		
		for( Book temp : Day07_5_BookApplication.books) {
			//�ӽ� ��ü : �迭�̸�. �迭 �� 0�� �ε���-������ �ε��� �ϳ��� �ӽ� ��ü ����
			
			//rental�� true�̸� ���� �뿩 ����. �׸��� ������ �ƴϾ�� �ϴ� null �߰�
			if(temp != null && temp.ISBN.equals(bname) && temp.brental) {
				System.out.println("�˸�) �ش� ������ �뿩�մϴ�.");
				Day07_5_BookApplication.books[i].brental = false;	// �뿩������ ����
				Day07_5_BookApplication.books[i].mid = loginid; //���� �α����� id ���� . �α��� �ʱ� �޴�*
				return; //�������� �����°� �߿�!
			} else { System.err.println("�˸�) �ش� ���� �뿩�� �����Դϴ�. [�뿩�Ұ�] "); 
			return; }
			
		} // �� ��
		System.err.println("�˸�) ������ �������� �������� �ʽ��ϴ�.");

	} 
	
	
		//4. �����ݳ�
	void �����ݳ�(String loginid) {
		System.out.println("------ ���� �ݳ� ������ ------");
		�����뿩���(loginid); //������ �ȳ�. �ް� �ѱ�� �ް� �ѱ��(loginid��!)
		System.out.println("���� �̸�"); String bname = Day07_5_BookApplication.scanner.next();
		for( Book temp : Day07_5_BookApplication.books) {
			if (temp != null && temp.bname.equals(bname)) {	
				if(temp.brental) {
				//�뿩��id�� ���� �α�����id�� �����ϸ�
				if(temp.brental) { //�뿩���� �ƴϸ�
					System.err.println("�˸�) �뿩�� ������ �ƴմϴ�.");
				} else { // �뿩���̸�
					System.out.println("�˸�) �ݳ��� �Ϸ�Ǿ����ϴ�.");
					// �ݳ� �� rental�� true. �뿩���� �뿩�������� ����
					temp.brental = true;
					temp.mid = null; //�뿩�� �����id�� �ٽ� ���� ���� [null]
					return;					
				}
			} else {
				System.err.println("�˸�) �뿩�� ������ �ƴմϴ�.");
			}
		}
		}

	}
	
		// ���� �α����� ȸ���� �뿩���� ������� ���� [�� ���� �뿩 ���]
	
	void �����뿩���(String loginid) {
		System.out.println("------ ���� �뿩 ��� ������ ------");
		System.out.print("ISBN\t������\t�۰�\t�뿩���ɿ���\n");
		
		for( Book temp : Day07_5_BookApplication.books) {
			if(temp != null && temp.mid.equals( loginid )) {
				// ���ΰ͸� �ҰŸ� temp�� �� ���̵� �־�� ��
				//������ �����ϸ鼭 �뿩id�� ���� �α��ε� ���̵�� ������
			System.out.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwritter+"\t" + "�뿩��");
			}
		}
	}
	
	
	
	
		//5. �������
	void �������() { //ISBN, ������, �۰�, �����뿩����, �뿩ȸ��

		//ȸ�����԰� ����ϰ� ¥�� ���� ������?
		System.out.println("------ ���� ��� ������ ------");
		// 1. �Է¹޾�
		System.out.print(" ����� ���� ISBN : "); String ISBN = Day07_5_BookApplication.scanner.next();
		System.out.print(" ����� ���� �̸� : "); String bname = Day07_5_BookApplication.scanner.next();
		System.out.print(" ����� ���� �۰� : "); String bwritter = Day07_5_BookApplication.scanner.next();
		
		// 2. ��üȭ
		// ��Ż�� true��. �뿩���� null��(�뿩ȸ�� id�� �� ��)
		Book book = new Book(ISBN, bname, bwritter, true, null); // ���߿� DB�� �ְ� �� ��
		
		//3. �迭 ����[�ֱ�]
		int i = 0; //�ݺ� Ƚ��
		// �ߺ� üũ
		for (Book temp : Day07_5_BookApplication.books ) {
			if (temp == null) { //����� ã��
				Day07_5_BookApplication.books[i] = book;
				System.out.println("�˸�)���� ����� �Ϸ�Ǿ����ϴ�.");
				return; // ��ȯ�� true(������ �˸�)				
			} i++; // �ε��� ����
		}
		
	}
		//6. ��������
	void ��������() {
		System.out.println("------ ���� ���� ������ ------");

	}

	
	
	
}
