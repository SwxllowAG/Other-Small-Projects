import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class main 
{
	static int min, jj, kk, zz;
	static boolean boolVar;
	static int[] mm = new int[10];
	//static String[] aa = new String[10];
	static Scanner scan;
	public static void main(String args[])
	{
		openfile();
		readfile();
		out();
	}
	private static void openfile() 
	{
		try 
		{
		scan = new Scanner(new File("chtenie//1.txt"));
		}catch(Exception e){JOptionPane.showMessageDialog(null, "No File");}
	}
	private static void readfile() 
	{
		for(int zz=0; zz < mm.length; zz++)
		{
			//aa[zz] = scan.next();
			//mm[zz] = Integer.parseInt(aa[zz]);
			mm[zz] = scan.nextInt();
		}
		do 
		{
			boolVar = false;
			min = mm[jj];
			for (int yy=0; yy<mm.length-jj; yy++)
			{
				if(min>mm[jj+yy])
				{
					min = mm[jj+yy];
					zz=jj+yy;
					boolVar = true;
				}
				else
				{}
			}
			kk = mm[jj];
			mm[jj]=min;
			mm[zz]=kk;
			jj++;
		}while (boolVar == true);
	}
	private static void out() 
	{
		for (int xx = 0; xx < mm.length; xx++)
		{
			System.out.print(mm[xx]+"   ");
		}
	}
}

