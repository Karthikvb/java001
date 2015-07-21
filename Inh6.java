package first;

interface i1 {
	int a = 0, b = 0;
	public void print();
}

interface i2 {
	int c = 1, d = 2;
	public void set();
}

interface i3 extends i1, i2 {
	int e = 0, f = 0;
	public void get();
}

class c1 implements i1 {
	public void print() {
		System.out.println("c1 implementing i1");
	}
}


class c2 implements i1, i2 {

	@Override
	public void set() {
		// TODO Auto-generated method stub
		System.out.println("c2 implementing i1 & i2");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("c2 implementing i1 & i2");
	}
	
}

class c3 implements i3 {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("c2 implementing i3");
	}

	@Override
	public void set() {
		// TODO Auto-generated method stub
		System.out.println("c2 implementing i3");
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("c2 implementing i3");
	}
	
}

class c4 extends c1 {
	
}

class c5 extends c1 implements i1 {
	
}

class c6 extends c1 implements i2 {

	@Override
	public void set() {
		// TODO Auto-generated method stub
		System.out.println("c6 extending c1 implementing i2");
	}
	
}

class c7 extends c6 implements i1, i2, i3 {

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("c7 extending c6 implemnting i1, i2, i3");
	}
	
}

public class Inh6 {
	public static void main(String... args) {
		i1 obj1 = new c1();
		obj1.print();
		
		c1 obj2 = new c1();
		obj2.print();
		
		c7 obj3 = new c7();
		obj3.print();
		obj3.get();
		obj3.set();
		
		i1 obj4 = new c7();
		obj4.print();
		
		i2 obj5 = new c7();
		obj5.set();
		
		i3 obj6 = new c7();
		obj6.get();
		
		c6 obj7 = new c7();
		obj7.print();
		obj7.set();
	}
}
