package test;

import java.util.ArrayList;

public class student { //�Է� �޴� ��
	
	private int index;
	private String �̸�;
	private int ����,����,����;
	private int ���� = ����+����+����;
	private double ��� = ���� * 0.3;
	private int ����; //������ ���� ����
	//�Է� �޾Ƽ� ����
	
	private ArrayList<Reply> replylist = new ArrayList();
	//��̸���Ʈ
	
	// ������
	public student() {}


	//�л� ��Ͻ� ���Ǵ� ������
	public student(int index, String �̸�, int ����, int ����, int ����) {
		super();
		this.index = index;
		this.�̸� = �̸�;
		this.���� = ����;
		this.���� = ����;
		this.���� = ����;
	}


	//Ǯ������
	

	public student(int index, String �̸�, int ����, int ����, int ����, int ����,
			double ���, int ����, ArrayList<Reply> replylist) {
		super();
		this.index = index;
		this.�̸� = �̸�;
		this.���� = ����;
		this.���� = ����;
		this.���� = ����;
		this.���� = ����;
		this.��� = ���;
		this.���� = ����;
		this.replylist = replylist;
	}

	
	
	

	//3.�޼ҵ�
	
	public int getIndex() {
		return index;
	}


	public void setIndex(int index) {
		this.index = index;
	}


	public String get�̸�() {
		return �̸�;
	}


	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}


	public int get����() {
		return ����;
	}


	public void set����(int ����) {
		this.���� = ����;
	}


	public int get����() {
		return ����;
	}


	public void set����(int ����) {
		this.���� = ����;
	}


	public int get����() {
		return ����;
	}


	public void set����(int ����) {
		this.���� = ����;
	}


	public int get����() {
		return ����;
	}


	public void set����(int ����) {
		this.���� = ����;
	}


	public double get���() {
		return ���;
	}


	public void set���(double ���) {
		this.��� = ���;
	}


	public int get����() {
		return ����;
	}


	public void set����(int ����) {
		this.���� = ����;
	}


	public ArrayList<Reply> getReplylist() {
		return replylist;
	}


	public void setReplylist(ArrayList<Reply> replylist) {
		this.replylist = replylist;
	}


	
	
	
	
	
	
	

}
