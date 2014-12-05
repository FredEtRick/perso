import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public class Test
{
	public static void main(String[] args)
	{
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("iooj");
		ls.add("ioeztoj");
		ls.add("iozetoj");
		ls.add("izetooj");
		ObjectOutputStream oos;
		try
		{
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
					  new FileOutputStream(
						new File("test.txt"))));
			oos.writeObject(new Integer(1));
			oos.writeObject(ls);
			oos.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	
		ObjectInputStream ois;
		try
		{
			ois = new ObjectInputStream(
					new BufferedInputStream(
					  new FileInputStream(
						new File("test.txt"))));
			System.out.println((Integer) ois.readObject() + " " + (LinkedList<String>) ois.readObject());
			ois.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		File test = new File("test.txt");
		test.delete();
	}
}