import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.GradientPaint;
import java.awt.Color;

public class Animation extends JPanel
{
	private String forme = "ROND";
	private int largeur = 150;
	private int x = 0, y = 0;
	private int[] triangleX = {x+largeur/2, x, x+largeur};
	private int[] triangleY = {y, y+largeur, y+largeur};
	private int[] etoileX = {x+largeur/2, x+((int) (((double) largeur) * 0.1)), x+largeur, x, x+((int) (((double) largeur) * 0.9))};
	private int[] etoileY = {y, y+largeur, y+((int) (((double) largeur) * 0.25)), y+((int) (((double) largeur) * 0.25)), y+largeur};
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.red);
		dessiner(g);
	}
	
	public void dessiner (Graphics g)
	{
		switch (forme)
		{
			case "ROND" :
				g.fillOval(x, y, largeur, largeur);
				break;
			
			case "CARRE" :
				g.fillRectangle(x, y, largeur, largeur);
				break;
			
			case "TRIANGLE" :
				g.fillPolygon(triangleX, triangleY, 3);
				break;
			
			case "ETOILE" :
				g.fillPolygon(etoileX, etoileY, 5);
				break;
		}
	}
	
	public void setForme (String forme)
	{
		this.forme = forme;
	}
	
	public String getForme ()
	{
		return forme;
	}
	
	public void setLargeur (int largeur)
	{
		this.largeur = largeur;
	}
	
	public int getLargeur ()
	{
		return largeur;
	}
	
	public void setX (int x)
	{
		this.x = x;
	}
	
	public int getX ()
	{
		return x;
	}
	
	public void setY (int y)
	{
		this.y = y;
	}
	
	public int getY ()
	{
		return y;
	}
}