package day3java;

public class Typesofinheritance extends Parent1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Parent3 P3 = new Parent3();	
      P3.sum(); 
      Parent1 p1 = new Parent1();
      p1.sum(); 
	}
}

class Parent1{ // parent 
	void sum() {
	System.out.println("hi this is a parent");
}
}
class Parent2 extends Parent1{ //child 1 of parent 1
}
class Parent3 extends Parent2{ //child2
 void sum() {
	 System.out.println("program successfull!");
}
}