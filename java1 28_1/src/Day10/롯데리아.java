package Day10;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

//day10_7_Ű����ũ 
public class �Ե����� extends ���� {
		//���� ���
	//�Ե����Ƹ��� ��ǰ���
	
	//1. �ʵ�
	private String ����;
	private ArrayList<��ǰ> ��ǰ����Ʈ = new ArrayList<>();
	
	//2.������
	//����
	public �Ե�����() {}

	// ��Ŭ �ҽ� �ʵ�
	public �Ե�����(String ����, ArrayList<��ǰ> ��ǰ����Ʈ) {
		super();
		this.���� = ����;
		this.��ǰ����Ʈ = ��ǰ����Ʈ;
	}



	//����������
	@Override
	public void ��ǰ���() {
			System.out.println("======�Ե����� ��ǰ ���======");
			
			int i = 1;
			for(��ǰ temp : ��ǰ����Ʈ) {
				System.out.print(i+"."+temp.get��ǰ��()+
						"("+temp.get����()+")");
				i++;
			}
		System.out.println();
		}
		
		
		//�Է�
		@Override
		public void ��ǰ�߰�() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("======�Ե����� ��ǰ �߰�======");
			System.out.print("��ǰ�� "); String ��ǰ�� = scanner.next();
			System.out.print("��� "); int ��� = scanner.nextInt();
			System.out.print("���� "); int ���� = scanner.nextInt();

		//��ü (�������� -> �ϳ� ��ü)
			��ǰ ��ǰ = new ��ǰ(��ǰ��, ���, ����);
	
		//����Ʈ�� ����
		��ǰ����Ʈ.add(��ǰ);
		
		//����ó��(������Ǥ� ������)
		try {
		//����(����)�� �߻��� �� ���� �ڵ� ����(����)
		FileOutputStream outputStream = new FileOutputStream("C:/java/�Ե��������.text", true);
		//��� ���� �ʱ�																���ϰ��, true=�̾��			
		String �������� = ��ǰ��+","+���+","+����+"\n"; //����
					// , : �ʵ� ����. \n : ��ǰ ����
		
		outputStream.write(��������.getBytes()); //���ڿ� ->����Ʈ��
		} catch(Exception e) {
			//����(����) ó��(���) : Exception Ŭ����
		}
		
		System.out.println("�˸�) ��ǰ ���� �Ϸ�");
		//��̸���Ʈ�� ����ý� ������Ƿ� ��������
		
		}

}
