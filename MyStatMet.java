public class MyStatMet {
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creatingobjects");
	}
	public static void main(String[] args) {
		myStaticMethod();
		
		MyStatMet myObj = new MyStatMet();
		myObj.myPublicMethod();
	}
}