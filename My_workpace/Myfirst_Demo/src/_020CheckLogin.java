import java.util.Scanner;
public class _020CheckLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = scan.nextLine();
		System.out.println("请输入密码：");
		String password = scan.nextLine();
		if(!username.equals("Liyuxiang")){
			System.out.println("用户名不正确，再想一想！");
		}
		else if(!password.equals("Liyuxiang")){
			System.out.println("密码不正确哦，想看没门！");			
		}
		else
			System.out.println("登陆成功，这都被你知道了！");						
	}
}
