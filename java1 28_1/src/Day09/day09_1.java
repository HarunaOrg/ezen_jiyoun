package Day09;

public class day09_1 {
	public static void main(String[] args) {
		
		// ���
			// �θ𿡰� �����޴� ��
			// ���� : �θ�->�ڽ� ����
			// ���α׷��� : �ڽ�->�θ� ����
			// extends : �����ϴ�[����ϴ�]
			// ���� : ���� ���� [ ������ �ִ� ��� �ڵ�, Ŭ������ �������� ���� ]
				// �ڵ��� ����ȸ�� ������ �� �� �ұ�?
					// 1. �ڵ����� ���� -> ������ ���� �ʰ� �⺻ ���迡 ���� �츮 ȸ�縸�� ���𰡸� �߰��Ѵ�.
			// �θ�Ŭ������ ������ 1��. ����� �� 1���Լ��� ���� �� �ִ�.
				//������ �ڽ��� ������ �����ϴ�.
		
		//p290~292 ����
		
		//�Ķ����� �θ��� ��. �����޾ұ� ������ ������ �����ϴ�.
		
		// 1.����Ŭ������ ��ü ����
		DmbCellphone dmbCellphone = new DmbCellphone("�ڹ���", "����", 10);
		
		//2. ����Ŭ������ ������� ��ü�� ����Ŭ������ ��� ����
		System.out.println("�� : "+dmbCellphone.model);
		System.out.println("���� : "+dmbCellphone.color);
			
		//3. ����Ŭ������ ������� ��ü�� ���� ��� ����
		System.out.println("ä�� : "+dmbCellphone.channel);

		//4. ����Ŭ������ ������� ��ü�� ����Ŭ���� �� ����޼ҵ� ����
		dmbCellphone.powerOn(); //����Ŭ����(�θ�) �� ����� �޼ҵ� [ ȣ�� ���� ]
		dmbCellphone.bell();
		dmbCellphone.sendvoice("��������");
		dmbCellphone.receiveVoice("�ȳ��ϼ���, ���� ȫ�浿�Դϴ�.");
		dmbCellphone.sendvoice("�ݰ����ϴ�.");
		dmbCellphone.hangUp();
		
		//5. ����Ŭ������ ������� ��ü�� ���� ��� ����
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannel1Dmb(12);
		dmbCellphone.turnOffDmb();
		
		
		//////////////////////////////////////////////
	}
}
