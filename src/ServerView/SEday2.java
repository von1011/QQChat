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
		Son s0=new Son("����",12);
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
				System.out.println("��������ִ���");
			}else if(num<aim) {
				System.out.println("���������С��");
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
		//System.out.println("�����޲ι���");
	}
	public Father(String name,int age) {
		this.name=name;
		this.age=age;
		//this.sal=sal;
		//System.out.println("�����вι���");
	}
	public void speak() {
		System.out.println("����ķ���");
	}
	
}
class Son extends Father{
	int sal;
	public Son() {
		super();
		//this("jone",12,1111);
		//System.out.println("�����޲ι���");
	}
	public Son(String name,int age) {
		//super(String name,int age);
		//this.sal=sal;
		super(name,age);
		//System.out.println("�����вι���");
	}
	public void speak() {
		//super.speak();
		System.out.println("����ķ���");
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
		System.out.println("�Է�");
	}
	public void sleep() {
		System.out.println("˯��");
	}
}
class Cat extends Animal{
	
}
class Fish extends Animal{
	
}
class actor{
	
	static {
		int e=12;
		System.out.println("���Ǿ�̬�����");
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
		System.out.println("���ǹ�������");
	}
	public static void speak(String name) {
		System.out.println("hehe" + name);
	}
	public void shoot() {
		System.out.println("kill");
		{
			int h=990;
			System.out.println("����ĳ�Ա�����еľֲ������" + h);
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
	//��Ա����
	String name;
	int age;
	int num=20;
	//��Ա����
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
