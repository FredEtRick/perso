import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		Scanner entree = new Scanner (System.in);
		String continuer;
		do
		{
			System.out.print("Quel est ton prénom ? ");
			System.out.println(entree.nextLine());
			do
			{
				System.out.print("true pour continuer false pour arrêter. ");
				continuer = entree.nextLine();
			} while (!(continuer.equals("true")) && !(continuer.equals("false")));
		} while (Boolean.parseBoolean(continuer));
	}
}