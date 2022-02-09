package day3java;

class Parent1{ // parent 
	void sum() {
}
}
class Parent2 extends Parent1{ //child 1 of parent 1
}
class Parent3 extends Parent2{ //child2
 void sum() {
	 System.out.println("program successfull!");
}
}
 public class Typesofinheritance extends Parent1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Parent3 P3 = new Parent3();	
      P3.sum(); 
	}
}