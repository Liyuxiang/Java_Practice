import java.util.Scanner;

public class ParityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		while (true) {
			System.out.println("������һ��������");
			int Integer = ss.nextInt();
//			String Out = Integer % 2 == 0 ? "�������ż��" : "�����������";
			System.out.println(Integer % 2 == 0 ? "�������ż��" : "�����������");
			System.out.println();
			System.out.println();
			if (Integer == 0)
				break;
		}
	}

}