package Day09;

public class Day09_3 {
	public static void main(String[] args) {
		
	//p.296~297
		//@override : ������
		//������ �μ��� �޼ҵ�� �Ұ���
		//����: ������ �޼ҵ带 ������[����]
		
	int r = 10; //������ ����
	//1.����Ŭ������ ��ü ����
	Calcurator calcurator = new Calcurator();

	//2.����Ŭ������ ���� ��ü�� �޼ҵ� ȣ��
	System.out.println("������ : "+calcurator.areaCircle(r));
	System.out.println();
		
	//1.����Ŭ������ ��ü ����
	Computer computer = new Computer();
	//2.����Ŭ������ ���� ��ü�� �޼ҵ� ȣ��
	System.out.println("������ : "+computer.areaCircle(r));
	//����Ŭ������ ����Ŭ���� �� �޼ҵ�� �ٸ���.
		
/////////////////////////////////////////////////////
	}

}
