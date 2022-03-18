package Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class day13_2 { //539 ��¥ Ŭ����
	public static void main(String[] args) {

		//Date Ŭ���� (java.util���� ����) : ������ �ý����� ��¥/�ð��� �˷��ش�.
		Date date = new Date(); //date ��ü ����
		System.out.println("���� ����/�ð� : "+date);
		System.out.println("��ü�����޼ҵ� : "+date.toString());
		//������Ʈ�� �ֻ����ε� tostring�� equals�� �ֻ��� Ŭ�������� ���۵� ��
		//�� �� �����ϰ� ����
		
		//��¥����, ��� ���� ����.
		//��¥/�ð��� ����(����=�ٹ̱�) ��ȯ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
								//������ �ȿ� ����(yy mm ��) �ֱ� **���� MM�� �빮�ڷ�
		//��¥�� ���� �����ϱ�
		System.out.println("��¥���ĺ��� : "+sdf.format(date));
						//���İ�ü.format(��¥��ü)
		//��¥ date ������ String�������� ��ȯ
		
		
		//540
			//calender Ŭ���� : �ü�� �ð����� ��¥/�ð��� ���� ����
		Calendar now = Calendar.getInstance(); //Ķ���� Ŭ���� �� ��ü ȣ��
			//�̹� Ķ���� Ŭ���� �� ��ü�� �����Ѵٴ� ���̹Ƿ� new�� ������� �ʴ´�.(��ü����x)
			//getinstance��� �޼ҵ带 ���� �̹� �ð��� �� ����������. Ķ������ ��ü�� �����ϹǷ� ȣ�⸸ ��
		
		//����
		System.out.println("���� : "+ now.get(Calendar.YEAR)); //�������� �ٷ� ���
							//�����´�. Ķ��������. �⵵��.
		
		//��
		System.out.println("�� : "+(now.get(Calendar.MONTH)+1));
		//0���� 11���� �����Ƿ� 1���� 0���� ���´�. ���� +1�� �ؾ߸� ����� ����
		//+1�Ҷ� ��ȣ �� �����
		
		//��
		System.out.println("�� : "+now.get(Calendar.DAY_OF_MONTH));
		//�� �������� �ϼ�
		
		//����
		System.out.println("���� : "+now.get(Calendar.DAY_OF_WEEK));
		//�� �������� �ϼ�.2:�� <�̷����̹Ƿ� 6=�� (�ѱ۷� �� �˷��� �翬�� �ѱ����� �� ����)
		
		//�׷��� ���ڷ� ��Ÿ�� ������ �ѱ۷� ��ȯ�Ϸ���?
		int week = now.get(Calendar.DAY_OF_WEEK);
		String ���� = null; //�ѱ� ������ ������ ������ ����� ����
		switch(week) {
			//���� case1�� ������ ���̸�? �ϰ� ���� �극��ũ �ʼ�
			case 1: ���� = "��"; break;
			case 2: ���� = "��"; break;
			case 3: ���� = "ȭ"; break;
			case 4: ���� = "��"; break;
			case 5: ���� = "��"; break;
			case 6: ���� = "��"; break;
			case 7: ���� = "��"; break;
		} System.out.println("����(�ѱ�) : "+ ����);
		
		
		//����/����
		System.out.println("����/����"+now.get(Calendar.AM_PM));
		//�������� ��������. ����=0 ����=1
		
		//�ѱۺ�ȯ
		int ampm = now.get(Calendar.AM_PM);
			String �������� = null;
				if(ampm == 0) �������� = "����";
				else �������� = "����";
			System.out.println("����/���� : "+��������);
		
		
		System.out.println("�� : "+now.get(Calendar.HOUR));
		System.out.println("�� : "+now.get(Calendar.MINUTE));
		System.out.println("�� : "+now.get(Calendar.SECOND));
		
		
		
		//���� �����ð�(�ٸ����� �ð赵 ���� �� ����.)
		ZonedDateTime ������ = ZonedDateTime.now(ZoneId.of("UTC"));
										//�� ���󸶴� ���̵� ����. (�ܿ�� ������ ���۸�)
			System.out.println("������ : "+������);
		������ = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
			System.out.println("���� �ð� : "+������);
		������ = ZonedDateTime.now(ZoneId.of("America/New_York"));
			System.out.println("���� �ð� : "+������);
		// **�빮�� ����
		
		
		
		
		
		
		
		
///////////////////////////////////////////
	}
}
