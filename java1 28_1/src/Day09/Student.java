package Day09;

public class Student extends People {
			//����Ŭ���� extends : ����Ŭ����
	
	//1. �ʵ�
	public int studentNo; //������Ʈ �ѹ�. �л� ��ȣ
	
	//2. ������
	public Student (String name, String ssn, int studentNo) {
		//�������� �����ؼ� ����Ѵ�.
	

		// �θ� Ŭ���� �� ��� �ʵ� �ʱ�ȭ(�� �ֱ�)

		//1. �ʵ� ���� super(name,ssn); < ����
		
//		this.name = name;
//		this.ssn = ssn;
		super(name, ssn);
		
		//2. ������ ���� ���� ���°� this.nn 
		
		this.studentNo = studentNo;
		
		//�� �� �ϳ� ���
	}
	
	//3. �޼ҵ�

}
