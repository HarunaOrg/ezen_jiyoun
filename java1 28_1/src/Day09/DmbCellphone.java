package Day09; //day09_1 + Cellphone

public class DmbCellphone extends Cellphone {
	//����Ŭ����(�ڽ�)�� ����Ŭ����(�θ�)�� �����Ѵ�. ==> extends : ���
	//public class DmbCellphone �ڿ� extends Cellphone�� ���δ�.
		// ���� Ŭ������ ����Ŭ���� �� ��� ��� ����
	
	//1.�ʵ�
	int channel;
	
	//2.������
	public DmbCellphone(String model , String color, int channel) {
		this.model = model; //this.�ʵ��
		this.color = color; //this.�ʵ��
		//���� Ŭ������ ���� �ʵ��̹Ƿ� ����Ŭ���� �� ��� ȣ��
		this.channel = channel;
	}
	
	//3.�޼ҵ�
	void turnOnDmb( ) {
		System.out.println("ä�� "+ channel+"�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannel1Dmb( int channel ) {
		this.channel = channel;
		System.out.println("ä�� "+channel+"������ �ٲߴϴ�.");
	}
	void turnOffDmb( ) {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
	
	//����� �޾� cellphone ���� �͵��� �ٷ� ��� ���� (�ڽ��� �θ� ����)
	
}
