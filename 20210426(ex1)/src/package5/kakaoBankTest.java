package package5;

import java.util.Scanner;

public class kakaoBankTest {

	public static void main(String[] args) {
		
//		kakaoBank class ������ �߻�޼ҵ� �ΰ��� �������� default �޼ҵ带 ����ߴ�.
//		���ü�������� ���� �����޼ҵ�� �������̽������� �ٷ� ȣ���Ѵ�. (Bank.**)
		kakaoBank kakao = new kakaoBank();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ݾ� (���� : ����) : ");
		int price = sc.nextInt();
		kakao.withDraw(price);
		
		System.out.print("�Ա� �ݾ� (���� : ����) : ");
		price = sc.nextInt();
		kakao.deposit(price);
		
		//custID ��(ID_A , ID_B , ID_C)
		sc = new Scanner(System.in);
		System.out.print("custID �� �Է��ϼ��� : ");
		String custId = sc.nextLine();
		kakao.findDormancyAccount(custId);
		
		System.out.print("(���ü�� ����)����� : ");
		String bankName = sc.nextLine();
		Bank.BCAuth(bankName);
		sc.close();
		
		
		
		
		
	}

}
