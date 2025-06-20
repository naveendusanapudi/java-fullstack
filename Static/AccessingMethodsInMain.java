class AccessingMethodsInMain
{
	static int a=11,b=37;
	int x=9,y=7;
	static void stmethod1()
	{
		System.out.println("Accessing static variables to static method "+(a+b));
	}
	static void stmethod2()
	{
		System.out.println("We can't Access instance variables to static method");
	}
	void instance1(){
		System.out.println("Accessing Instance var to instane method "+(x+y));
	}
	void instance2(){
		System.out.println("Accessing static var to instane method "+(a+b));
	}
	public static void main(String[] args)
	{
		AccessingMethodsInMain st = new AccessingMethodsInMain();
		st.instance1();
		st.instance2();
		st.stmethod1();
		st.stmethod2();
	}
}