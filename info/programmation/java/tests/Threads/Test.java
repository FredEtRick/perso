

public class Test
{
	public static void main (String[] args)
	{
		ThreadPerso T1 = new ThreadPerso("A");
		ThreadPerso T2 = new ThreadPerso("B", T1);
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Statut du thread " + T1.getName() + " = " + T1.getState());
		System.out.println("Statut du thread " + T2.getName() + " = " + T2.getState());
	}
}