package ServerView;

import java.util.Scanner;

public class SEday2 {
	public static void main(String[] args) {
		demo1();
		/*Person p=new Person();
		System.out.println(p);
		demo2(p);*/
		//demo4();
		//demo3();
		//actor a=new actor();
		//a.shoot();
		/*Animal a=new Animal();
		a.eat();
		Cat c=new Cat();
		c.eat();
		c.setAge(11);
		c.getAge();
		System.out.println(c.getAge());*/
		//Father f=new Father();
		Son s=new Son();
		Son s0=new Son("张三",12);
		s.speak();
		//super.speak();
		//System.out.println(f.num2 + s.num2);
		
	}

	private static void demo4() {
		System.out.println("hehe");
		
		/*dog d0=new dog();
		d0.setAge(223);
		System.out.println(d0.getAge());*/
		//actor a0=new actor();
		//a0.speak();
		//actor.speak();
		actor a0=new actor();
		actor a1=new actor();
		actor a2=new actor();
		actor.speak(null);
		a2.speak("cc");
		//System.out.println((int)(Math.random()*30+1));
	}

	private static void demo3() {
		Scanner sc=new Scanner(System.in);
		int aim=(int)(Math.random()*1000+1);
		while(true) {
			int num=sc.nextInt();
			if(num>aim) {
				System.out.println("输入的数字大了");
			}else if(num<aim) {
				System.out.println("输入的数字小了");
			}else {
				System.out.println("get it");
				break;
			}
		}
	}

	private static void demo2(Person p) {
		p.name="jone";
		p.age=100;
		p.speak();
	}

	private static void demo1() {
		Person p0=new Person();
		p0.speak();
		demo0(p0);
		new Person().speak();
		demo0(new Person());
	}

	private static void demo0(Person p0) {
		System.out.println(p0);
	}
	
}
class Father{
	private String name;
	private int age;
	private int sal;
	public Father() {
		//System.out.println("父类无参构造");
	}
	public Father(String name,int age) {
		this.name=name;
		this.age=age;
		//this.sal=sal;
		//System.out.println("父类有参构造");
	}
	public void speak() {
		System.out.println("父类的方法");
	}
	
}
class Son extends Father{
	int sal;
	public Son() {
		super();
		//this("jone",12,1111);
		//System.out.println("子类无参构造");
	}
	public Son(String name,int age) {
		//super(String name,int age);
		//this.sal=sal;
		super(name,age);
		//System.out.println("子类有参构造");
	}
	public void speak() {
		//super.speak();
		System.out.println("子类的方法");
	}
	}

class Animal{
	private String name;
	private String color;
	private int age;
	public Animal() {}
	public Animal(String name,String color,int age) {
		this.name=name;
		this.color=color;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void eat() {
		System.out.println("吃饭");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
}
class Cat extends Animal{
	
}
class Fish extends Animal{
	
}
class actor{
	
	static {
		int e=12;
		System.out.println("我是静态代码块");
	}
	
	public actor(String name) {
		super();
		this.name = name;
	}

	private String name;
	static String nation="Japan";
	private static int num=0;
	public actor() {
		num++;
		System.out.println(num);
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	{
		System.out.println("我是构造代码块");
	}
	public static void speak(String name) {
		System.out.println("hehe" + name);
	}
	public void shoot() {
		System.out.println("kill");
		{
			int h=990;
			System.out.println("在类的成员方法中的局部代码块" + h);
		}
	}


	
}
class dog{
	private String name;
	private int age;
	private double sal;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		age = age;
	}
	
}
class Person{
	@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.name + this.age + this.num;
}
	//成员属性
	String name;
	int age;
	int num=20;
	//成员方法
	public void speak() {
		//num=10;
		System.out.println(name);
		System.out.println(num);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(null, super.hashCode()) + this.age;
	}
}
