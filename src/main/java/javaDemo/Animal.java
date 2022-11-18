package javaDemo;

import org.apache.poi.util.SystemOutLogger;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Animal obj = new Animal();
		obj.cow();
		obj.horse();
		obj.fish();
		obj.cat();
		
		obj.add(5,3);
		
	}

	public void cow() {
		System.out.println("cow is a domistic animal");
	}
	private void horse() {
		System.out.println("horse is a fast animal");
	}
	void fish() {
		System.out.println("fish live in water");
	}
	protected void cat() {
		System.out.println("cat is nice ");
	}
	public int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
		}
}
