package study4;

import java.util.Random;
import java.util.Scanner;

public class loto3 {
	
	/* �ζ� �Ǻ���
	1. ����� 6�� �� �Է¹ޱ� -> �迭 ����
		1. 1~45 ���� ���� �Է¹ޱ� �ƴϸ� ���Է�	2. �ߺ�x ���Է�
	2. ��÷��ȣ : ��ǻ�� ���� 6�� �߻� -> �迭 ����
		1. 1~45����	2. �ߺ�x
	3. ����� ��ȣ�� ��ǻ�� ��÷��ȣ�� ���ϼ��� ����
	*/
	
	public static void main(String[] args) {
		
		//������ ���� �ޱ�
		int[] mynum = new int[6]; int[] comnum = new int[6]; 

		Scanner scanner = new Scanner(System.in);

	//i�� 0�϶� 6���� �۰� 1�� �����Ѵ�.
		for(int i=0; i<6; i++) { System.out.println("1~45 ������ ���� �Է��ϼ��� : ");
		int num = scanner.nextInt();
			
		//������ ��� �Լ�
		boolean safe = true;
		
		//��ȣ�� 0~45 ���̰� �ƴ�
		if(num<1 || num>45) {System.out.println("�Ұ����� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
		i--; safe = false; } //��� ����
		
		for(int j=0; j<6; j++) { //�Է¼��ڰ� ����
			if(num == mynum[j])
		{ System.out.println("�̹� �Էµ� ��ȣ�Դϴ�. �ٽ� �Է����ּ���."); i--;}
		safe = false; } //��� ����
		
		//�ߺ��� �ƴϰ� �ùٸ� ��ȣ�� �Է��ϸ� �迭�� �����Ѵ�.	
		mynum[i] = num; } //for1 end
				System.out.println("\n �Է��� ��ȣ : ");
			for(int temp : mynum) {System.out.println(temp + "\t");}
		
				
				
	////////////////////// ��ǻ���� ��
		
		for(int i =0; i<6; i++)
		{Random random = new Random(); int num = random.nextInt(45)+1; //0~44�� +1
		
		//����Ͽ�����
		boolean safe = true;
			for(int temp : comnum) { if(num == temp) {
				i--; safe = false;} } if(safe) comnum[i] = num;} //for2 end
			System.out.println("\n comnum : ");
		for(int temp : comnum) {System.out.println(temp + "\t");}
		//���Ͽ� �� �迭�� ������ ���� ã�´�. 6�� ���ڸ� ���� ���ϰ� ��� �ε��׿� ���ؾ��ϹǷ� �������� ��� �ϳ��� ��. 6 6 �񱳴ϱ� �� 36�� �񱳵ȴ�.
			
		int same = 0; //���� ���� 0�̴�.
			for (int i = 0; i<comnum.length; i++) //length�� ���̸� ��� 1�� ������Ų��.
			{for (int j = 0; j<comnum.length; j++) { //j ��
				if(mynum[i] == comnum[j]) //���� ������ ������ ���� ����.
				{same++;} }			} //for3 end
			System.out.println("������ ���� ���� : "+same);


		
		////////////////////////////////
	}//main end

}
