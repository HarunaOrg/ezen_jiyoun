package Day09;

public class Cellphone { //day09_1
	//1. �ʵ�
	String model; String color;

	//2. ������
	
	
	//3. �޼ҵ�
	
	void powerOn() {System.out.println("������ ��ϴ�.");}
	//void�� ���� �μ��� ����. -> �� �� ������ �͵� ������ �͵� ����.
	//��ȯŸ�� �޼ҵ��(�μ�){�����ڵ�} //�μ���ȯx
	
	void powerOff() {System.out.println("������ ���ϴ�.");}
	
	void bell() {System.out.println("���� �︳�ϴ�.");}

	void sendvoice(String message) {System.out.println("�� : "+message);}
	//��ȯ ���� �޼ҵ��(�μ��� ����){}
	
	//��ȯŸ��=����Ÿ��
	
	void receiveVoice(String message) {System.out.println("���� : "+message);}
	
	void hangUp() {System.out.println("��ȭ�� �����ϴ�.");}
	
	//�޼ҵ��...Ʋ���� �׶� ���� �ؼ��ؼ� �˾ư���
	//extend ����ؼ� dmbcellphone Ŭ������ ���� ����.
	
////////////////////////////////////////////////////	
}
