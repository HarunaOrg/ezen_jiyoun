package Day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class day10_7_Ű����ũ {

	/* ��� : ����
	 * Ŭ���� : �Ե�����, ����ŷ
	 * �������̽� : Ű����ũ
	 * ����ó�� : ��ǰ��� ����
	 * 
	 ������ Ű����ũ�� ������ ������ �Ե����ƿ��Ե� ��ӵȴ�.
	*/
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //�Է°�ü
		
		
		//1. �����Է�(�� 1���� ������� ��)
		//���ô�� input
		try { //try {}�ȿ� ����[����]�� �߻��� �� ���� �ڵ� �ֱ� (����)
			FileInputStream inputStream = new FileInputStream("C:/java/�Ե��������.text");
			
		//2. ���� �о����(���� -> ��Ʈ��(����Ʈ�� ����) -> �ڹ�)
			// ����Ʈ �迭 ����
		Byte[] bytes = new Byte[1024]; // bit(8��) > byte(1024��) > kb > mb > gb
		
			// �о�ͼ� �迭 ����
		InputStream.read(bytes);
		
			// ����. ,: �ʵ屸�� \n : ��ü����
		String ���ϳ��� = new String (bytes); //����Ʈ��->���ڿ� ����
		
			// string ���� �޼ҵ� split("����") ; 
		String[] ��ǰ��� = ���ϳ���.split("\n");
		
		
		ArrayList<��ǰ> ��ǰ����Ʈ = new ArrayList<>();
		for(String temp : ��ǰ���) {
			String[] �ʵ��� = temp.split(",");
			��ǰ ��ǰ = new ��ǰ( �ʵ���[0], 
					Integer.parseInt(�ʵ���[1]), Integer.parseInt(�ʵ���[2]) );
				//���ڿ� -> ������ ��ȯ [ Integer.parseInt[���ڿ�]
				//����Ʈ ����
			��ǰ����Ʈ.add(��ǰ);
		}
		
		
		} catch(Exception e) { // catch : ���� ��� -> Exception Ŭ������ ��ü�� ����
			
		}
		
		//���ְ� ���缮�� �Ե����� Ű����ũ ��ü ����
		Ű����ũ �Ե����� = new �Ե�����("���缮", ��ǰ����Ʈ ); // �Ե����� Ű����ũ ����
		
		
		while(true) {
			//���ѷ���
			
			�Ե�����.��ǰ���();
			int ch = scanner.nextInt();
			
			if(ch == -1) {
				�Ե�����.��ǰ�߰�();
			} else { //�ش��ϴ� ��ȣ�� ��ٱ��Ͽ� ����
			}
			
		}
		
		
		
		
		
/////////////////////////////////////////////////		
	}
}
