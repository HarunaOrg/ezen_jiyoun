package Day09;

public class Computer extends Calcurator {
	//����Ŭ���� extends ����Ŭ����
	
	//1. �ʵ�
	//2. ������
	//3. �޼ҵ�
		//�������̵�[�θ� Ŭ������ �޼ҵ� ������(����)]
	//ctrl+space->����:�������̵�� �Ұ��� ���°�
	
	@Override //������ ����� ������ editer(��Ŭ���� �� ���� �������ִ� ��)�� ���� ���� ����
	// ����� �� �θ� ������ �ִ� �޼ҵ� ȣ��
	double areaCircle(double r) {
		System.out.println("Computer ��ü��  areaCircle() ����");
		return Math.PI * r * r;
	}
}
