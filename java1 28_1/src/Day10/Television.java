package Day10;

import java.net.MulticastSocket;
// day10_2 
public class Television implements RemoteControl, Searchable {
		//Ŭ������     implements     �������̽� ��
				// �����ϴ�
	//�̰͸� ������ �����϶�� ������ ��....
	//�������̽��� Ŭ���� �ϳ��� ���� ���x
	
	//ctrl space = a��� �ߴ°� �߻�
	
	
	private int volume;
	
	@Override
	public void trunOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	@Override
	public void trunOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	@Override
	public void setVolume(int Volume) {
		//���࿡ ������ �ִ� �������� Ŀ����
		if(volume > RemoteControl.MAX_VOLUE) {
			//������ 10�� ����(�� �̻����� �ö��� ���ϰ�)
			this.volume = RemoteControl.MAX_VOLUE;
		} else if (volume < RemoteControl.MIN_VOLUE) {
			//������ �ּҼ������� ������ 0���� ����(����)
			this.volume = RemoteControl.MIN_VOLUE;
		} else {
			this.volume = volume;
		}
		System.out.println("���� tv ���� : " + this.volume);
	
	}@Override
	public void search(String url) {
		System.out.println( url +"�� �˻��մϴ�. ");
	}
	
	@Override // ����Ʈ �޼ҵ嵵 ������ ���� 
	public void setMute(boolean mute) {
		RemoteControl.super.setMute(mute);
	}
		
	

}
