package project;

public class singleton1 {
	public static singleton1 b=null;
	private singleton1() {}
	public static singleton1 method() {
		if(b==null) {
			b=new singleton1();
			
		}
		return b;
	}
	public static void main(String[]args) {
		singleton1 ss=method();
		singleton1 ss1=method();
		singleton1 ss2=method();
		singleton1 ss3=method();
		
		System.out.println(System.identityHashCode(ss));
		System.out.println(System.identityHashCode(ss1));
		System.out.println(System.identityHashCode(ss2));
		System.out.println(System.identityHashCode(ss3));
	}

}
