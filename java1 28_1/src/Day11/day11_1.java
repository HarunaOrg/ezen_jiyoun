package Day11;

public class day11_1 {
	
	
	/* p.386 Ȯ�ι���
		1. 3 [�������̽� ��� : ����ʵ�, �߻�޼ҵ�, ����Ʈ�޼ҵ�, �����޼ҵ�]
		2. 4 [�������̽� ���� = ������ü]
			������ü = Ŭ������ implements�� ��ü
	*/

	
	private static void printSound ( Soundable soundable ) {
	//���������� ����  ��ȯŸ��  �޼ҵ��    ( �μ�[���� �迭 ��ü �������̽�])
		//�ٷ� ȣ���Ϸ��� static
		System.out.println(soundable.sound());
	}
	
	
	
	public static void dbwork(DAO DAO) {
		
	}
	//????????????
	
	
	
	public static void main(String[] args) {
		
		//3.
		printSound(new Cat());
				   //������ü
		printSound(new dog());
		
		Soundable soundable = new Cat(); //2���� 2��
					//�Ű� ������ �������̽� Ÿ���� ��� �پ��� ���� ��ü�� ������ �� �ִ�.
		Soundable[] soundables = new Cat[100]; //2���� 3��
					//�迭�� �������̽� Ÿ���� ��� �پ��� ���� ��ü�� ������ �� �ִ�.
				//�迭�� ����(�������̽� ������ �迭�� ����)	
	
	
	//4.
	//���������� ���Ǵ� �ܾ�(�������̼� ���Ҷ�)
		//Dao:DB���� ��ü. �����ͺ��̽��� ������ �� ���� ��ü
		//Dto:�������� �̵� ��ü. ���δٸ� Ŭ���� �� �̵��ϴ� ��ü
	dbwork(new Oracle_dao());
	dbwork(new mysqlDAO());
	
	
	
	//5. �͸�ü [�������̽� ���� ����]
		//������ü : �������̽� ��ü�� = new Ŭ����();
		//�͸�ü : �������̽� ��ü�� = new �������̽�(){����}; //1ȸ��
	Action action = new Action() {
		
		@Override
		public void work() {
			System.out.println("���縦 �մϴ�.");
		}
	}; //������(����Ŭ�� �ʼ�)
	//�ڵ����� �߻�޼ҵ� ����. �ȿ� ������ �ϸ� �ȴ�
	
	
	action.work();
	
	
	
	
	
	
	
	
	
	}
	
}
