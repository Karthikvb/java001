package first;

class Base1 {
	  int x;
	  Base1() {
		  
	  }
	  Base1(int _x) {
	    x = _x;
	  }
}
	 
class Derived1 extends Base1 {
	  int y;
	  Derived1(int _x, int _y) {
	    super();
	    y = _y;
	  }
	  void Display() {
	    System.out.println("x = "+x+", y = "+y);
	  }
}
	 
public class Inheritance2 {
	  public static void main(String[] args) {  
	    Derived1 d = new Derived1(10, 20);
	    d.Display();
	  }
}

