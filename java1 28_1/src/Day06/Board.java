package Day06;

public class Board {
	// * board Ŭ���� ����. main�޼ҵ�xx���赵���� �� ��
	// 1. �ʵ� (4�� �ʿ�)
		String title; String content; String writer; String pw;
		
	// 2. ������ (Ŭ���� �̸��� �����ϸ� �����ڸ�)
		// �ڵ� : ������ Ŭ�� source
		
		// 1. �� ������(����)
	Board(){}		
	
		// 2. 1�� �ʵ带 �޴� ������
	Board(String title){ //�ܺκ���
		this.title = title; }
		// this.�ʵ�� => ���κ���. �ܺηκ��� ���� ������ ���κ����� ����
	
		// 3. 2�� �ʵ带 �޴� ������
	Board(String title, String content)
	{ this.title = title; this.content = content; }
		
		// 4. 3�� �ʵ带 �޴� ������
	Board(String title, String content, String writer)
	{ this.title = title; this.content = content; this.writer = writer; }
	
		// 5. 4�� �ʵ带 �޴� ������
	Board(String title, String content, String writer, String pw)
	{ this.title = title; this.content = content; this.writer = writer;
	this.pw = pw;}
		
	// 3. �޼ҵ�
	

}
