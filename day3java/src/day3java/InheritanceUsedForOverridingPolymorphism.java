package day3java;

public class InheritanceUsedForOverridingPolymorphism {

	int a=1;// declaring+intialization
	int b =9;
	int c;
	
	void sum() {
		c=a+b;
		System.out.println("Result: " + c);
	}
		void multiplication(int a, double b) {//parent
			System.out.println("Parent Result of Multiplication: " +(a*b));
			System.out.println("Hello Child");
		}
		void display() {
			System.out.println("Hello CHild");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceUsedForOverridingPolymorphism iufop = new InheritanceUsedForOverridingPolymorphism();
		iufop.sum();
		iufop.multiplication(3, 2.5);
		A a = new A();
		a.display();
		iufop.display();
		iufop.multiplication(3, 4.0);// declare in class A which is parent class
		a.character();
	}

}

class A{
	void multiplication(int a, double b) {//parent
		System.out.println("Parent Result of Multiplication: " +(a*b));
	}
	void display() {
		System.out.println("Hello Parent");
	}
	void character() {
		System.out.println("program successfull");
	}
}	
	