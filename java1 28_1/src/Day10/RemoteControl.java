package Day10;
// day10_2 
public interface RemoteControl { // �������̽� ����
	
	/*��� p.348
		1. ����ʵ� : ������ ������
		2. �߻� �޼ҵ�** : ����o ����x
		3. ����Ʈ �޼ҵ� : ����o ����o
		4. ���� �޼ҵ� : ����o ����o [ ��ü���� ���� ]
		
	*/

	// 1. ����ʵ� : ������ ������
	public int MAX_VOLUE = 10; //������ �ִ����
	public int MIN_VOLUE = 0; //������ �ּҼ���
	
	
	// 2. �߻� �޼ҵ�** : ����o ����x
	public void trunOn(); //{} : �߷� [����x]
	public void trunOff(); //����x
	public void setVolume(int Volume); //����x
	
	
	// 3. ����Ʈ �޼ҵ� : ����o ����o
	default void setMute ( boolean mute ) {
		if (mute) {
			System.out.println(" ���� ó�� ");
		} else {
			System.out.println("���� ����");
		}
	}
	
	
	// 4. ���� �޼ҵ� : ����o ����o [ ��ü���� ���� ]
	static void changeBattery() {
		System.out.println("�������� ��ü�մϴ�.");
	}
	


}
