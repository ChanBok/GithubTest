package package5;

import java.util.Scanner;

public class KBBankTest {

	public static void main(String[] args) {
		
		// interface Ŭ�������� ������(�ݵ�� �������ؾ��ϴ�)�� �߻�޼��� �ΰ��� ����� KBBank Ŭ�����̴�. 
		KBBank kb = new KBBank();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ݾ� (���� : ����) : ");
		int price = sc.nextInt();
		kb.withDraw(price);
		
		System.out.print("�Ա� �ݾ� (���� : ����) : ");
		price = sc.nextInt();
		kb.deposit(price);
		sc.close();
		
	}

}
