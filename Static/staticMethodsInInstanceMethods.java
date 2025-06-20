class staticMethodsInInstanceMethods
{
	static void stmethod()
	{
		System.out.println("It is an static method");
	}
	void instmethod()
	{
		System.out.println("Calling staticMethodsInInstanceMethods");
		stmethod();
	}
	public static void main(String[] args)
	{
		staticMethodsInInstanceMethods si=new staticMethodsInInstanceMethods();
		si.instmethod();
	}
}