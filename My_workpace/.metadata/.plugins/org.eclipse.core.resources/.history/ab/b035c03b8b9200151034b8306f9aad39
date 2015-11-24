
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		char c = 'W';
		short s = 23561;
		int j = 3333;
		long l =400000L;
		float f = 3.14159F;
		double d = 54.523;
		long value = 100L;
		System.out.println((byte)value);
		//低类型向高类型自动转换
		System.out.println("累加 byte 等于："+b);
		System.out.println("累加 char 等于："+(b+c));
		System.out.println("累加 short 等于："+(b+c+s));
		System.out.println("累加 int 等于："+(b+c+s+j));
		System.out.println("累加 long 等于："+(b+c+s+j+l));
		System.out.println("累加 float 等于："+(b+c+s+j+l+f));
		System.out.println("累加 double 等于："+(b+c+s+j+l+f+d));
		//高类型到的类型的强制准换
		System.out.println("把long强制转换成int："+(int)l);
		//高类型到的类型的转化会丢失数据
		System.out.println("把long强制转换为short："+(short)l);
		//实数到整形转换将舍弃小数部分
		System.out.println("把double强制转换为int："+(int)d);
		//整数到字符类型转换将获取对应编码字符
		System.out.println("把 short强制转化为char 等于："+(char)s);
		int hangshu = 20;  
		int yiban = hangshu / 2 + 1;  
		int yibanduo = hangshu / 2;  
		System.out.println("空心菱形：");  
		for(int k = 1;k <= yiban;k++){  
		    for(int i = 1;i <= (yiban - k);i++){  
		        System.out.print(" ");  
		    }  
		    System.out.print("*");  
		    for(int i = 1;i <= ( (k - 2) * 2 + 1);i++){  
		        System.out.print(" ");  
		    }  
		    if(k != 1){  
		        System.out.print("*");    
		    }  
		    System.out.println();  
		}  
		for(int k = yibanduo;k >=1;k--){  
		    for(int i = 1;i <= (yiban - k);i++){  
		        System.out.print(" ");  
		    }  
		    System.out.print("*");  
		    for(int i = 1;i <= ( (k - 2) * 2 + 1);i++){  
		        System.out.print(" ");  
		    }  
		    if(k != 1){  
		        System.out.print("*");    
		    }  
		    System.out.println();  
		}  
		int row = 10;
		for (int i = -row; i <= row; i++) {
			for (int k = -row; k <= row; k++) {
				System.out.print((Math.abs(i) + Math.abs(k) == row ) ? "*" : " ");
			}
			System.out.println();
		}
	
			
	}

}
