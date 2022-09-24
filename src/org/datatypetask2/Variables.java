package org.datatypetask2;

public class Variables {
	private void integer() {
		byte age = 28;
		short yob = 1994;
		int regNo = 11114065;
		long mobNo = 8508252808L;
		System.out.println("Example for byte :\n  Age : "+age);
		System.out.println("Example for short :\n  Year of Birth : "+yob);
		System.out.println("Example for int :\n  Registrasion No. : "+regNo);
		System.out.println("Example for long : \n  Mobile No. : "+mobNo);
	}
	private void floatingPoint() {
		float quarter = 0.25F;
		double pi = 3.14285714D;
		System.out.println("Example for float :\n  Value of Quarter : "+quarter);
		System.out.println("Example for double :\n  Value of Pi : "+pi);
	}
	private void stringChar() {
		char initial = 'P';
		String name = "Mathivanan";
		System.out.println("Example for char :\n  Initial : "+initial);
		System.out.println("Example for String : \n  Name : "+name);
	}
	private void boo() {
		boolean availability = true;
		System.out.println("Example for boolean :\n  Availabily : "+availability);
	}
	public static void main (String[] args) {
		Variables variable = new Variables();
		variable.integer();
		variable.floatingPoint();
		variable.stringChar();
		variable.boo();
		
		System.out.println("After Conflict");
	}

}
