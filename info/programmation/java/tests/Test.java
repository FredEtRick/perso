import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		float pi = 3.14f;
		double PI = 3.141592d;
		System.out.println(pi + " " + PI);
		System.out.println("Entres un grand nombre puis un très grand");
		Scanner S = new Scanner (System.in);
		pi = S.nextFloat();
		PI = S.nextDouble();
		System.out.println(pi + " " + PI);
	}
}