package Day07;

public class Member {
	// ��� Ŭ����
	
	//1. �ʵ�
		// �ϴ� �ʵ� ���� ���Ѵ�.
	int mno;	// ȸ����ȣ [ �ڵ���ȣ, �ߺ�x ]
	String id;	// ���̵� [ �ߺ�x ]
	String pw;	// ��й�ȣ
	String name; // �̸�
	String phone; // ����ó
	
 
	//2. ������
		// Ŭ������� �����ڸ��� ����
		// 1. �������[ �⺻������ ]
	public Member() {}
		// 2. ��� �ʵ带 �޴� ������
	//���콺 ��Ŭ��->�ҽ�->�Ʒ���3��° �ʵ� ������ ���ϴ� �� �ֱ�
	// ȸ�����Կ� ��ü ������
	public Member(int mno, String id, String pw, String name, String phone) {
		super();
		this.mno = mno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}

	
	//3. �޼ҵ�
		// ȸ������ [�μ�x��ȯo]
	boolean ȸ������() { // Ⱥ�� ���� true ���� false
		System.out.println("--------------ȸ������ ������--------------");
		//1. id pw name phone �Է� �޴´�.(4��) = �Ű����� �Է¹ޱ�
		System.out.print(" MEMBER ID : "); String id = Day07_5_BookApplication.scanner.next();
		System.out.print(" MEMBER PASSWORD : "); String pw = Day07_5_BookApplication.scanner.next();
		System.out.print(" MEMBER NAME : "); String name = Day07_5_BookApplication.scanner.next();
		System.out.print(" MEMBER PHONE : "); String phone = Day07_5_BookApplication.scanner.next();
			// scanner ��ü�� �̿��ϰ� �ʹ�! �׷��� �ٸ� Ŭ������ static���� ����Ǿ� �ִ�.
			//application�� static�� �ִµ� �̰� ��Ű���� �޶� �ҷ��� �� �ִ�. ���� ���� ���� �ʿ�x
			// static = ��� ��ü���� ��� ����.
			//����: Ŭ������.�ʵ�� ( Day07_5_BookApplication.scanner.next(); )

		
		// ���̵� �ߺ�üũ
		//�� :�ΰ�?
		for (Member temp : Day07_5_BookApplication.members) {
			if(temp != null && temp.id.equals(id)) {
				//���� ������ �ƴϸ鼭 �迭 �� id�� �Է¹��� id�� �����ϴٸ�
				System.out.println("�˸�) ���� ��� ���� ���̵��Դϴ�.");
				return false; //�Լ� ���� --> ���̵� �ߺ��Ǿ��� ������ ���Խ���(false)
			}
		} //boolean =idcheck ������� �ʾƵ� ������
		
		//////////// ȸ����ȣ �ڵ����� [ ���� �ֱٿ� ������ ȸ��(������ ȸ��)�� ��ȣ +1]
		int bno = 0; //ȸ����ȣ �����ϴ� ����
		int j = 0; //�ݺ�Ƚ�� = �ε���
	
		for(Member temp : Day07_5_BookApplication.members) { 
			
			//1. null�� ã�´�.
			//null�� ã�Ҥ��� �� null-1�� ������ ȸ���� �ȴ�.
			if (temp == null) //�ε��� ��ġ�� ã�� ���� int�� ���� �߰�
			{  	//j�� 0�϶� 1�� ������ -1�� �ǹǷ� ùȸ����? �ڵ����� ù��ȣ�� �־����..
				//ùȸ���̶�� �� �� �� �ִ� �����?
				
				if(j==0) {bno=1; break;} //�����ؾ���..
				//ù��° �ε����� null�̶�� �� ù��° ȸ���̶�� ������, ùȸ����ȣ�� 1�� ����
				// ù��° ȸ�� �ְ� �����Ƿ� break
				
				else { //ùȸ���� �ƴϸ� �Ʒ�
			//���� ã�¹�	
				bno = Day07_5_BookApplication.members[j-1].mno +1 ;
			//null(������ ȸ��)�� ã�� 1�� ���Ѵ�. 				//j(null)��°�� -1�� �Ѵ�.
			break; }	//return�� ���� ����!!!
				
			} j++;  //���� temp�� 0�̸� ������Ų��.
		}
		
		//2. 4������ -> ��üȭ -> 1��
		Member member = new Member(bno, id, pw, name, phone);
			// �˾Ƽ� ���� < public Member(int mno, String id, String pw, String name, String phone) >
			// �� �޾ƿ´�. �޾Ƽ� ���� ������ �����Ѵ�.
		int i = 0; // �ݺ� Ƚ�� [�ε��� üũ]
		
		for (Member temp : Day07_5_BookApplication.members ) {
			
			if (temp == null) { //����� ã��
				// �� �����̸� �� �ε����� ���ο� ȸ�� ����(�Ʒ� �ڵ�)
				Day07_5_BookApplication.members[i] = member;
				//���� �ٸ� Ŭ�������� ȣ���� �ϱ� ���� ������������ �� �ڵ� ���̴� ��.
				System.out.println(" �˸�)) ȸ������ ȸ����ȣ : " + bno);
				return true; // ȸ������ �޼ҵ� ���� ------------ ��ȯ�� true(������ �˸�)
				
			} i++; // i ����
		}
		//4. ���� true ���� false
		return false; // ȸ������ ���� ---------------��ȯ�� false
		
		//3. �迭�� �� ������ ã�� ���ο� ȸ��[��ü] �߰�
	}
	
 ///////////////////////////////////////////////////
	// �α��� [�μ�x��ȯo]
	String �α���() { // ������ true ���д� false. ������ ���̵� ��ȯ. / ���н� null ��ȯ
		//������ ���̵� ��ȯ���� �Ϲ�ȸ������ admin���� �� ��
		System.out.println("--------------�α��� ������--------------");
		System.out.print(" MEMBER ID : "); String id = Day07_5_BookApplication.scanner.next();
		System.out.print(" MEMBER PASSWORD : "); String pw = Day07_5_BookApplication.scanner.next();
		//scanner�� �� ������ �ʰ� ������ �´�.
		//�Է¹��� 2���� ȸ�����Խ� �Է��� ������ �����ϸ� �ݺ���for ������.
		for (Member temp : Day07_5_BookApplication.members) {

			// null�� �ƴϸ�(!=)�� �� �־���� ***
			if( temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {
				//������ �ƴϸ鼭 id�� pw�� �����ϵ���.
				return temp.id; } //�α��� �����ߴٴ� ��� �����
		} // for end

		// �α��� ������ �Է��� id ��ȯ, ���н� null
		return null; //���н� null ��ȯ
	}
	
		// ���̵� ã�� [�μ�x��ȯx]
	void ���̵�ã��() {
		System.out.println("--------------���̵� ã�� ������--------------");
		// 1. �Է� �ޱ� : �̸��� ����ó�� �޴´�.
		System.out.print(" MEMBER NAME : "); String name = Day07_5_BookApplication.scanner.next();
		System.out.print(" MEMBER PHONE : "); String phone = Day07_5_BookApplication.scanner.next();
		// �Է� ���� ���� ������ �Է��� �ִ��� Ȯ���Ѵ�(�α��ΰ� ����) : �Է� ���� ���� �迭���� ã�´�.
		for(Member temp : Day07_5_BookApplication.members) {
			if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {
				// ������ �ƴϸ鼭 �ش� ��ü �� name, phone�� �Է¹��� ���� �����ϸ�
			 System.out.println("�˸�) ȸ������ ���̵�� : " + temp.id + "�Դϴ�."); //ã�� id �ȳ�
			 return; // ������ ���� ã������ �ش� �޼ҵ� ����
			}
		}
		// ã�� ���Ͽ����� ���� ���
		System.out.println("�˸�) ������ ȸ�� ������ �����ϴ�.");	
	}
	
		// ��� ã�� [�μ�x��ȯx]
	void ��й�ȣã��() {
		System.out.println("--------------��й�ȣ ã�� ������--------------");
		
		for(Member temp : Day07_5_BookApplication.members) {
			System.out.print(" MEMBER ID : "); String id = Day07_5_BookApplication.scanner.next();
			System.out.print(" MEMBER PHONE : "); String phone = Day07_5_BookApplication.scanner.next();
			if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {
 // ���� �����ϰ� ����
			for(Member temp1 : Day07_5_BookApplication.members) {
				if(temp1 != null && temp1.name.equals(id) && temp1.phone.equals(phone)) {
				 System.out.println("�˸�) ȸ������ ��й�ȣ�� : " + temp1.pw + "�Դϴ�.");
				 return; // ������ ���� ã������ �ش� �޼ҵ� ����
				}
			}
		System.out.println("�˸�) ������ ȸ�� ������ �����ϴ�.");	
			}
		}
	}
	
		// Ż��
	
	
	
		// ȸ�� ����(�ð��Ǹ�)
	
	
	
}
