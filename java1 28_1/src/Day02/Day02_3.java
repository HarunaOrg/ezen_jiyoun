package Day02;

import java.util.Scanner;

public class Day02_3 {
	
	public static void main(String[] args) {
		
		// ���� 1 : �޿� ���
		// * �Է� -> ���� -> ��� -> ���
		// 1. �Է� ��ü �����.
		
		Scanner scanner = new Scanner(System.in);
		
		// 2. �Է� ���� ���� ������ �����Ѵ�. [�Է� ��ü�� �Է� ���� ������ ���� �����Ͱ� �����]
		System.out.print("�⺻�� �Է� : "); int �⺻�� = scanner.nextInt();
							// �Է°�ü��.nextInt() : int�� ������ ��������
							// �Է°�ü��.next() : ���ڿ� ������ ��������
		System.out.print("���� �Է� : "); int ���� = scanner.nextInt();
		
		// 3. ������ ����(���)�Ѵ�.
		int ���� = (int)(�⺻��*0.1); // int*double �Ŀ� int ������ ������ȯ(ĳ����)
		int �Ǽ��ɾ� = �⺻�� + ���� - ���� ; // 100%=1 10%=0.1
		
		// 4. ����Ѵ�.
		System.out.println("ȸ������ ���ɾ� : " + �Ǽ��ɾ�);
						// ���ڿ� + ������ ( ���� �� ������ ȣ�� )
						// + : 1. ���Ῥ���� ���� 2. ���ϱ� ����
		
		
		
		
	}

}
