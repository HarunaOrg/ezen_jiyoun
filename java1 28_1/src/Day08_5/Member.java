package Day08_5;

import Day08_5.Mobilebank;
import Day08_5.Member;


public class Member {

	// ��� Ŭ����
	
	//1. �ʵ�
	String id;	// ���̵� [ �ߺ�x ]
	String pw;	// ��й�ȣ
	String name; // �̸�
	String phone; // ����ó
	

	
	
	//2. ������
	public Member() {}

	public Member(String id, String pw, String name, String phone) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;	}

	
	//3. �޼ҵ�
		// ȸ������
	boolean ȸ������() { System.out.println("--------------ȸ������ ������--------------");
		//1. id pw name phone �Է� �޴´�.(4��) = �Ű����� �Է¹ޱ�
		System.out.print(" ID : "); String id = Mobilebank.scanner.next();
		System.out.print(" PASSWORD : "); String pw = Mobilebank.scanner.next();
		System.out.print(" NAME : "); String name = Mobilebank.scanner.next();
		System.out.print(" PHONE : "); String phone = Mobilebank.scanner.next();
		
		// ���̵� �ߺ�üũ
		for (Member temp : Mobilebank.members) {
			if(temp != null && temp.id.equals(id)) { System.out.println("�˸�) ���� ��� ���� ���̵��Դϴ�.");
				} return false; }
		return true; }

		
	// �α��� [�μ�x��ȯo]
	String �α���() { System.out.println("--------------�α��� ������--------------");
		System.out.print(" ID : "); String id = Mobilebank.scanner.next();
		System.out.print(" PASSWORD : "); String pw = Mobilebank.scanner.next();
		for (Member temp : Mobilebank.members) {
			if( temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {	//������ �ƴϸ鼭 id�� pw�� ����
				return temp.id; } }	return null; } //���н� null ��ȯ

	
	// ���̵� ã�� [�μ�x��ȯx]
	void ���̵�ã��() { System.out.println("--------------���̵� ã�� ������--------------");
		System.out.print(" NAME : "); String name = Mobilebank.scanner.next();
		System.out.print(" PHONE : "); String phone = Mobilebank.scanner.next();
		for(Member temp : Mobilebank.members) {
			if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {
			 System.out.println("�˸�) ȸ������ ���̵�� : " + temp.id + "�Դϴ�."); return; } }
		System.out.println("�˸�) ������ ȸ�� ������ �����ϴ�.");	 }
	
		// ��� ã�� [�μ�x��ȯx]
	void ��й�ȣã��() { System.out.println("--------------��й�ȣ ã�� ������--------------");
		for(Member temp : Mobilebank.members) {
			System.out.print(" ID : "); String id = Mobilebank.scanner.next();
			System.out.print(" PHONE : "); String phone = Mobilebank.scanner.next();
			if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {

				for(Member temp1 : Mobilebank.members) {
				if(temp1 != null && temp1.name.equals(id) && temp1.phone.equals(phone)) {
				 System.out.println("�˸�) ȸ������ ��й�ȣ�� : " + temp1.pw + "�Դϴ�."); return; } }
		System.out.println("�˸�) ������ ȸ�� ������ �����ϴ�.");	
			}
		}
	}

}
