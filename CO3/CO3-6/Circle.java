package java_programming;
import java.util.Scanner;
public interface Shapes {

public interface calculation {
	void input();
	void getdata();
	void area();
	void perimeter();
}
class Circle implements calculation{

class Circle implements Shapes{
int r;
double pi=3.14,a,p;
public void input() {
double pi=3.14,q,p;
public void getdata() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of circle");
	r=sc.nextInt();

}
public void area() {
	a=pi*r*r;
	System.out.println("area of the circle is:"+a);
	q=pi*r*r;
	System.out.println("Area of the circle is         :  "+q);

}
public void perimeter() {
	p=2*pi*r;
	System.out.println("perimeter of the circle is:"+p);
	System.out.println("Perimeter of the circle is    :  "+p);
}	
}
class Rectangle implements calculation{
int l,b,a,p;
public void input() {
class Rectangle implements Shapes{
int l,b,p,q;
public void getdata() {
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the length of rectangle");
l=sc1.nextInt();
System.out.println("Enter the breadth of rectangle");
b=sc1.nextInt();
}
public void area() {
	a=l*b;
	System.out.println("area of the rectangle is:"+a);
	q=l*b;
	System.out.println("Area of the rectangle is      :  "+q);
}
public void perimeter() {
	p=2*(l+b);
	System.out.println("perimeter of the rectangle is:"+p);
	System.out.println("Perimeter of the rectangle is :  "+p);

}
}
public class Main {


	public static void main(String[] args) {
		int c=0;
		int ch=0;
		Circle obj=new Circle();
		Rectangle obj1=new Rectangle();

		while(c<3) {
		while(ch<=3) {
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter your shape:\n1.Circle:\n2.Rectangle: ");
		c=sc2.nextInt();
		switch(c) {
		System.out.println("CHOICES         : \n    1.Circle       \n    2.Rectangle    \n    3.Exit");
		System.out.println("Enter your choice  :  ");
		ch=sc2.nextInt();
		switch(ch) {
		case 1:
			obj.input();
			obj.getdata();
			obj.area();
			obj.perimeter();
			break;
		case 2:
			obj1.input();
			obj1.getdata();
			obj1.area();
			obj1.perimeter();
			break;
		case 3:
			System.out.println("exit");
			break;
		 default:
			 System.out.println("You are wrong!");
			 System.out.println("Wrong choice");
		}
	 }

   }
	}
	}