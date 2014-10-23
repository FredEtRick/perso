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
		long binaire = 0b011101101101011011110101110L;
		System.out.println(deutiere + " " + precis + " " + entiers + " " + chars + " " + chaar + " ");
		System.out.println(hexa + " " + binaire);
	}
}