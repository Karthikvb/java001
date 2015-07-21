package first;

class Base {
	Base() {
		System.out.println("Base Class Constructor Called ");
	}
}

class Derived extends Base {
	Derived() {
		System.out.println("Derived Class Constructor Called ");
	}
}

class Son extends Derived {
	Son() {
		System.out.println("Son Class Construtor called ");
	}
}

public class Inheritance1 {
	public static void main(String[] args) {  
		Son d = new Son();
		System.out.println(d);
	}
}