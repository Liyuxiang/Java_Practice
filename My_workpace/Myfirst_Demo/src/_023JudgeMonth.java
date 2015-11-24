import java.util.Scanner;
public class _023JudgeMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个月份：");
		int Month = scan.nextInt();
		switch(Month)
		{
			case 12:
			case 1:
			case 2:
				System.out.println(Month+"月是冬天。");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(Month+"月是春天。");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(Month+"月是夏天。");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(Month+"月是秋天。");
				break;
			default:
				System.out.println("不要开玩笑啦，有"+Month+"月这个月份么。");
		}
	}

}
