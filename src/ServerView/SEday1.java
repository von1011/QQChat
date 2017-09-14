package ServerView;
//java基础、面向对象、

public class SEday1 {
	public static void main(String[] args) {
		//demo1();//day01
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		//demo6();
		//demo7();
		//demo8();
		//demo9();
		//demo10();
		//demo11();
		//demo12();
		//demo13();
		//demo14();
		//demo15();
		student s=new student();
		s.age=100;
		
		
		
		
		
	}






	private static void demo15() {
		int[][] arr=new int[][] {{11,22,33},{22,33,44},{33,44,55}};
		int res=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//System.out.println(arr[i][j]);
				res=res+arr[i][j];
			}
			
		}
	}






	private static void demo14() {
		//int[] arr;
		//arr=new int[10];
		//arr[0]=1;
		//arr= {11,22,33,44,55,66,77,88,99,10};
		byte[] barr=new byte[] {11,22,33,44,55};
		byte value;
		for (int s = 0; s < barr.length; s++) {
			System.out.println(barr[s]);
			//byte temp=barr[0];
			//if(temp<barr[s]) {
				//temp=barr[s];
			}
			//byte temp=barr[s];
			//barr[s]=barr[barr.length-1-s];
			//barr[barr.length-1-s]=temp;
			//if(barr[s]==value) {
				//return value;
	}
		
		
		
	
	

	private static void demo13() {
		/*我想在控制台输出2次:“Java基础班“
		我想在控制台输出7次:“Java基础班“
		我想在控制台输出13次:“Java基础班“*/
		for(int i=1;i<=10;i++) {
			if(i%4==0) {
				System.out.println("java从基础班");
			}
		}
		for(int i=1;i<=10;i++) {
			if(i%8==0) {
				break;
			}
			System.out.println("java从基础班");
		}
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				System.out.println("java从基础班");
			}
			System.out.println("java从基础班");
		}
	}

	private static void demo12() {
		//需求：请输出一个4行5列的星星(*)图案
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		/*需求：请输出下列的形状
		*
		**
		***
		****
		******/
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		//需求：在控制台输出九九乘法表。
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("i" + '*' + 'j' + '=' +(i*j) + '\t');
			}
			System.out.println('\t');
		}
		for(int i=1;i<=10;i++) {
			if(i%4==0) {
				break;
			}
			System.out.println(i);
		}
		for(int i=1;i<=10;i++) {
			if(i%5==0) {
				continue;
			}
			System.out.println(i);
		}
	}

	private static void demo11() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		int res0=0;
		for(int i=1;i<=10;i++) {
			res0=res0+i;
			System.out.println(res0);
		}
		int res1=0;
		for(int i=2;i<=100;i=i+2) {
			res1=res1+i;
		}
		for(int i=100;i<=1000;i++) {
			int bai=i/100;
			int shi=(i%100)/10;
			int ge=i%10;
			if(ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
				int count=0;
				count=count+1;
				System.out.println(i);
			}
		}
	}

	private static void demo10() {
		int money=100;
		switch(money+1) {//表达式可以byteintshortstring枚举
			case 100:
				System.out.println("大土豪");
				break;
			case 99:
				System.out.println("土豪");
				break;
			case 98:
				System.out.println("屌丝");
				break;
			default:
				System.out.println("穷屌丝");
				break;
		}
	}

	private static void demo9() {
		int x,y,z;
		x=99;
		y=98;
		z=100;
		
		if (x>y) {
			if (x>z) {
				System.out.println(x);
			}else if (x<z) {
				System.out.println(z);
			}
		}else {
			if(z>y) {
				System.out.println(z);
			}else {
				System.out.println(y);
			}
		}
	}

	private static void demo8() {
		int age=100;
		if (age>18) {
			System.out.println("允许进入");
		}
		
		int grade=98;
		if (grade<90) {
			System.out.println("吃屎");
		}else {
			System.out.println("吃屁");
		}
		
		int money=100;
		if (money>100) {
			System.out.println("缴税");
		}else if (money<100) {
			System.out.println("免税");
		}else {
			System.out.println("没收");
		}
	}

	private static void demo7() {
		short s0=1;
		s0=(short)(s0+1);
		
		int x=97;
		int y=99;
		int z=100;
		
		System.out.println((x=(x>y)?x:y)>z?x:z);
	}

	private static void demo6() {
		int i=4;
		int y=(i++)+(++i)+(i*10);//4+6+6*10;
		System.out.println(y);
		
		byte b0=10;
		b0++;
		b0=(byte)(b0+1);
		System.out.println(b0);
	}

	private static void demo5() {
		int i0=100;
		int i1=33;
		int i2=i0/i1;//zhengshu
		
		float f0=11.1f;
		
		System.out.println(i1%i0);
	}

	private static void demo4() {
		byte b0=89;
		byte b1=10;
		byte b2=(byte)(b0+b1);
		System.out.println(b2);
		System.out.println("hehe"+'w');
		char c=58;
		System.out.println(c);
	}

	private static void demo3() {
		byte b=5;
		int i=6;
		//System.out.println((byte)(b+i));
		byte b0=(byte)300;
		//System.out.println('a'+3);//yinshizhuanhuan.
		//System.out.println((char)('a'+3));
		System.out.println('a'+3+"hehe");
	}

	private static void demo2() {
		long a=99999999999999999l;
		double f=1234.34556f;
		char c='b';
		System.out.println(f);
	}

	private static void demo1() {
		System.out.println("hellojava");
	}

}
class student{
	String name;						
	int age;							
	String gender;						

	public void study() {				
		System.out.println("学生学习");
	}

	public void sleep() {				
		System.out.println("学生睡觉");
	}

}
