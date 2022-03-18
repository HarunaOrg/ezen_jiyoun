package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class day13_4 {
	public static void main(String[] args) throws InterruptedException {
		
		//544
		// DecimalFormat Ŭ���� : ���� �����͸� ���ϴ� �������� ǥ��
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
				//���� : 0�̸� �ڸ����� 4��[���ڸ��� 0���� ä��]
					// #�̸� �ڸ����� ǥ��[���ڸ��� ä��� ���ϰ� �������� ��]
		System.out.println(df.format(num)); //�Ҽ��� ���ư�
		
		
		df = new DecimalFormat("0.00"); //0�� �ڸ����� �ǹ��ϰ� ���ڰ� ������ 0���� ä���.
		System.out.println(df.format(num));
		

		df = new DecimalFormat("000000000.000000000000"); //0�� �ڸ����� �ǹ�
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("#"); //#�� ���ڸ��� �������� �д�.
		System.out.println(df.format(num));

		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));


		//#�� �����Ͱ� �־�߸� ǥ��
		df = new DecimalFormat("#####.########");
		System.out.println(df.format(num));

		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));

		
		df = new DecimalFormat("-#.#");
		System.out.println(df.format(num));
		
		//�� ����. text �������� �ٲ��.
		
		
		//õ���� ���� ��ǥ (���� �ٸ���) ***���� �߿�. �������� �ʿ信 ����...
		//���࿡ �ݾ��� 0���̸�
		df = new DecimalFormat("#,##0��"); //0��
		System.out.println(df.format(0));
		
		df = new DecimalFormat("#,###��"); //0��
		System.out.println(df.format(0));
		
		df = new DecimalFormat("0,000��"); //0,000��
		System.out.println(df.format(0));

		
		df = new DecimalFormat("0.0E0"); //E : ��������
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("[��]+#,### ;[��]-#,###"); //��� ; ����
		System.out.println(df.format(num)); //����Ŭ�� �������� ��� ���� ǥ��/���� ����
		
		
		
		// ********* % : ��ǻ�ʹ� ������� �𸣱� ������ �Ϲ������� ���� 1:100%�� 0.5�� 50%, 0.05�� 5%�̴� �̷��� ����Ѵ�.
		//����Ҷ� % �������� ��ǻ�ʹ� ��...�Ҽ������� ����ؼ� �ֱ� (double ���� = 10 * 0.3
		
		
		df = new DecimalFormat("#,###%"); //õ���� ��ǥ
		System.out.println(df.format(num));

		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));

		
		
		/////////////547
		// MessageFormat Ŭ����
		
			/* DecimalFormat : ���� ���� ��ȯ
				SimpleDateFormat : ��¥ ���� ��ȯ
				MessageFormat : ���� ���� ��ȯ
			 */
		
		String id = "java";
		String name = "�ſ��";
		String tel = "010-123-4567";
		
		
						// {} ������ ���� ��ġ (0�� ���� ����)	
		//�߰�ȣ�� ���� : � ������ ����. %d�� ������
		String text = "ȸ�� ���̵� : {0} \n ȸ�� �̸� : {1} \n ȸ�� ��ȭ : {2} ";
		//�޼��� ������ ���� result �� ����
		String result = MessageFormat.format(text, id, name,tel);
		System.out.println(result);				//����, {0} {1} {2}
		
		
		//���� ����ó��x�̹Ƿ� +id+�� ����
		//���߿� DAO(������ ���̽�)���� ����� ����.. ����ϸ� �ڵ尡 ª����
		String sql = "insert info member values {0}, {1} ,{2})";
								//�ε��� ������ 0 1 2
		Object[] �迭 = {id, name, tel};
		String result1 = MessageFormat.format(sql, �迭);
		System.out.println( result1 );
		
		//�ϳ��� �������� ��
		
		
		
		
		/////////////JAVA 7���� ���� date  ���Ŀ��� �������� ��¥ aPI�� �߰� ���̴�.
		LocalDate currDate = LocalDate.now(); //new ��� �� ��. static�� ���� �ִ�.
		System.out.println("���� ��¥ : " + currDate);
		
		LocalDate currTime = LocalDate.now();
		System.out.println("���� �ð� : "+ currTime);
		
		/*
		Date ���� ��¥/�ð� : ������ �� �ǰų� �񱳱���� �����
		vs
		LocalDate : ���� ��¥
		LocalTime : ���� �ð�
		*/
		
		LocalDateTime currdatetime = LocalDateTime.now();
		System.out.println("���� ��¥.�ð� : "+ currdatetime);
		
		
		//�ð����
		Instant instant1 = Instant.now();
		Thread.sleep(10); //1�� ���. �ڵ� �帧�� 1�ʰ� ����
		//throw�� ����. �Ϲݿ��� ������ ���
		Instant instant2 = Instant.now();
		
			if(instant1.isBefore(instant2)) {
				System.out.println("instant1 �� ����");
			} else if (instant1.isAfter(instant2)) {
				System.out.println("instant2�� �� ����");
			} else { System.out.println("������ �ð� �Դϴ�."); }
		//���� �����ͷ� ���� �� ������ ������ ���̸� ��Ÿ��..
			
			//�̰� �� �� ����Ұ� ***
			System.out.println("�ð� �� : "+instant1.until(instant2, ChronoUnit.NANOS));
			//��ǻ�� �ð� ����Ҷ�                               ���뽺�� �Ἥ �ΰ����� ���.
						//�и��� : 1000/1��     ����ũ���� : 1000000/��      ������ : 1000000000/1��

			
			
			
			
			
			
			
			
			
			
			
	}
}
