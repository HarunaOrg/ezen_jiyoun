package Day10;

public class day10_2 {
public static void main(String[] args) {
	
	/*�������̽�
		���� : "������ ����" �Ͽ� ������ ����� ����
			���� �ٸ� Ŭ������ ���� ��ü���� ������ �������� ����
		����o����(����)x = �߻�
			�������̽����� �����ϰ� �� Ŭ�������� �����Ѵ�. [������]
			�������̽��� ����x
		��) �������̽� : ����Ű, A��ư, B��ư
			1. ö�ǰ��� Ŭ���� A��ư ���� B��ư ���
			2. �౸���� Ŭ���� A��ư �� B��ư ���
	*/
	
	//1.�������̽� ��ü ����
	RemoteControl rc;
	//�������̽��� ��ü��
	//2. �������̽��� �ڷ����� Ŭ���� �޸𸮸� �Ҵ��ϴ� �� 
	rc = new Television();
	///3. �������̽� ����
	rc.trunOn(); //tv ���� �޼ҵ�
	rc.trunOff(); //tv ���� �޼ҵ�
	rc.setVolume(10); //tv ���� ���� �޼ҵ�
	
	//4. �������̽� �� Ŭ���� �޸� ��ü
	//����� Ŭ���� �޸� �Ҵ�[��ü]
	rc = new Audio();
	
	//5.�������̽� ����
	rc.trunOn();
	rc.trunOff();
	rc.setVolume(5);
	
	//** �͸� ���� ��ü
	// Ŭ���� ���� �������̽� �߻� ������ �����Ѵ�.
	RemoteControl rc2 = new RemoteControl() {
		
		//�߻����ΰ� �����ϰ� ����� ����
		@Override
		public void trunOn() {
			System.out.println("�������� �մϴ�.");
		}
		
		@Override
		public void trunOff() {
			System.out.println("�������� ���ϴ�.");
		}
		
		@Override
		public void setVolume(int Volume) {
			System.out.println("���� ���� : " +Volume);
		}
	};
			//�������̽� ��ü�� = new �������̽���
	
	rc2.trunOn();
	rc2.trunOff();
	rc2.setVolume(10);
	
	
	//����Ʈ �޼ҵ� ȣ��
	
	rc2.setMute(true); //�̹� �������̽����� ������ �Ǿ��ִ� �޼ҵ�
	
	//���� �޼ҵ� ȣ��
	RemoteControl.changeBattery(); //��ü���� ����.

	//�޸𸮸� �Ҵ� �޴� ���
		//�޸� �Ҵ� �ؾ��ϴ� ����
			//�ܺ�Ŭ���� �������̽� ��
			//�ʵ�(���� ����), �޼ҵ�(���� ����) ����
	// new, static �����ڸ� ����� ��ü �����ϰų� ���� ������ ���ų�
	//
	
	
	
	
	//�ڵ庸��
	
	//////////////////////////////////////////
	}
}
