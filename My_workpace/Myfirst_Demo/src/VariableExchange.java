import java.util.Scanner;
public class VariableExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in); 
		System.out.println("������Ҫ����������");
		long A = ss.nextLong();
		long B = ss.nextLong();
		System.out.println("A="+A+"\tB="+B);
		A=A^B;
		B=A^B;
		A=A^B;
		System.out.println("������ã�A="+A+"\tB="+B);
	}

}