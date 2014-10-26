import java.util.*;

public class Test
{
	public static void main (String[] args)
	{
		System.out.println("combien de pattes avez vous ?");
		Scanner entree = new Scanner(System.in);
		int pattes = entree.nextInt();
		switch (pattes)
		{
			case 0 :
				System.out.print("Vous êtes un ");
				System.out.println("vers de terre");
				break;
			case 1 :
				System.out.print("Vous êtes un ");
				System.out.println("unijambiste");
				break;
			case 2 :
				System.out.print("Vous êtes un ");
				System.out.println("humain");
				break;
			case 4 :
				System.out.print("Vous êtes un ");
				System.out.println("chien");
				break;
			case 8 :
				System.out.print("Vous êtes une ");
				System.out.println("pieuvre");
				break;
			case 12 :
				System.out.print("Vous êtes un ");
				System.out.println("human centiped");
				break;
			case 1000 :
				System.out.print("Vous êtes un ");
				System.out.println("mille pattes");
				break;
			default :
				if (pattes < 0)
					System.out.println("Vous êtes un menteur");
				else
					System.out.println("Vous êtes un extra-terrestre");
		}
	}
}