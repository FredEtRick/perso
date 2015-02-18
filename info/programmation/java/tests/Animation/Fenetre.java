import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame
{
	private JPanel conteneur = new JPanel();
	private JPanel formulaire = new JPanel();
	private Animation figures = new Animation();
	private JPanel boutons = new JPanel();
	private JButton marche = new JButton("marche");
	private JButton arret = new JButton("arret");
	private JLabel labelForme = new JLabel("choisissez la forme de la figure : ");
	private String[] choixForme = {"ROND", "CARRE", "TRIANGLE", "ETOILE"};
	private JComboBox liste = new JComboBox(choixForme);
	private JCheckBox variable = new JCheckBox("dimensions variables");
	private Thread t;
	private int x, y, largeurFig, largeurPan = figures.getWidth(), hauteurPan = figures.getHeight(), temps = 0;
	private boolean anime = false, changeant = false, backX = false, backY = false, croissant = false;
	
	public Fenetre()
	{
		this.setTitle("Cases à cocher");
		this.setSize(1080, 720);
		this.setLocationRelativeTo(null);
		
		this.setContentPane(conteneur);
		conteneur.setLayout(new BorderLayout());
		conteneur.add(formulaire, BorderLayout.NORTH);
		conteneur.add(figures, BorderLayout.CENTER);
		conteneur.add(boutons, BorderLayout.SOUTH);
		conteneur.setBackground(Color.white);
		
		formulaire.setPreferredSize(new Dimension(this.getWidth(), 40));
		formulaire.add(labelForme);
		formulaire.add(liste);
		formulaire.add(variable);
		
		boutons.add(marche);
		boutons.add(arret);
		
		marche.addActionListener(new MarcheListener());
		arret.addActionListener(new ArretListener());
		liste.addActionListener(new ListeListener());
		variable.addActionListener(new VariableListener());
		
		this.setVisible(true);
	}
	
	public void go() // peut renommer go ?
	{
		while (anime)
		{
			x = figures.getX();
			y = figures.getY();
			largeurFig = figures.getLargeur();
			if (x < 1)
				backX = false;
			else if (x > (largeurPan - largeurFig))
				backX = true;
			if (y < 1)
				backY = false;
			else if (y > (hauteurPan - largeurFig))
				backY = true;
			if (backX)
				figures.setX(--x);
			else
				figures.setX(++x);
			if (backY)
				figures.setY(--y);
			else
				figures.setY(++y);
			if (changeant && (temps%10 == 0))
			{
				if (largeurFig < 2)
					croissant = true;
				else if (largeurFig > 149)
					croissant = false;
				if (croissant)
					figures.setLargeur(++largeurFig);
				else
					figures.setLargeur(--largeurFig);
			}
			temps++;
			figures.repaint();
			try
			{
				Thread.sleep(3);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	class Animer implements Runnable
	{
		public void run ()
		{
			go();
		}
	}
	
	class MarcheListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			marche.setEnabled(false);
			arret.setEnabled(true);
			anime = true;
			t = new Thread(new Animer());
			t.start();
		}
	}
	
	class ArretListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			marche.setEnabled(true);
			arret.setEnabled(false);
			anime = false;
		}
	}
	
	class ListeListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			figures.setForme(liste.getSelectedItem().toString());
		}
	}
	
	class VariableListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			if (variable.isSelected())
				changeant = true;
			else
				changeant = false;
		}
	}
}