import java.util.Scanner;
import java.io.File;
public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		System.out.println("请输入你的编号：");
		String ss = sr.next();
		System.out.println("你的名字是"+ss);
		System.out.println("我们一起来学习吧！"+"\r");
		System.out.println("请输入你的名字："+"\r");
		String name = sr.next();
		System.out.println("请输入你的性别："+"\r");
		String sex = sr.next();
		System.out.println("请输入你的年龄："+"\r");
		int age = sr.nextInt();
		System.out.println("姓名\t 性别\t 年龄\n"+name+"\t"+sex+"\t"+age+"\r");
		//System.in.close();
	}
}
