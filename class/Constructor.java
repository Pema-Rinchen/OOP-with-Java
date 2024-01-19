
public class Constructor {
	private int a;
	public Constructor() {
		System.out.println("hey,its me");
		a=10;
	}
	
	public Constructor(int a ) {
		System.out.println("hey,its you ");
		this.a=a;
	}

public static void main(String[] args) {
	System.out.println("deafult construcor");
	Constructor c=new Constructor();
	System.out.println(c.a);
	System.out.println("\nparametiozed constructotr");
	Constructor cc=new Constructor(12);
	System.out.println(cc.a);
	
}
}
