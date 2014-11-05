import java.util.*;

public class Test
{
	public static void main (String[] args)
	{
		System.out.println("sinus de 10 : " + arrondi(-2.9991, 3));
	}
	public static double arrondi (double nombre, int precision)
	{
		return ((double) (int) (nombre * Math.pow(10, precision))) / Math.pow(10, precision);
	}
}