package Day11;

public class day11_2 {
	
	/*p.422
		��ǻ�� �ϵ���� ������ ���� [ ����Ұ��� ]
		������� �߸��� ���� or �������� �߸��� �ڵ��� ������ ����
			���� : 1. �Ϲݿ��� 2. ���࿹��
				�Ϲݿ��� : ������[����]���� ���� �˻� / �����ڿ��� ���� ����ó��(������) <-�̰��ɲ�������
				���࿹�� : ������[����]�Ŀ� ���� �˻� / �������� �������� �Ǵ��ؼ� ����ó��
			����ó��
				���� : ������ �߻��ϸ� ���α׷��� �����Ѵ�. [ ������ ���� ]
				* ���� ������ �߻��ϸ� ��ü �ڵ带 ���� [ ���α׷��� ������� �ʰ� ���� ] 
	 */
	
	public static void main(String[] args) {
		
		//p.423 [NullPointerException]
	try {
		String data = null;
		System.out.println(data.toString());
			/*���� ������ ������ ����
		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "data" is null
		 at Day11.day11_2.main(day11_2.java:20)
			���� �����忡�� ���� �߻�. 
		objectŬ���� �޼ҵ� : toString(): ��ü ���� ���
			������ �߻��ϴ� ���� : null�� �޸� �Ҵ��� ���� ������ ��ü���� ��� �Ұ���
		*/
		
		} //try ��(����ó��)
	catch(NullPointerException ��ü��) { //(try���� �ݵ�� catch�� ����)
		System.out.println("���ܹ߻� : "+��ü��);
		}//catch  end
	
	
	
	//p.424
		//�迭����
	
	try {
		String[] �迭 = new String[2]; //String 2���� ������ �� �ִ� �迭
		�迭[0] = "a"; �迭[1] ="b"; �迭[2]="c"; //if(����<2)�� �ؼ� �迭2���� ����
			//ArrayIndexOutOfBoundsException
		//array=�迭 index out =���� bounds=����. ������ �� �ִ� �ε����� ����.
		//�ε��� ������ �������
	} catch(ArrayIndexOutOfBoundsException e) { //exception�� �̿뵵 ����
			//���� �߻��� ���� Ŭ���� 
		//���࿡ ���ܰ� �߻��ϸ� ����Ǵ� �ڵ�
		System.out.println("����ó�� : "+e);
	}
	
	
	//p.426
	try {
			String data1 = "100"; //���ڿ�
			String data2 = "a100"; //���ڿ�
		int value1 = Integer.parseInt(data1); //"100" -> 100 ����
		int value2 = Integer.parseInt(data2); //"a100" -> �Ұ��� [a�� ������ ǥ�� �Ұ���]
				//integer.parseInt(���ڿ�) ; ���ڿ� -> ����
		//���� ���� : ���ڿ� �� ���������� ��ȯ�� ���������� ���ڿ��� �������� ��ȯ�� �Ұ���
		
		//������ �߻��ϸ� catch �̵� [���� �߻� ���� �ڵ� ����x]
		int result = value1 + value2;
		System.out.println(data1 + "+"+ data2 + "="+result );
		
		
	} catch(NumberFormatException e) {
		System.out.println("�����߻� : "+e);
	}
	
	
	
	//p.428

		String ���ڿ� = "���缮"; //�׳� �ڹ� Ŭ���� �� �ϳ�
		Object ���۰�ü ; //�ڹ� Ŭ���� �� �ֻ��� Ŭ����(���� �� �޾���)
	
		���۰�ü = ���ڿ�; //�ڽ�->�θ� ����
		���ڿ� = ���۰�ü; //�θ�->�ڽ� �Ұ���
			//��������ȯ
			//���� �߿� ����ȯ
		//����ó�� �Ǵ�
			//�����(����� ����) ���õ� �ڵ� [������ ����ó��]
		
		//���� ex -> try�� �ذ�.
		
	
	
	
	
	
	///////////////////////////////////////////////
	}
}
