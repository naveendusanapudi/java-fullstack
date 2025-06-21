class Stringequalsignore
{
	public static void main(String [] args)
	{
		String s1 = "Naveen";
		String s2 = "naveen";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.startsWith("Nav"));
		System.out.println(s2.endsWith("een"));
		System.out.println(s1.compareTo("s2"));
		
	}
}