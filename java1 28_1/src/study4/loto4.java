package study4;

import java.util.Random;
import java.util.Scanner;

public class loto4 {
	
	/* �ζ� �Ǻ���
	1. ����� 6�� �� �Է¹ޱ� -> �迭 ����
		1. 1~45 ���� ���� �Է¹ޱ� �ƴϸ� ���Է�	2. �ߺ�x ���Է�
	2. ��÷��ȣ : ��ǻ�� ���� 6�� �߻� -> �迭 ����
		1. 1~45����	2. �ߺ�x
	3. ����� ��ȣ�� ��ǻ�� ��÷��ȣ�� ���ϼ��� ����
	*/

	public static void main(String[] args) {
	
		
	int[] mynum = new int[6]; int[] comnum = new int[6]; 
	Scanner scanner = new Scanner(System.in);

	for(int i=0; i<6; i++) {  System.out.println("1~45 ������ ���� �Է��ϼ��� : ");
		int num = scanner.nextInt();
		
	boolean safe = true;

	if(num<1 || num>45) { System.out.println("�Ұ����� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
		i--;
		safe = false;
	} //if end
	
	for(int j=0; j<6; j++) { if(num == mynum[j])
	{ System.out.println("�̹� �Էµ� ��ȣ�Դϴ�. �ٽ� �Է����ּ���."); i--;}
	safe = false; }
	mynum[i] = num; } //for end
	
	System.out.println("\n �Է��� ��ȣ : ");
	for(int temp : mynum) {
		System.out.println(temp + "\t");
		}
	
	for(int i =0; i<6; i++) {Random random = new Random();
	int num = random.nextInt(45)+1; 
	
	boolean safe = true;
	
	for(int temp : comnum) {
		if(num == temp) {
			i--; safe = false;} 
		}
		
		if(safe) comnum[i] = num;}
		System.out.println("\n comnum : ");
	
	for(int temp : comnum) {System.out.println(temp + "\t");}

	int same = 0; 
	for (int i = 0; i<comnum.length; i++){
		for (int j = 0; j<comnum.length; j++) { 
			if(mynum[i] == comnum[j]) 
			{same++;} }
		} //for end
		System.out.println("������ ���� ���� : "+same);

		
	} // me

}
