package MyPackage;

public class ComplexNumber{
	int r, i;
	
	public ComplexNumber(int r, int i){
		this.r = r;
		this.i = i;
	}

	public static void Add(ComplexNumber c1, ComplexNumber c2){
		System.out.print("(" + c1.r + " + " + c1.i + "i)");
		System.out.print(" + ");
		System.out.print("(" + c2.r + " + " + c2.i + "i)");
		System.out.println(" = (" + (c1.r + c2.r) + " + " + (c1.r + c2.i) + "i)");
	}
}
