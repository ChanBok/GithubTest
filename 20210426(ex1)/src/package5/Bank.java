package package5;

public interface Bank {
	//��� ���� (��).
	public int MAX_INTEGER = 1000; // ���� ������ �� �ִ� �ݾ��ѵ�.
//	����� ���� ������ �״� �������ض�.(������)
	
	void withDraw(int price); //�߻� �޼ҵ� : ���� �޼ҵ�. (������)
	
	void deposit(int price); // �߻� �޼ҵ� : �Ա� �޼ҵ�. (������)
	
// ���� �޸���¸� ã���ִ� �޼ҵ�.
//	����Ʈ�޼ҵ�� �������̽����� �⺻ ������������, ������ �ȵ�� ���� �����ؼ� ���.(�ʼ� ������ ���û���) (������)
	default String findDormancyAccount(String custId) {
		System.out.println("**������������ 00���� ���� �޸���� ã���ֱ� �**");
		System.out.println("**�������������� �����ϴ� ����**");
		return "00���� 000-000-0000-00";
	}
	
	// �����޼ҵ� : ���ü�� ������ ��û�ϴ� �޼ҵ� (������) �������̽� ������ ȣ���� �� �ִ�.
	static void BCAuth(String bankName) {
		System.out.println(bankName + "���� ���ü�� ������ ��û�մϴ�.");
		System.out.println("�� ������ ���� ���ü�� ���� ����");
	}
}
