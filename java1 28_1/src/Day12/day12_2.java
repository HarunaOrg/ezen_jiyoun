package Day12;

public class day12_2 {
	public static void main(String[] args) {
		
		
		//String �޼ҵ�
		// 499 charAt(); : ���ڿ����� Ư������ ����
		String ssn = "010624-1230123"; //�ֹε�Ϲ�ȣ
		char sex = ssn.charAt(7);
		switch(sex) { //���̽��� �Է��ϰ� ��¹� �ۼ�
		//switch ��� [ switch �˻��� ]
			case '1' : //���� ���� 1, 3�̸�
			case '3' : System.out.println("����"); break;
			case '2' : //���� ���� 2, 4�̸�
			case '4' : System.out.println("����"); break; //break�ʼ�
		}
		
		//501 equals() : ���ڿ� ��
			//�⺻�ڷ��� ����ϴ� ������ ������ ��밡�� [ == ]
			//String Ŭ���� ����ϴ� ��ü�� == ������ ���Ұ��� [ equals ]
		
		
		//�ڹ� �޸� [ jvm ]
			//���� �޸� : ��������
			//�� �޸� : ��ü
			//�޼ҵ� : 
		//������ ���� �ּҰ��� ������ ����.
		//new ��ü�� ���� �� ������ ����ȴ�.
		//���ÿ� ����[����ġ=���޸��ּ�] = ���� ����
		
		
		
		//1.���ڿ� ���� []
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö"; //String�� new��� ok. �ڵ����� ��ü ������ �ȴ�.
		
		//2.���ڿ� ��
		if(strVar1 == strVar2) { //���ڿ� == �Ұ���. ==�� ���ּҰ� �������� �񱳸� ��
			System.out.println("���� String ��ü�� ����");
		} else { //502
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
		
		//3.
		if(strVar1.equals(strVar2)) { //  equals�� �� ������ ���Ѵ�.
			System.out.println("���� ���ڿ��� ����");
		} else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}
		
			
		
		
		//502 (���� ����ó������ ���)
		//getBytes() : ���ڿ� -> ����Ʈ�� ��ȯ
		String str = "�ȳ��ϼ���"; //������ҹ��� 1����Ʈ, �ѱ�2����Ʈ
		
		
		byte[] bytes1 = str.getBytes(); //���ڿ� -> ����Ʈ�� ��ȯ
		System.out.println("����1bytes �ѱ�2bytes : " + bytes1.length);
		//�迭��.length : �迭
		
		
		//����Ʈ�� -> ���ڿ� ��ȯ *******************************
		String str1 = new String(bytes1);
		System.out.println("����Ʈ�� -> ���ڿ� :" +str1);
		
		
		try {
			// 1.���ڵ�Ÿ��[���ڵ�/���ڵ� : ��ȯ ���]
			
			//1. EUC-KR �ѱ�/���� �ѱ� 2����Ʈ
			//����ó��
			byte[] bytes2 = str.getBytes("EUC-KR"); //�Ϲݿ��� �߻�
			System.out.println("EUC-KR ���� : "+bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("����Ʈ�� -> ���ڿ� :"+str2);
			
			//2. UTF-8
			//ũ�� Ŭ���� �� ���� ǥ��. ������ ���; �ѱ� 3����Ʈ
			byte[] bytes3 = str.getBytes("UTF-8"); //�Ϲݿ��� �߻�
			System.out.println("UTF-8 ���� : "+bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("����Ʈ�� -> ���ڿ� :"+str3);
			
		} catch(Exception e) {}
		
		
		//504
		
	System.out.println("=====================================");
		
		//indexOf(): ���� ��ġ[�ε���] ã��
		String subject = "�ڹ� ���α׷���";
		
		//Ư�� ���ڷ� ���ڿ� �� Ư�� ��ġ(�ε���) ã��
		
		//**�˻������� ���� ����
		int location = subject.indexOf("���α׷���");
		System.out.println(location); //3�� �ε�������  ���α׷��� ã��
		
		//���ڿ��� Ư�����ڿ� ��ġ(�ε���) ã�� / ���� ������ -1��.
		
		if(subject.indexOf("�ڹ�") != -1 ) //�ε����� 0����
		{	//-1���̶�� �� �ε����� ���ٴ� ��
			System.out.println("�ڹٿ� ���� å");
		} else {
		System.out.println("�ڹٿ� ���� ���� å");
		}
		
		
		//505
		//length() : ���ڿ� ����
		String ssn2 = "7306241230123";
		int length = ssn2.length(); //���ڿ� �� ���� ����(���� ���ϱ�)
		
		//�ݺ���, ��ȿ�� �˻翡�� �ַ� ����Ѵ�.
		if(length == 13) { //���� ����(���ڼ�)�� 13���� �̸�
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
			//�ƴϸ�
		} else { System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�."); }
		
		//ȸ�������Ҷ� ��ȿ���˻� �ʼ�(�ߺ�üũ)
		
		

		
		System.out.println("=====================================");
		//506 replace("��������", "���ο��") : ���ڿ� ��ġ[����]
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
					//���ڿ�.replace("��������","���ο��")
		
		System.out.println("�⺻���ڿ� : "+oldStr);
		System.out.println("���ο�ڿ� : "+newStr);


		
		//507 Substring(): �ε��� ���� vs split() : ���� ���� [���ڿ� �ڸ���]
				
		//511 ����
		String ssn3 = "880815-1234567";
		
		String firstNum = ssn3.substring(0,6); //�����ε���, ������ �ε��� ��
		System.out.println("Ȯ�� : "+firstNum); 
		
		String secondNum = ssn3.substring(7); //�ε���~������ �ε���
		System.out.println("Ȯ�� : "+secondNum); 
		System.out.println("=====================================");
		//split
			// "880815-1234567" "-" ������ �������� �ڸ���� 2������ ����� �迭�� ��ȯ�˴ϴ�.
			// 0 �ε����� 880815�� ����ǰ� 1�� �ε������� 1234567�� ����ȴ�.
		System.out.println("�պκ� : "+ssn3.split("-")[0] ); //0:ù��°�̴�.
		
		
		
		//508
			//�������ڿ�.toLowerCase("����") -> ���� [�ҹ��ڷ� ��ȯ]
			//�������ڿ�.toUpperCase("����") -> ���� [�빮�ڷ� ��ȯ]
		
		
		//509
			//���ڿ�.trim() : �յ� ��������[]
		//�ʹ� ������ ����x
		
		
		//510
			// valuOf() : �⺻Ÿ��[int,double ��] -> ���ڿ� ��ȯ
		String str2 = String.valueOf(10); //int�� 10 -> String 10���� ��ȯ
		String str3 = String.valueOf(10.5); //double�� 10.5 -> String 10.5���� ��ȯ
		String str4 = String.valueOf(true); //boolean�� true -> String true�� ��ȯ
		String str5 = 10+""; //10���Ӥ� �θ� �� ������ " "�� ���̸� �ȴ�. ���������μ� ����+����=���� �� �����.
		
		System.out.println(str2+10); //����+���� : ����		
		System.out.println(str3+10);
		// if(str4) ���� : str5���� boolean���� �ƴ� ������ true ����
		
		
		/////////////////////////
	}	
}
