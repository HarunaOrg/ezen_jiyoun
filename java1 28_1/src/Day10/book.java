package Day10;

public class book {
	
	//1. �ʵ�
	private String ������;
	private String ����;

	
	
	
	//2. ������
	
	//������� �ϳ�, ��Ŭ�� �ҽ� �ʵ� �ϳ�.
	public book() {}
	public book(String ������, String ����) {
		super();
		this.������ = ������;
		this.���� = ����;
	}
	
	
	
	//3. �޼ҵ�[ getter setter]
	
	public String get������() {
		return ������;
	}
	public void set������(String ������) {
		this.������ = ������;
	}
	public String get����() {
		return ����;
	}
	public void set����(String ����) {
		this.���� = ����;
	}
	
	
	
	
	

}
