import java.util.Scanner;
public class _020CheckLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�������û�����");
		String username = scan.nextLine();
		System.out.println("���������룺");
		String password = scan.nextLine();
		if(!username.equals("Liyuxiang")){
			System.out.println("�û�������ȷ������һ�룡");
		}
		else if(!password.equals("Liyuxiang")){
			System.out.println("���벻��ȷŶ���뿴û�ţ�");			
		}
		else
			System.out.println("��½�ɹ����ⶼ����֪���ˣ�");						
	}
}