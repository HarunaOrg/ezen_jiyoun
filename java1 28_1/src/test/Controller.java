package test;

import java.io.FileInputStream;
import java.util.ArrayList;

public class Controller {
	
	//�л� ����Ʈ
	
	public static ArrayList<student> studentlist = new ArrayList<>();
	
	//�Է� �޼ҵ�
	
	public static void write(int index, String �̸�, int ����, int ����, int ����) {
		//������ 4�� �̻��̸� �ϳ��� ��ü�� �����.
		student student = new student(index, �̸�, ����, ����, ����);
		//����Ʈ�� ����
		studentlist.add(student);
	//	save();
		//���Ͽ� ����
	}// �Է� ����
	
	
	//���� �޼ҵ�
	public static boolean delete(int index, String �̸�) { //��ȣ�� �̸��� �޾ƿ´�.
		
		//���� studentlist�� �ִ� ��.�ε����� ��.�̸��� �����ͼ� >��<
		if (�̸�.equals( studentlist.get(index).get�̸�() ) ) {
			//�����ϸ� ����
			studentlist.remove(index);			
		//	save(); //����Ʈ���� ���� �� ���ϵ� ���� ����Ʈ�� ������Ʈ
			
			return true;
			
		} else { return false;}
		//void�� return�� ���ٴ� ���̹Ƿ� ó���� void�� ����ص� ���߿� ������ ������ boolean���� �ٲ۴�.
		
	} //���� ����
	
		/////////////////////////////////
	
	
	//7. �Խù� ���� �޼ҵ�
//	public static void save() { //������� ȣ��(save)
//		//����Ʈ�� ��� �Խù��� ���Ͽ� ����
//		try {
//			//1.���� ��� Ŭ����
//			FileOutputStream outputStream = new FileOutputStream("G:\java\�Խù�����.text");
//			
//			
//				//2.���Ͽ� �ۼ��� ���� (���پ� = �Խù� 1���� = ��ü 1���� )
//				for(student student : studentdlist) { // ,=�ʵ屸�� \n��ü����
//					
//					String �ۼ����� = student.getIndex(), + "," + student.get�̸�()+ ","+
//							student.get����() + "," + student.get����()+ ","+
//							student.get����()+ ","+student.get����()+ ","+
//							student.get���()+student.get����()+"\n";
//					
//					
//				//3.����(���ڿ�) -> ����Ʈ�� ��ȯ(�ܺ����(��Ʈ��) : ��Ŵ��� : ����Ʈ)
//					//����� ���� ��Ʈ�������� ����Ʈ�ۿ� �� ���Ƿ� ��ȯ�ؼ� �ܺο� ���
//					
//				//4.��������(write)
//					outputStream.write(�ۼ�����.getBytes());
//				} //for end
//			
//			} catch (Exception e) {
//			System.out.println("�������� ����(������ ����)");
//		}
//		
		
		
	} //save end
	
	
	
	
	//8. �Խù� �ҷ����� �޼ҵ� [���α׷� ����] ���� -> ����Ʈ
//	public static void load() {
//		//����ó�� ������
//		try { FileInputStream inputStream = new FileInputStream("G:\\java\\�Խù�����.text");
//			
//			//2. ����Ʈ�迭 ����
//			byte[] bytes = new byte[1000];
//			
//			//3. ��� ����Ʈ �о�ͼ� ����Ʈ�� ����
//			inputStream.read(bytes);
//	
//			//4. ����Ʈ -> ���ڿ� ��ȯ
//			String file = new String(bytes);
//			
//			//5. ���ڿ� �ڸ��� [ ���پ� -> 1�� ��ü ]
//			String[] boards = file.split("\n"); //���ڿ� �ڸ��� ���پ� \n
//			
//			
//			int i = 0; //�ε�����
//			
//				for(String temp : boards ) { //�迭�� ���ڿ��� �ϳ��� ������
//					
//					if(i+1 == boards.length) break;
//				//6. ���ڿ� �ڸ��� [ ��ü ������ ,�� �ʵ� ����. ]
//					String[] field = temp.split(",");
//				//7. ��üȭ
//					student student = new student(field[0],
//							field[1],field[2],field[3],field[4],field[5],
//							field[6],field[7],
//							null);
//					//���ڸ� ���ڷ� �ٲ۴�
//					//��ȸ���� �ʵ��� �������̹Ƿ� ���������� ����ȯ[Integer.parseInt(���ڿ�)]
//								
//				//8. ����Ʈ  ���
//					studentlist.add(student); 
//				i++; //�ε��� ����
//			}
//		
//		} catch(Exception e) {System.err.println(" �˸�]] ���Ϸε�  ����( �����ڿ��Թ��� )"+e); }
//		
//	}	
		
	


