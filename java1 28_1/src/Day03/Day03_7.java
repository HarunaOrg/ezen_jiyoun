package Day03;

import java.util.Scanner;

public class Day03_7 {
	public static void main(String[] args) {
		//Ȯ�ι���
		
		//���뺯�� [��𼭵� ����� �� �ִ� ����]
		boolean run = true ; // ���� ���� ���� / true=���� false=����
		int balance = 0; // ���ݾ�[���� �ȿ� �ִ� �ݾ�] ���� //���Ⱑ ����(1������ �ö��)
		Scanner scanner = new Scanner(System.in); //�Է°�ü
		
		//�ٸ��������� ������ �� ��ġ�� ������ ����. main ���̳� class �۵� ����(���� 3��) ->���߿��� �������� ������ ����
		
		while ( run ) { //while (true) {} : ���ѷ���. Ʈ�縦 ������ ���ѷ����� �ȴ�.
			System.out.println("---------------------------");
			System.out.println("1.���� 2. ��� 3. �ܰ� 4. ����");
			System.out.println("---------------------------");
			System.out.println("����>"); int ���� = scanner.nextInt();
			//�Է� ���� ���� ��������
			if (���� == 1 ) { //���࿡ �Է°��� 1�̸�
				System.out.print("���ݾ� : "); int ���ݾ� = scanner.nextInt();
				balance += ���ݾ�; // �Է� ���� ���ݾ��� ���忡 �ֱ�
			}
			else if (���� == 2 ) { //���࿡ �Է°��� 2�̸�
				System.out.println("��ݾ�"); int ��ݾ� = scanner.nextInt();
				// ���࿡ ��ݾ��� ���ݾ׺��� �� ũ�� �ܾ׺���. �ƴϸ� ��� ����
				if(��ݾ� > balance ) {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				else {
				balance -= ��ݾ�; //�Է� ���� ��ݾ��� ���忡�� ����
				}
			}
			else if (���� == 3 ) { //���࿡ �Է°��� 3�̸�
				System.out.println("�ܰ� : " + balance );
			}
			else if (���� == 4 ) { //���࿡ �Է°��� 4�̸�
				break; //if�� �ƴ϶� while�� ����������.[���ѷ��� ����]
			} else { //�׿�
				System.out.println("�� �� ���� ��ȣ");
			}
		}
		System.out.println("���α׷� ����");
		
	}

}
