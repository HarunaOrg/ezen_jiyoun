package Day08_3; //AŬ������ ���� ��Ű��

public class B { //A�� ��Ű���� ������ Ŭ������ �ٸ���.
	//private ���� �Ұ���
	
	// 1.�ʵ�
	A a1 = new A(true);
	A a2 = new A(1);
//	A a3 = new A("���ڿ�");
	
	//2. ������
	
	public B( ) {
		
		A a = new A(true);
		a.field1 = 1;
		a.field2 = 1;
	// a.field3; -> private�� ��� �Ұ���
		
		
		a.method1();
		a.method2();
		
		
	}
	
	
	//3. �޼ҵ�
	
}
