public class perevernut {
	public static void main(String args[])
	{
		String slovo = "Galya Tashit Dotu";
		char [] array = slovo.toCharArray();
		for (int xx = 0; xx < array.length; xx++)
		{
			System.out.print(array[xx]);
		}
		System.out.println();
		for (int xx = 0; xx < array.length; xx++)
		{
			System.out.print(array[array.length-1-xx]);
		}
	}
}
