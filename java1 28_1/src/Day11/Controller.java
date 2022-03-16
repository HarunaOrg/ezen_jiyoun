package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Controller { //ó��
	
	//����Ʈ�����
	
	//0.�Խù� ����Ʈ (��� �Խù��� ��� ����Ʈ)
	public static ArrayList<Board> boardlist =
			new ArrayList<>();


	//��� �޼ҵ�� static
	
	//1. ��� �޼ҵ�
	// public static void boardlist() {}
	// ����
	
	//2. ���� �޼ҵ�
	//baorad app���� �޾ƿ�
	public static void write(String ����, String ����, String �ۼ���, String ��й�ȣ) {
		//1. ��üȭ : ������ 4�� �̻��̸� ������ �����Ƿ� �ϳ��� ��ü�� ����
		Board board = new Board(����, ����, �ۼ���, ��й�ȣ);
		
		//2. ����Ʈ�� ����
		boardlist.add(board);
		
		//3. ���Ͽ� ����
		save();
	} //���� �ݱ�
	
	
	
//	//3. ���� �޼ҵ�
//	public static void view() {}
	
	
	
	
	//4. ���� �޼ҵ�
	public static boolean update(int index, String pw, String title, String content) {
		//������ �ε��� ��ȣ, ����, ���� + �н����� üũ
		if(pw.equals(boardlist.get(index).getPw()) ) { //�н����尡 �����ϸ� ���� ó��
			
			//������ ��
		boardlist.get(index).setTitle(title);
		boardlist.get(index).setContent(content);
			//���� true false �̹Ƿ� void�� �ٽ� boolean
		//���� ������Ʈ
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	//////
	
	//5. ���� �޼ҵ�
	public static boolean delete(int intdex, String pw) { //�ε����� ��Ʈ
		//�� �Խù� �ε����� �� �Խù� �н����带 �޾ƿ´�.
		
		//���� boardlist�� �ִ� ��.�ε����� ��.�н����带 �����ͼ� >��<
		if (pw.equals( boardlist.get(intdex).getPw() ) ) {
			//�Է¹��� �н������  �ش� �ε��� �Խù���ȣ�� �н����尡 �����ϸ�
			
			boardlist.remove(intdex);
			// ����Ʈ.add(��ü) : �߰�
			// ����Ʈ.get(�ε���): ȣ��
			// ����Ʈ.remove(�ε���): ����
			
			save(); //����Ʈ���� ���� �� ���ϵ� ���� ����Ʈ�� ������Ʈ
			
			return true;
			
		} else { return false;}
		//void�� return�� ���ٴ� ���̹Ƿ� ó���� void�� ����ص� ���߿� ������ ������ boolean���� �ٲ۴�.
		
	}
	
	
	
	
	
	
	
	//6. ��۾��� �޼ҵ�
	public static void replywriter() {}
	
	
	
	
	
	
	
	//7. �Խù� ���� �޼ҵ�
	public static void save() { //������� ȣ��(save)
		//����Ʈ�� ��� �Խù��� ���Ͽ� ����
		try {
			//1.���� ��� Ŭ����
			FileOutputStream outputStream = new FileOutputStream("C:/java/�Խù�����.text");
			
			
				//2.���Ͽ� �ۼ��� ���� (���پ� = �Խù� 1���� = ��ü 1���� )
				for(Board board : boardlist) { // ,=�ʵ屸�� \n��ü����
					
					String �ۼ����� = board.getTitle() + "," + board.getContent()+ ","+
							board.getPw() + "," + board.getWriter()+ ","+
							board.getViewcount()+ ","+board.getDate()+"\n";
					
					
				//3.����(���ڿ�) -> ����Ʈ�� ��ȯ(�ܺ����(��Ʈ��) : ��Ŵ��� : ����Ʈ)
					//����� ���� ��Ʈ�������� ����Ʈ�ۿ� �� ���Ƿ� ��ȯ�ؼ� �ܺο� ���
					
				//4.��������(write)
					outputStream.write(�ۼ�����.getBytes());
				} //for end
			
			} catch (Exception e) {
			System.out.println("�������� ����(������ ����)");
		}
		
		
		
	} //save end
	
	
	
	
	//8. �Խù� �ҷ����� �޼ҵ� [���α׷� ����] ���� -> ����Ʈ
	public static void load() {
		//����ó�� ������
		try {
	
				FileInputStream inputStream = new FileInputStream("C:/java/�Խù�����.text");
			
			//2. ����Ʈ�迭 ����
			byte[] bytes = new byte[1000];
			
			//3. ��� ����Ʈ �о�ͼ� ����Ʈ�� ����
			inputStream.read(bytes);
	
			//4. ����Ʈ -> ���ڿ� ��ȯ
			String file = new String(bytes);
			
			//5. ���ڿ� �ڸ��� [ ���پ� -> 1�� ��ü ]
			String[] boards = file.split("\n"); //���ڿ� �ڸ��� ���پ� \n
			
			
			int i = 0; //�ε�����
			
				for(String temp : boards ) { //�迭�� ���ڿ��� �ϳ��� ������
					
					if(i+1 == boards.length) break;
				//6. ���ڿ� �ڸ��� [ ��ü ������ ,�� �ʵ� ����. ]
					String[] field = temp.split(",");
				//7. ��üȭ
					Board board = new Board(field[0], field[1],
							field[2], field[3],
							Integer.parseInt(field[4]), field[5], null);
					//���ڸ� ���ڷ� �ٲ۴�			//��ȸ���� �ʵ��� �������̹Ƿ� ���������� ����ȯ[Integer.parseInt(���ڿ�)]
								
				//8. ����Ʈ  ���
					boardlist.add(board); 
				i++; //�ε��� ����
			}
		
		} catch(Exception e) {System.err.println(" �˸�]] ���Ϸε�  ����( �����ڿ��Թ��� )"+e); }
		
		
		
		
		
		
		
	}
	
}
