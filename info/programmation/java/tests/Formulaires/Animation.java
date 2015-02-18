import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
// 2D et font ?

public class Animation extends JPanel
{
	private String forme = "ROND";
	private int posX = 0; // -50 ?
	private int posY = 0;
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(red);
		
		dessiner(g);
	}
	
	private void dessiner(Graphics g)
	{
		switch (forme)
		{
			case "ROND" :
				g.fillOval(posX, posY, 150, 150);
				break;
				
			case "CARRE" :
				g.fillRect(posX, posY, 150, 150);
				break;
				
			case "TRIANGLE" :
				int[] X = {posX + 75, posX, posX + 150};
				int[] Y = {posY, posY + 150, posY + 150};
				g.fillPolygon(X, Y, 3);
				break;
				
			case "ETOILE" :
				int[] X = {posX + 75, posX + 25, posX + 150, posX, posX + 125};
				int[] Y = {posY, posY + 150, posY + 50, posY + 50, posY + 150};
				g.fillPolygon(X, Y, 5);
				break;
				
			default :
				System.out.println("forme inconnue");
		}
	}
	
	public void setForme (String forme)
	{
		this.forme = forme;
	}
	
	public int getPosX ()
	{
		return posX;
	}
	
	public void setPosX (int posX)
	{
		this.posX = posX;
	}
	
	public int getPosY ()
	{
		return posY;
	}
	
	public void setPosY (int posY)
	{
		this.posY = posY;
	}
}