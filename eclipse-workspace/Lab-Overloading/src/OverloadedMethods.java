
public class OverloadedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadedMethods om = new OverloadedMethods();
		om.print();
		
		om.print("second print method");

		om.print("second","thrid");
	}
	
	//overload methods here
	public void print() {
		System.out.println("original print method.");
	}
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public void print(String str, String str2) {
		System.out.println(str + " " + str2);
	}
}
