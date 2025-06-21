class LocalGlobalVariables
{
	static int a=35;
	public static void main(String[] arr)
	{
		LocalGlobalVariables lg=new LocalGlobalVariables();
		int a=89;
		System.out.println(a);
		System.out.println(LocalGlobalVariables.a);

	}
}
	