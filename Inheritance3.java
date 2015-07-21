package first;

class Base2 {
	 int a, b = 10;
    // virtual by default
    public void show() {
       System.out.println("Base::show() called");
    }
}
 
class Derived2 extends Base2 {
	int c, d=20;
    public void show() {
       System.out.println("Derived::show() called");
    }
}
 
public class Inheritance3 {
    public static void main(String[] args) {
        Base2 b = new Derived2();;
        b.show();
        System.out.println(b.a);
        System.out.println(b.b);
    }
}