import java.util.Scanner;

public class Test
{
	public static void main (String[] args)
	{
		int T[][][] = {{{2, 3}, {1, 2}}, {{1, 1}, {0, 0}}};
		int A[][][][][] = new int[4][6][2][2][3];
		for (int[][] sousTab : T)
		{
			for (int[] SST : sousTab)
			{
				for (int element : SST)
				{
					System.out.print(element + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		for (int[][][][] sousTab : A)
		{
			for (int[][][] SST : sousTab)
			{
				for (int[][] S3T : SST)
				{
					for (int[] S4T : S3T)
					{
						for (int element : S4T)
						{
							System.out.print(element + " ");
						}
						System.out.println();
					}
					System.out.println();
				}
				System.out.println("=====================================");
			}
			System.out.println("=====================================");
			System.out.println("=====================================");
			System.out.println("=====================================");
		}
		System.out.println("\n\n\n\n" + T.length + " " + A.length);
		System.out.println(tronque(10.64564847684684d, 5));
	}
	public static double tronque(double nombre, int precision)
	{
		return (double) ((int) (nombre * Math.pow(10, precision)) / 1) / Math.pow(10.d, precision);
	}
}