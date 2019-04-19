
public class A {
	
	//static member
	public static int staticCount = 0;
	
	//instance member
	public int instanceCount = 0;
	
	public A() {
		staticCount++;
		this.instanceCount++;
	}
	
	public static int getStaticCount() {
		return A.staticCount; 
	}
	
	public static void setStaticCount(int staticCount) {
		A.staticCount = staticCount;  // notice here, we don't use the (this) keyword, we use the class name as a qualifier
	}
	
	public int getInstanceCount() {
		return this.instanceCount;
	}
	
	public void setInstanceCount(int instanceCount) {
		this.instanceCount = instanceCount;
	}

}
