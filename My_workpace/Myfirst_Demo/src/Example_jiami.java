import java.util.Scanner;

public class Example_jiami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("请输入一个英文字符串：");
			String password = scan.nextLine();
			char[] array = password.toCharArray();
			for (int i = 0; i < array.length; i++) {
				array[i] = (char) (array[i] ^ 0x4E20);
			}
//			for (int c : array) {
//				c =(char)(c ^ (char)0x4E20);
//			}
			System.out.println("加密或解密结果如下：");
			System.err.println(new String(array));
		}
	}

}
