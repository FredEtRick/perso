import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		float deutiere = 2f / 3f;
		float precis = 2.000000000000000000001f;
		double entiers = 2+3;
		double chars = 'a' + 'b';
		byte chaar = 'e';
		long hexa = 0xff48e6948acbL;
		System.out.println(deutiere + " " + precis + " " + entiers + " " + chars + " " + chaar + " ");
		System.out.println(hexa);
		Scanner entree = new Scanner(System.in);
		System.out.println("Entrez un entier");
		int entier = entree.nextInt();
		System.out.println(entier);
		System.out.println("Entrez un réel");
		double reel = entree.nextDouble();
		System.out.println(reel);
		System.out.println("Entrez du texte");
		String texte = entree.nextLine();
		System.out.println(texte);
	}
}