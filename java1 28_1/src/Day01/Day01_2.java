package Day01;

public class Day01_2 { // c s

	// 1. ���
		// 1. print() : ��¸�
		// 2. println() : ��� �� �ٹٲ� ����
		// 3. printf() : ����� �ٹ̱�
			// %s : ���ڿ� ��ü
			// %d : ���� ��ü
			// %f : �Ǽ� ��ü
		//  ����� [ \ : ���� ���� ��ȭ ��ȣ]
			// \n : �ٹٲ�
			// \t : �鿩����
		
	// System : �ý��� Ŭ���� [ ����� ���� ������� �ڵ� ���� ]
	// 2. out : ��� ��Ʈ��
	// 3. print() : ����Լ�
	// 4. ; : ���� �ڵ� ���˸�
	// * �ý��� Ŭ���� �� out �̶�� ��� ��Ʈ���� ���� print �Լ��� ����ؼ�
	// console( ctrl + F11 )�� ���ϴ� ��� ����� �� �ִ�.
	
	public static void main(String[] args) { // ms
		
		// 1. �⺻���
		System.out.print("�ϰ������");	// ; : �ڵ� ���� ����
		System.out.print("java 1����");	// ����ó�� " "
		System.out.print(123);	// ���� " " ó�� ����
			// * �̸� ������� �ܾ�[ ����� ]�� ������ ��� ���ڴ� " " ó��
		
		// 2. �ڵ��ϼ� ( syso + ctrl + space )
		System.out.println("�Ҹ�");
		System.out.println("�ڹ�Ĩ ����Ǫġ��");
		System.out.println(123);
		
		// 3. �������
		System.out.printf("%s", "�ϰ������");
		System.out.printf("java %d����", 1);
		
		// ����1 [ �⼮�� ]
		System.out.println("\n\t\t[[�⼮��]]");
		System.out.println("-------------------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t4����\t���");
		System.out.println("��ȣ��\t�⼮\t�Ἦ\t�Ἦ\t�⼮");
		System.out.println("���缮\t�⼮\t�⼮\t�⼮\t�⼮\t����");
		System.out.println("-------------------------------------------");
		
		// ����2 [ ����1 -> printf ]
		System.out.printf("\n\t\t%s","[[�⼮��]]\n");
		System.out.printf("-------------------------------------------\n");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s \n","�̸�","1����","2����","3����","4����","���");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s \n","��ȣ��","�⼮","�Ἦ","�Ἦ","�⼮"," ");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s \n","���缮","�⼮","�⼮","�⼮","�⼮","����");
		System.out.printf("-------------------------------------------\n");
		
		// ����1 : �����
		System.out.println("\\   /\\");
		System.out.println(")  ( '");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|\n");
		
		// ����2 : ������
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )  \"\"\"");
		System.out.println("|\"^\"'    |");
		System.out.println("||_/=\\\\__|");
		
	}// m e
	
} // c e
