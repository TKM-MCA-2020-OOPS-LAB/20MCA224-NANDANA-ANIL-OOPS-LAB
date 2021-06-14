package javaproject;
class demo extends Thread{
	
	public void run() {
		System.out.println("\n>>>>>>>>>>>>HELLO WORLD<<<<<<<<<<<<<<<<\n");
	}
	
}
public class Testthread {
	public static void main(String args[]) throws InterruptedException 
	{
	demo d = new demo();
	d.start();
	System.out.println("state: "+d.getState());
	System.out.println("state: "+d.getState());
	System.out.println("state3: "+d.getState());
	System.out.println("state4: "+d.getState());
	System.out.println("Name: "+d.getName());
	System.out.println("Priority: "+d.getPriority());
	System.out.println("state5: "+d.getState());
	d.sleep(100);
	
   }

}
