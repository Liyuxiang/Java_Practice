import javax.swing.JOptionPane;
public class Demo {
 static String s="I love Java.\n I\'m studying Java.";
 static String s1="I\'m studying Java.";
	public static void main(String[] args){
		for(int x = 1; x <= 9; x++){
			for(int y = 1; y <= x; y++){
				System.out.print(y + "*" + x + "=" + x*y + "\t");
			}
			System.out.println();
		}
		System.out.println("Holle World!");
		System.out.println("我们开始吧！");
		System.out.println(s.length());
		System.out.println(s1.length());
		JOptionPane.showMessageDialog(null, "第一个java图形界面。");
}
}//怎么回事