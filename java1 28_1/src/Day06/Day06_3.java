package Day06;

import java.util.Scanner;

public class Day06_3 {
	// ȸ���� ���α׷� [Ŭ����]
	
		// 0. ȸ�� ���� -> ȸ�� Ŭ���� �����
			// 1. �ʵ� (���߿� ������, �޼ҵ嵵 �߰��ϰ� �� ��..����. �׷� ��  ������)
				// �ʵ�� ���̹� ���� (��ü�� ������ ������)
				// 1. ���̵� 2. ��й�ȣ 3. �̸� 4. ��ȭ��ȣ
		// 1. �ʱ�޴� [1. ȸ������ 2. �α��� 3.���̵�ã�� 4.��й�ȣ �G��]
			// 1. ȸ�����Խ�  �Է� �޾� ���� -> ���̵�, ��й�ȣ
			// 2. �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α��� ó��
			// 3. ���̵� ã��� �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ���
			// 4. ��й�ȣ ã��� ���̵�� ��ȭ��ȣ�� �����ϸ� ���
	
	public static void main(String[] args) {
	
		// ���� �����ϴ� ���� : main�޼ҵ带 ��� ������ ����ϱ� ���ؼ�.
						// ���� ������ {}�� ������ �Ҹ�ȴ�.
		
			Scanner scanner = new Scanner(System.in);
			Member[] memberlist = new Member[100];	// 1���� �迭
			// ���࿡ Ŭ������ ���� ��쿡��**String[][] memberlist = new Member[100][4]�� 2���� �迭�� ����Ѵ�.
			// ���� ��ü�� ������ ������ 2�� �迭 ������� �ʾƵ� �ȴ�.
			// Member Ŭ������ ������� ��ü(4��) 100���� ������ �� �ִ� �迭�� ǥ���� ��. =�� 400��
			
		while(true) { //���α׷� ���� while start

			System.out.println("-----------------ȸ����[Ŭ����]-----------------");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵� ã�� 4.��й�ȣ ã��");
			System.out.println(" ���� : "); int ch = scanner.nextInt();
			
			//Ŭ������ �޸� �Ҵ��Ҷ� �ݵ�� new 
			
			if(ch == 1) { // ȸ������
				// 1. id, pw, name, phone �Է� �ޱ� -> ���� 4��
				System.out.println("---------------ȸ������ ������---------------");
				System.out.println("���̵� : "); String id = scanner.next();
				System.out.println("��й�ȣ : "); String pw = scanner.next();
				System.out.println("�̸� : "); String name = scanner.next();
				System.out.println("��ȭ��ȣ : "); String phone = scanner.next();
			
				// 2. ���ε��� ���°� �ƴ϶� Ŭ����, ��ü���� ����.
				Member member = new Member();
				// member Ŭ������ ����� ����� �� ����� �ϳ� �� �����.
				// ȸ�� 1��� member �ϳ�. ������ ����� ������ ���� �迭�� �����Ѵ�.
				
				// 3. �Է� ���� ���� 4���� ��ü �� �ʵ忡 �����ϱ�
				member.id = id; //�Է� ���� �� ����ִ´�.
				// ��ü �� �ʵ� = �Է� ���� ���� �־��ش�. ��������~
				member.pw = pw; member.name = name;	member.phone = phone;
				
				// * ���̵� �ߺ�üũ
					// 1.�迭 �� ��ü �� �Է��� ���̵�� ������ ���̵� ã��
				boolean idcheck = false; //������ ����ġ��ư
				for(Member temp : memberlist) {
					//��� ��ü�� �ϳ��� ������ ��. ���� �Է��� ���̵�equals ������ �ߺ�
					// memberlist �迭 �� ��ü���� �ϳ��� temp�� ���� �ݺ�
					if (temp != null && temp.id.equals(id)) {
						//temp�� null�� �ƴҶ�,
						//���� �ش� ��ü �� ���̵� �Է� ���� ���̵�� ������
						System.err.println("�˸�) ��� ���� ���̵��Դϴ�."); //����
						idcheck = true;
						break; 
					}
				}
				
				// ���̵� �ߺ��� ���� ��� ���� (�ߺ� �ִ� ���ٸ� �ִ°��̹Ƿ� boolean.
				// �ߺ��� �� �ɸ��� false �ߺ��̸� true)
				if (idcheck = false); {
					//�ߺ��� ���� ��쿡 ����
					
				// 4. ������ ��ü�� �����ϴ� �迭�� ���� (�ݺ�)
					// 1. ������ �������� ���� ���� �ε����� ã�Ƽ� ���� �ε����� ��ü ����
					// �׷��� ������ �����Ⱑ �Ǿ� ���� �Է°��� ������Ƿ� �ݵ�� ���� ã����
				int i= 0; //�ε��� ��ġ ����;
				for( Member temp : memberlist ) { //temp�̸��� �ƹ��ų�. for���� Ȱ��
					//memberlist �迭 �� member ��ü �ϳ��� �����ͼ� temp�� ���� �ݺ�
					if (temp == null) { //���� temp�� null�̸� �ش� �ε����� ���� ������� ��ü�� �����Ѵ�.
						memberlist[i] = member; 
						System.out.println("�˸�) ȸ������ ����");
						break; //for�� ������. ������ ������ ��� ���鿡 ������ ��ü�� �����
				} i++; //�ε��� ����			
			} // for�� ��
		} //���̵� üũ
		} // ch1 if ��, ȸ������ end
			
			
			else if(ch == 2) {// �α���
				// 1. �Է� �ޱ�
				System.out.println("----------------�α��� ������----------------");
				System.out.println("���̵� : "); String loginid = scanner.next();
				System.out.println("��й�ȣ : "); String loginpw = scanner.next();
				// memberlist �ȿ� �Է� �޾Ƽ� ������ Member ��ü �� ��� �ִ����� ã�ƾ���
				// �ϳ��� ��, �� equals
				
				// 2. ���� �迭 [ȸ������Ʈ]�� �Է� ���� ���� ��
				boolean loginchek = false; // ture:�α��� ���� false:�α��� ���з� �ݺ��� ����
				//�α��� �ߴ��� �� �ߴ��� �ݵ�� ����� ���ܾ��Ѵ�. �α� üũ�� ���� ���� �������� �������� true�� ����ǥ�� �����
				for(Member temp : memberlist) {
					// memberlist �� 0�� �ε������� �� �ε������� �ϳ��� temp�� ����
					// temp�� null�� �ƴ� ��� �߰�. null�� �ƴ� ���� equals�� �Ѵٴ� �ڵ�
					if( temp != null && temp.id.equals(loginid) && temp.pw.equals(loginpw)) {
						System.out.println("�˸�) �α��� ����"); loginchek = true; } //�α��� �����ߴٴ� ��� �����
				} // for end
				
				//3. �α��� ���� ����
				if (loginchek == false) {System.out.println("�˸�)������ ȸ�������� �����ϴ�.");	}
				// ���� boolean�� ����� ����. true�� ��� ������				
			} //�α��� end
			
			
			else if(ch == 3) {// ���̵� ã��
					// 1. �̸��� ����ó�� �Է� �޴´�.
				System.out.println("----------���̵� ã��----------");
				System.out.println("�̸� : "); String name = scanner.next();
				System.out.println("����ó : "); String phone = scanner.next();
				
					// 2. �迭�� ������ �̸��� ����ó�� �ִ��� Ȯ���Ѵ�. (�α��ΰ� ����)
				boolean findcheck = false;
				for(Member temp : memberlist) { //Member �ڸ����� �迭�� �������� �����Ѵ�. string=x
					// temp�� ������ �ƴϸ鼭 -
					if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) ;				
					// 3. ������ ��ü�� ������ �ش� ���̵� ���
					{ System.err.println("�˸�) ���̵� ã�� ����");
					System.out.println("ȸ�� ID : " + temp.id);
					findcheck = true;
					break;
					}//if end
				} // for end
				
				// ���̵� ã�� ����, ���и� ������ ���ؼ� boolean
				
					// 4. ������ ���ٰ� ���
				if ( findcheck == false ) {
					System.err.println("�˸�) ������ ȸ�� ������ �����ϴ�. ");
				}
			}
			
			
			else if(ch == 4) {// ��й�ȣ ã��
				System.out.println("���̵� : "); String id = scanner.next();
				System.out.println("��ȭ��ȣ : "); String phone = scanner.next();
				boolean findcheck = false;
				for ( Member temp : memberlist) {
					if(temp != null && temp.equals(id) && temp.equals(phone)) {
						System.out.println("�˸�) ��й�ȣ ã�� ����");
						System.out.println("ȸ�� ��й�ȣ : " + temp.pw);
						findcheck = true; // ã������ true ����. ã�Ҵٴ� ���
						break;
					}
				}
				if (findcheck = false) {
					System.out.println("�˸�) ������ ȸ�� ������ �����ϴ�.");
				}
			} // ch4 else if end
			else { System.err.println("�� �� ���� ��ȣ�Դϴ�.");} 	
		} //���α׷� ���� while end
		
		
		
	/////////////////////////////////////////////////////////////
	} // me	

} // ce
