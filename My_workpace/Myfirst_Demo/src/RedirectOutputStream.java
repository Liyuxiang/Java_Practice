import java.io.*;
import java.io.FileNotFoundException;
public class RedirectOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			PrintStream out = System.out;
			PrintStream ps = new PrintStream("./log.txt");
			System.setOut(ps);
			int age = 18;
			System.out.println("��������ɹ����壬��ʼֵΪ18��");
			String sex="Ů";
			System.out.print("�Ա�����ɹ����壬��ʼֵΪŮ");
			String info="���Ǹ�"+sex+"���ӣ�Ӧ����"+age+"����";
			System.out.println("������������Ϊinfo�ַ��������������ǣ�"+info+"��");
			System.setOut(out);
			System.out.println("����������ϣ���鿴��־�ļ���");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

}
