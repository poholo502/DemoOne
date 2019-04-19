
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		System.out.println(a.instanceCount); //instanceCount is just an instance of class A
		System.out.println(A.staticCount); 	//notice that here we use the class name A, 
											//not just the instance of class A, a, 
											//because we want to access the member of class A, not just an instance of A
		
		//When we run this, it will print 1,1 because when we create an instance, we increment the default value of 0 by 1
		
		A a2 = new A();
		
		System.out.println(a2.instanceCount); 
		System.out.println(A.staticCount);
		
		//When we runt this, it will print
		
		//1 - instanceCount for a
		//1 - staticCount for the class A
		//1 - instanceCount for a2
		//2 - staticCount for the class A
		
		//the static count for the entire class is now 2
		
		a.setInstanceCount(15);;
		
		System.out.println("object a instanceCount: " + a.instanceCount);
		System.out.println("object a2 instanceCount: " + a2.instanceCount);
		
		A.setStaticCount(2494);
		
		System.out.println("class A staticCount: " + A.staticCount);
	}

}
