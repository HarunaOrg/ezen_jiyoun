package Day12;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class day12_3 {
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		/*���� �˻� ���α׷�
			����
			1. �Է¹ޱ� [system.in.read()]
			2. String �迭�� �̿��� �������� ������ ����
				-String[] ������� = { "�ȴ�! ���̹� ��α�&����Ʈ" "������ ��Ʈ ���� Ȱ�� ������"
									"tucker�� go ��� ���α׷���" "ȥ�� �����ϴ� c ���"
			3. �˻����, �������
				-�˻� ���: Ư�� ���ڸ� �Է¹޾� ������ ���Ե� ���ڰ� ������ ��� ���
					'���' �˻� ->	"tucker�� go ��� ���α׷���" / "ȥ�� �����ϴ� c ���"
					'����' ���� -> ������ �������� �Ϻθ� �Է¹޾� ��µ� �������� ��ȣ�� ���� �� ������� ����
						������ �������� �Ϻ� ���� / ���ο� ���� �Է¹޾� ���� �Ϸ�
		 	*/	

		
		String[] booklist = {"�ȴ�! ���̹� ��α�&����Ʈ","������ ��Ʈ ���� Ȱ�� ������",
				"tucker�� go ��� ���α׷���","ȥ�� �����ϴ� c ���"};
		
		
		while(true) {
			System.out.println("�޴� : 1.�����˻� 2.��������");
		
			byte[] bytes = new byte[100];
			int count = System.in.read(bytes);
			// Ű����κ��� [��Ʈ��] ����Ʈ�� �о���� //�Ϲݿ���!! [���� ���ѱ��]
			//�о�� byte ����
			
			String ch = new String(bytes, 0, count-2); //bytes���� 2���� ���� equals�� ���� �� ���͵��� ����x
			
			if(ch.equals("1")) {
				System.out.print("�˻��� ���� �̸� : "); count= System.in.read(bytes);
				String search = new String(bytes, 0 ,count-2); // ã������
				
				System.out.println("�˻� ���");
					for(String temp : booklist) {//���迭 �� ���ڿ��� �ϳ��� ��������
						if(temp.indexOf(search) != 1) { 
							//�ش� ���ڿ��� ã�������� �ε����� �����ϸ�.
							
							//indexOf �޼ҵ� -1 ��ȯ�Ǵ°��� ������ �ܾ ������� [�˻�x
							System.out.println(temp); //ã��
							//�ش� ���ڿ��� ã�� ���ڰ� ����
										
			//���2
//				if(temp.contains(search)) {
//					//���ڿ�.contains("ã������") : ���ڿ��� ã�����ڰ� true[�ִ�] / false[]����
//					System.out.println(temp); }
			
						}
					}
			} 
			else if(ch.equals("2")) {
				System.out.println("������ ���� �̸�(�Ϻ� ���� ����) : ");
				count = System.in.read(bytes); //Ű����κ��� ����Ʈ �о�ͼ� �迭�� ����
				String search = new String(bytes, 0, count-2); //0�� �ε��� ����Ʈ���� -2������ �ε�������
				
				int i = 0 ; //�ε����� �������
				for(String temp : booklist) {
					if(temp.indexOf(search) != 1) { 
						//���ڿ�.contains("ã������") : ���ڿ��� ã�����ڰ� true[�ִ�] / false
						System.out.println("������ȣ : "+ i + "����� : " +temp); //ã��
						//�ش� ���ڿ��� ã�� ���ڰ� ����
				}	
			} i++;
				
			//������ȣ[�ε���] �Է¹޾� �����ϱ�
			System.out.println("���� ��ȣ ���� : ");
					count = System.in.read(bytes); //���� ����
					String ch2 = new String(bytes, 0 ,count-2);
					int index = Integer.parseInt(ch2); //ch2 ���ڿ��� �Է¹��� ->�ε���[����] ��ȯ
					
			//���� ���� �Է¹ޱ�
				System.out.println("���� ���� : ");
					String oldstr = new String(bytes , 0, count-2);
				System.out.println("���ο� ���� : ");
					count = System.in.read(bytes);
					String newstr = new String(bytes, 0 ,count-2);
				//����ó��
				booklist[index].replace(oldstr, newstr);
				System.out.println("���� �Ǿ����ϴ�.");
						
			}
		
		
		}
		
		
/////////////////////////////////////////////	
	}
}
