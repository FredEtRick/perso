

public class ThreadPerso extends Thread
{
	Thread t;
	public ThreadPerso (String nom)
	{
		super(nom);
		System.out.println("Statut du thread " + nom + " = " + this.getState());
		this.start();
		System.out.println("Statut du thread " + nom + " = " + this.getState());
	}
	public ThreadPerso (String nom, Thread t)
	{
		super(nom);
		this.t = t;
		System.out.println("Statut du thread " + nom + " = " + this.getState());
		this.start();
		System.out.println("Statut du thread " + nom + " = " + this.getState());
	}
	public void run()
	{
		for (int i=0 ; i<10 ; i++)
		{
			System.out.println("Statut du thread " + this.getName() + " = " + this.getState());
			if (this.t != null)
				System.out.println("Statut du thread " + t.getName() + " pendant le thread " + this.getName() + " : " + t.getState());
		}
	}
}
