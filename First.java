package first;

import java.util.Scanner;

public class First {
	String a[];
	String b[];
	float f;
	
	//Default or Empty Constructor
	public First() {
		a = new String[10];
		b = new String[10];
	}
	
	//Parameterized constructor
	public First(int lengtha) {
		a = new String[lengtha];
	}
	
	public First(float l) {
		f = l;
	}
	
	public First(int lengtha, int lengthb) {
		a = new String[lengtha];
		b = new String[lengthb];
	}
	
	
	public void getAndPrintArray() {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the number:");
			a[i] = s.nextLine();
		}
		
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}
	public static void main(String[] args) {
		First f = new First();
		f.getAndPrintArray();
		System.out.println(f.a);
		
		First f1 = new First(20);
		f1.getAndPrintArray();
	}
}
