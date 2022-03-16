package Day09;

public class Tire { //Ŭ���� ����. �θ�� ����� ����

	//1.�ʵ�
	public int maxRotation; //�ִ� ȸ����[ȸ�����ɼ�]
	public int accumulatedRotation; //���� ȸ����
	public String location; //Ÿ�̾� ��ġ
	
	//2. ������
	//��ü ���� �� �ʱⰪ�� ����.
	public Tire( String location, int maxRotation ) {
			//Ÿ�̾��� ��ġ�� �ִ� ȸ����.
		this.location = location; //�װ��� this, �� �ܺηκ��� ���޹��� �μ��� ���κ����� �����Ѵ�.
		this.maxRotation = maxRotation;
	}
	
	//3. �޼ҵ�
	public boolean roll() { //Ÿ�̾� ȸ�� ���� �޼ҵ�
		accumulatedRotation++; // ���� ȸ������ 1 ����. Ÿ�̾� ȸ��
		if(accumulatedRotation < maxRotation) {
			//���� ���� ȸ������ �ִ� ȸ�������� ������ ������ ���Ҵ�...�� ��. ���ų� ũ�� ������ ���ٴ� ��.
			System.out.println(location+"Tire ���� : "+(maxRotation - accumulatedRotation)+"ȸ");
			return true;
		} else { //�ƴϸ� ���� ����.
			System.out.println("***" + location + "Tire ��ũ"+"***");
			return false;
		}
	}
	
}
