package Day09;

public class KumhoTire extends Tire {
	//����Ŭ���� extends ����Ŭ����
	
	//1.�ʵ�
	//2.������
	//��� ���� ���� ����
	public KumhoTire(String location, int maxRotation) {
	super(location, maxRotation);
	//���� Ŭ���� �� ������ ȣ��. ����:�ڵ� ���̱�
	
	}
	
	//3.�޼ҵ�
	
	
	@Override
	public boolean roll() {
		accumulatedRotation++; //�Ʊ� ����ߴ� ���̹Ƿ� ���� �ּ�x
		if(accumulatedRotation < maxRotation ) {
			System.out.println(location + "��ȣŸ�̾� ���� : "+ (maxRotation-accumulatedRotation));
		return true; }
	else { System.out.println("*** "+location+"��ȣŸ�̾� ��ũ ***");
		return false; }
	//�ѱ�Ÿ�̾ ������ ������
		
	}
}
