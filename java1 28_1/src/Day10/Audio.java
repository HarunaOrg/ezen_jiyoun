package Day10;
//day10_2
public class Audio implements RemoteControl, Searchable {
	
	//������ A�� ���.

	private int Volume;
	
	@Override
	public void trunOn() {
		System.out.println("������� �մϴ�.");
	}
	
	@Override
	public void trunOff() {
		System.out.println("������� ���ϴ�.");
	}
	
	@Override
	public void setVolume(int Volume) {
		if(Volume > RemoteControl.MAX_VOLUE) {
			this.Volume = RemoteControl.MAX_VOLUE;
			//�ִ� 10�� �ö��� �ʰ� ����
		} else if (Volume < RemoteControl.MIN_VOLUE) {
			this.Volume = RemoteControl.MIN_VOLUE;
		} else { this.Volume = Volume; }
		System.out.println("���� ����� ���� : "+ this.Volume);
	}

}
