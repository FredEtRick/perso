import java.util.Scanner;

public class Test
{
	public static void main (String[] args)
	{
		int T[][] = new int[4][6];
		for(int[] i : T)
		{
			for(int j : i)
				System.out.print(j);
			System.out.println();
		}
	}
}