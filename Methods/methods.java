class methods
{
	int a=10,b=20;
	//add
	public void add()
	{
		System.out.println(a+b);
	}
	//sub
	public int sub()
	{
		return a-b;
	}
	//mul
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	
	//Div
	public int div(int a, int b)
	{
		return a/b;
	}
	public static void main(String [] args)
	{
		methods m=new methods();
		m.add();
		System.out.println(m.sub());
		m.mul(10,20);
		System.out.println(m.div(10,20));
	}
}