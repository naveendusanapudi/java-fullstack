class StaticInInstance
{
	static int a=9;
	void demo()
	{
		System.out.println("We can access static variable in instance method directly "+a);
	}
	public static void main(String[] args)
	{
		StaticInInstance is=new StaticInInstance();
		//int y=is.a;
		is.demo();
	}
}