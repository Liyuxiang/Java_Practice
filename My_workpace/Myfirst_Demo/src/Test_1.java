import java.util.Scanner;
import java.io.File;
public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		System.out.println("��������ı�ţ�");
		String ss = sr.next();
		System.out.println("���������"+ss);
		System.out.println("����һ����ѧϰ�ɣ�"+"\r");
		System.out.println("������������֣�"+"\r");
		String name = sr.next();
		System.out.println("����������Ա�"+"\r");
		String sex = sr.next();
		System.out.println("������������䣺"+"\r");
		int age = sr.nextInt();
		System.out.println("����\t �Ա�\t ����\n"+name+"\t"+sex+"\t"+age+"\r");
		//System.in.close();
	}
}