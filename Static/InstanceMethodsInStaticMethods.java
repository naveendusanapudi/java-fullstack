class InstanceMethodsInStaticMethods
{
	static int a;
	static void static1(int a)
	{
		System.out.println("Its an Static method ");
		System.out.println(a);
		InstanceMethodsInStaticMethods ob=new InstanceMethodsInStaticMethods();
		ob.instance1();
		
	}
	void instance1()
	{
		System.out.println("Its an Instance method");
		// static1(a);
	}
	public static void main(String[] args)
	{
		InstanceMethodsInStaticMethods in=new InstanceMethodsInStaticMethods();
		in.instance1();
		/*int a=0;
		in.static1(a);
		*/
	}
}
		