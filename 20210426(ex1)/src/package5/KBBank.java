package package5;

public class KBBank implements Bank {
	
	// interface Ŭ�������� ������(�ݵ�� �������ؾ��ϴ�)�� �߻�޼��� �ΰ��� ����� KBBank Ŭ�����̴�. 
	public void withDraw(int price) {
		System.out.println("KB Bank �� �������.");
		if (price <= Bank.MAX_INTEGER) {
			System.out.println(price + "**(����)�� �����մϴ�.** ");
		}else {
			System.out.println(price + "**(����) �������**");
		}
	}
	
	public void deposit(int price1) {
		System.out.println("KB Bank �� �Աݷ���.");
		System.out.println(price1 + "**(����)�� �Ա��մϴ�.**");
	}
	
}
