public class bubble {
	static int kk, ff, jj;
	static boolean boolVar;
	static int[] mm = {4, 1, 3, 5};
	public static void main(String args[])
	{
	do
	{
		boolVar = false;
		jj++;
		for (int ii=0; ii<mm.length - jj; ii++)
		{
			if (mm[ii]>mm[ii+1])
			{
				kk = mm[ii+1];
				mm[ii+1] = mm[ii];
				mm[ii] = kk;
				boolVar = true;
			}
		}
	}while (boolVar == true);
	for (int xx = 0; xx < mm.length; xx++)
	{
		System.out.print(mm[xx]+"   ");
	}
	}
}
