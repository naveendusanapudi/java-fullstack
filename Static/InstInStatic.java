class InstInStatic
{
	int a=9;
	static{
		System.out.println("We cannt access instance variable in static method");
	}
	static void demo(int x)
	{
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		InstInStatic is=new InstInStatic();
		int y=is.a;
		is.demo(y);
	}
}