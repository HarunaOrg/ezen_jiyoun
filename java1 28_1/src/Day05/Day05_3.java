package Day05;

import java.util.Scanner;

public class Day05_3 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while (run) { //���ѷ��� �������� : 5��
			System.out.println("--------------------------------");
			System.out.println("1.�л� �� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------");
			System.out.println("���� : ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("�л��� : "); studentNum = scanner.nextInt();
				// �Է� ���� �л��� ��ŭ �迭 ���� ����
				scores = new int[studentNum]; //�Է¼���ŭ �迭�� ���̸� ����
			} else if(selectNo == 2) {
				for(int i = 0 ; i<scores.length; i++) { //�迭 �� ��� �ε��� ��ŭ �ݺ�ó��
					System.out.printf("scores[%d] : \n", i ); scores[i]= scanner.nextInt();
				}				
			} else if(selectNo == 3) { //�л� ���� ����ϱ�
				for(int i = 0 ; i<scores.length; i++) {
					System.out.printf("scores[%d] : %d \n", i , scores[i]);
				}								
			} else if(selectNo == 4) { int �ְ����� = 0; int ���հ� =0; double ������� = 0.0;
				for(int i = 0; i <scores.length; i++) {
					//�ְ����� ���ϱ�
					if(�ְ����� < scores[i] ) �ְ����� = scores[i]; //i��°�� �ε����� ������ ����
					// �����հ�
					���հ� += scores[i];
				}
				//������� ���ϱ�
				������� = (double)���հ�/scores.length;

				
			System.out.println("�ְ� ���� : " +�ְ�����);
			System.out.println("��� ���� : " +�������);
				
			} else if(selectNo == 5) {
				run = false; // run�� false�� �Ǹ� ����(break�� ����), �ݺ��� Ż��
			}	
		}
		
		System.out.println("���α׷� ����");
		
		
		//////////////////////////////////////////
	}

}
