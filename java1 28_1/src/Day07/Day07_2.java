package Day07;

public class Day07_2 {
	public static void main(String[] args) {
		
		//p.223~224 : ���� ���� ���� �޼ҵ�(void)
		
		//1.��ü ����[�� ������=�⺻������]
		Car mycar = new Car();
		//2. �޼ҵ� ȣ�� [�μ� 1�� =5]
		mycar.setGas(5);
		//�ʵ忡�� �ٷ� �ְų� �޼ҵ�� �ҷ����ų� ����(mycar.gas=5;)
		
		
		// 3. �޼ҵ� ȣ��[�μ�x ��ȯ=true Ȥ�� false]
		if(mycar.isLeftGas()) //�޼ҵ� gas�� �ִ� �ڵ带 ������
		{ //������ ���� ������ ���. ������ 5�� ���������Ƿ� ���
			System.out.println("����մϴ�.");

			// 4. �޼ҵ� ȣ��[�μ�x ��ȯx]		
			mycar.run(); //gas�� 5�� �̹Ƿ� 0�� �ɶ����� �޸���.	
		}
		 // 5. �޼ҵ� Ż��
		if(mycar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else { System.out.println("gas�� �����ϼ���.");
		}
		
		
		
		
		
		
		///////////////
	}

}
