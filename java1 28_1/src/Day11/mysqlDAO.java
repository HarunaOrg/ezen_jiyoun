package Day11;

public class mysqlDAO implements DAO {
	//���� �ް� �������̵�
	
	@Override
	public Void select() {
		System.out.println("mysql DB���� �˻�");
	}
	@Override
	public Void insert() {
		System.out.println("mysql DB���� ����");
	}
	@Override
	public Void update() {
		System.out.println("mysql DB���� ����");
	}
	@Override
	public Void delete() {
		System.out.println("mysql DB���� ����");
	}

}
