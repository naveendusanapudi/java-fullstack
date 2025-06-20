class AccessingVarInMain
{
	static int a=11,b=37;
	int x=9,y=7;
	public static void main(String[] args)
	{
		AccessingVarInMain st=new AccessingVarInMain();
		System.out.println("Accessing static variables in main "+a);
		System.out.println("Accessing static variables in main "+b);
		System.out.println("Accessing instance variables in main "+st.x);
		System.out.println("Accessing instance variables in main "+st.y);

	}
}