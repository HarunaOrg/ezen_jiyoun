package Day03;

import java.util.Scanner;

public class Day03_4 {

	public static void main(String[] args) {
		
		// ��� : 1. if�� 2. switch�� (�뵵�� ������ �Ʒ��� ���� �������� ����)
			// if: ���˻�(true or false) ������ ����. �ƴϸ� ���� ����. / ����� ���� ������ ���� ���� ���
				// �̻� ����(>= ��) �� ����� �� ������ ����ġ�� �� ��
			// switch: ������ �˻� / ����� ���� ������ �ִ� ���(������ �� ������ �� ��. �����ؼ� �ӵ��� �� ������.)
					// ������ case�� ã���� ���๮�� ó���ϳ� �� �Ŀ� ���� case�� �̵��Ѵ�.
			// ����
				// switch(�˻���) {
				// case '��' : ���๮; ->case�� ������ �Է� ����. break;�� ���� �޾ƾ� �˻��� ��ġ�ϴ� �Ϳ� ����
				// default : ���๮; / (�� ��)
				// } ����
			// �ʼ�! break; : ���� ����� switch Ȥ�� �ݺ������� Ż��
		
		// ��1) ������ 90�� �̸� A, 80���̸� B, 70���̸� C. �� �� Ż��
		int ���� = 80;
		if ( ���� == 90)System.out.println("A");
		else if(���� ==80)System.out.println("B");
		else if(���� ==70)System.out.println("C");
		else System.out.println("Ż��");
		// �� �ڵ带 ����ġ�� ����
		switch( ���� ) {
		case 90 : System.out.println("A"); break; //���⿡ �극��ũ �߰�
		case 80 : System.out.println("B"); break; // if�� �����ϰ� �̿��ҰŸ� break �߰�. �ƴϸ� ����
		case 70 : System.out.println("C"); break;
		default : System.out.println("Ż��");		 break; }
		//���� ����� ����
		//if�� �ϳ���. switch�� �� �� �����
		
		//��2
		int ��ư = 3;
		switch(��ư) {
			case 1 : System.out.println("1������ �̵�"); break;
			case 2 : System.out.println("2������ �̵�"); break;
			case 3 : System.out.println("3������ �̵�"); break;
			case 4 : System.out.println("4������ �̵�"); break;
			default : System.out.println("����"); }
		
		//��3 ĳ����-����
		char ��� = 'B';
		switch(���) {
			case 'A' : // breake�� �����Ƿ� a�� ����Ǹ� b�� ���� ���ȸ�� ���
			case 'B' : System.out.println("���ȸ��"); break;
			case 'C' : 
			case 'D' : System.out.println("�Ϲ�ȸ��"); break;
			default : System.out.println("�մ�");   	}
		
		//��x���������̹Ƿ� �������� ������� �ʾƵ� ������ ������ �� ���� ����
		//��4 ��Ʈ�� ���ڿ�
		String ���� = "����";
		switch(����) {
			case "����" : System.out.println("700����"); break;
			case "����" : System.out.println("500����"); break;
			default : System.out.println("300����");			}
		
		// ����1) switch ����
		// ������ ������ �Է� �޾� ����� 90�� �̻��̸� a 80�� �̻��̸� b �������� Ż��
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� : "); int ���� = scanner.nextInt();
		System.out.print("���� : "); int ���� = scanner.nextInt();
		System.out.print("���� : "); int ���� = scanner.nextInt();
		int ��� = (����+����+����)/3;
		System.out.println("���:"+��� + "������/10" + ���/10 ); //10�� �ڸ��� ������ 1�� �ڸ��� ������ �ϱ�
		switch(���/10) { //���˻�(�̻������ʰ��̸�) ���ϹǷ� ���� �ֱ�. 1�� �ڸ����� �Ǵ�
			case 9 : System.out.println("A"); break;
			case 8 : System.out.println("B"); break;
			default : System.out.println("Ż��");		}
		
		
	} // me
} //ce
