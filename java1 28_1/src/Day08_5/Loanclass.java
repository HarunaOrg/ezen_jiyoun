package Day08_5;

import java.util.Scanner;
import Day08_5.Loanclass;

public class Loanclass {

	//���� Ŭ����
	
		// 1. �ʵ�
		int bank;	// ���¹�ȣ [ ����5, �ߺ�x ]
		int money; //�Ա� �ݾ�
		boolean loan; //���Ⱑ�� ����
		String loname; //�����ǰ �̸�
		String locontent; //�����ǰ ����
		String lolimits; //�����ǰ �ѵ�
		
		
		
		
		// ������(�����) ���� ��ǰ�� ����ϸ� ��ϵ� �����ǰ�� ȸ���� �����ؼ� ���� ���
				// �������� ���� ��� �޴� 1.��ǰ �̸� 2.��ǰ ���� 3. ���� �ѵ�(����)

		// 2. ������
		public Loanclass() {}
		//��ü ����
		public Loanclass(int bank, int money, boolean loan, String loname,
			String locontent, String lolimits) { super();
			this.bank = bank;
			this.money = money;
			this.loan = loan;
			this.loname = loname;
			this.locontent = locontent;
			this.lolimits = lolimits; }
		
		
		// 3. �޼ҵ�
		//���»��� //////////////////////////////////////
	void ���»���(String loginid) { System.out.println("------ ���� ���� ������ ------");
		System.out.println("���� ��ȣ 5�ڸ��� �Է��ϼ��� : "); int bank = Mobilebank.scanner.nextInt();
		System.out.println("���¿� �ʱ� �ݾ��� �Ա����ּ��� : "); int money = Mobilebank.scanner.nextInt();
		System.out.println("���¹�ȣ : "+bank+"�ʱ� �ݾ� : "+money+"\n ���°� �����Ǿ����ϴ�.");
		int i = 0; for(Loanclass temp : Mobilebank.loanclass) {
			if(temp == null) { //����� ã��
				Mobilebank.loanclass[i] = loanclass; return true;} i++;
		} return false; }


	// ���� ��� ////////////////////////////////////////////////////
		
	void ������(String loginid) {
	System.out.println("------ ���� ��� ������ ------");
		System.out.println("��ǰ �̸�\t��ǰ ����\t��ǰ �ѵ�\t��û ���� ����\n");
		System.out.println(loname+"\t"+locontent+"\t"+lolimits+"\t"+loan);
		int j = 0; for(Loanclass temp : Mobilebank.loanclass) {
			if(temp == null) { //����� ã��
				Mobilebank.loanclass[j] = loanclass; return true;} j++;
		} return false; }
	
	
	// ���� ��û ////////////////////////////////////////////////////

	void �����û(String loginid) {
		System.out.println("------ ���� ��û ������ ------");
		System.out.println("��û�� ���� ��ǰ : "); String loname = Mobilebank.scanner.next();
		for(Loanclass temp : Mobilebank.loanclass) {
			if(temp != null && temp.loname.equals(loname) && temp.loan) {
				System.out.println("�˸�) �ش� ������ ��û�մϴ�."); temp.loan = false; return;
			} else {System.out.println("�˸�) ���� ���� ��û�� �Ұ����� �����Դϴ�."); return;}
			System.out.println("�˸�) ������ ��ǰ�� �������� �ʽ��ϴ�.");}	}
	
		
	///////���� ���
		
	void ������(String loginid) { System.out.println("------ ���� ��� ������ ------");
	
	System.out.print(" ����� ���� ��ǰ �̸� : "); String loname = Mobilebank.scanner.next();
	System.out.print(" ����� ���� ��ǰ ���� : "); String locontent = Mobilebank.scanner.next();
	System.out.print(" ����� ���� ��ǰ �ѵ� : "); String lolimits = Mobilebank.scanner.next();
	System.out.print(" ����� ���� ��ǰ �Ⱓ : "); String years = Mobilebank.scanner.next();
		//��üȭ
//	Loanclass loanclass = new Loanclass(loname, locontent, lolimits, years, true, null);

	//�迭 ����
	int i = 0;
	for(Loanclass temp : Mobilebank.loanclass) {
		if (temp == null) {	Mobilebank.loanclass[i] = loanclass;
			System.out.println("�˸�) ���� ����� �Ϸ�Ǿ����ϴ�.");
			return;} i++;}
	}
	

///////////////////////////////////////////////////
		
}
