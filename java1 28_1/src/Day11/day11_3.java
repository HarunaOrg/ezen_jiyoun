package Day11;

public class day11_3 {
	public static void main(String[] args)  {

		//p.422 ���� ������
			//���� : ��� �޼ҵ忡�� try{}catch(){} ���� �ڵ尡 �����ϹǷ� �Ѱ����� ���� �̵�
		try { findcalss();} catch (Exception e) {}
		
		try {withdraw(30000);}
		catch(Exception e){System.out.println(e);}
		
	}
	
	//////////////////////
		
		
		public static void findcalss() throws Exception {

			//1.���ܴ�����
			Class clazz = Class.forName("java.lang.String2");
			//�θ� ������� ���� ������
			
			//2. try~catch
//			try { //���ܰ� �߻��� �� ���� �ڵ� Ȥ�� �Ϲݿ���
//				Class class = Class.forName("java.lang.String2");
//							//Ŭ���� ã�� �޼ҵ�
//			} catch (Exception e) { //���ܰ� �����ϸ� ����Ǵ� �ڵ�
//				// exception : ���� Ŭ���� �� ����Ŭ�����̹Ƿ� ��� ���ܸ� ���� ����
//				System.out.println(e);
//			}
			
			
			
	//p.444~445 ���� �����
			
		public static void withdraw(int money) throws Exception  {
			if(20000 < money ) {
				throw new Exception("�ܰ����");
			}
			
		}
		//////////////////////////////////////////
	}

}
