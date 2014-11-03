import java.util.Scanner;

public class Test
{
	public static void main (String[] args)
	{
		String A[] = {"bla", "bla", "blabla"};
		Integer B[] = {2, 4, 4};
		afficherTab(A);
		afficherTab(B);
	}
	public static void afficherTab (Object[] T)
	{
		for (Object element : T)
		{
			System.out.print(element + " ");
		}
		System.out.println();
	}
}