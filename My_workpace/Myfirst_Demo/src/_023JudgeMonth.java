import java.util.Scanner;
public class _023JudgeMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ���·ݣ�");
		int Month = scan.nextInt();
		switch(Month)
		{
			case 12:
			case 1:
			case 2:
				System.out.println(Month+"���Ƕ��졣");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(Month+"���Ǵ��졣");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(Month+"�������졣");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(Month+"�������졣");
				break;
			default:
				System.out.println("��Ҫ����Ц������"+Month+"������·�ô��");
		}
	}

}
