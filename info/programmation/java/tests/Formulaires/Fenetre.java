import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font; // ? inutile mais retire 4 erreurs...
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener; // ? (non utilisé)
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// bouton event et listener ?

public class Fenetre extends JFrame
{
	private JPanel conteneur = new JPanel();
	private JPanel formulaire = new JPanel(); // pas déclaré ici mais change rien apparemment
	private JPanel boutons = new JPanel(); // idem
	private Animation animation = new Animation();
	private String[] choix = {"rond", "carre", "triangle", "etoile"};
	private JComboBox<String> liste = new JComboBox<String>(choix);
	private JLabel label = new JLabel("Choisissez la forme de la figure : ");
	private Font police = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 20);
	private int x, y;
	private boolean animated = true, backX, backY;
	private Thread t;
	private JButton lancer = new JButton("lancer l'animation");
	private JButton arreter = new JButton("stopper l'animation");
	// int compteur = 0 ??? (la réutilise même pas...)
	
	public Fenetre()
	{
		this.setTitle("liste animation");
		this.setSize(1080, 720);
		this.setLocationRelativeTo(null);
		
		conteneur.setLayout(new BorderLayout());
		conteneur.setBackground(Color.white);
		conteneur.add(formulaire, BorderLayout.NORTH);
		conteneur.add(formulaire, BorderLayout.CENTER);
		conteneur.add(boutons, BorderLayout.SOUTH);
		
		formulaire.add(label);
		formulaire.add(liste);
		boutons.add(lancer);
		boutons.add(arreter);
		
		label.setFont(police);
		arreter.setEnable(false);
		lancer.addActionListener(new LancerListener());
		arreter.addActionListener(new ArreterListener());
		
		liste.setForeground(Color.red);
		liste.setBackground(Color.black);
		//liste.addItemListener(new ListeListener());
		liste.addActionListener(new FormeListener());
		
		this.setContentPane(conteneur);
		
		this.setVisible(true);
	}
	
	private void go()
	{
		x = animation.getPosX();
		y = animation.getPosY();
		
		while (animated)
		{
			if (x < 1) backX = false;
			else if (x > animation.getWidth() - 151) backX = true;
			if (y < 1) backY = false;
			else if (y > animation.getHeight() - 151) backY = true;
			if (backX) animation.setPosX(--x);
			else animation.setPosX(++x);
			if (backY) animation.setPosY(--y);
			else animation.setPosY(++y);
			animation.repaint();
			try
			{
				Thread.sleep(3);
			}
			catch (InterruptedException e)
			{
				e.prtinStackTrace();
			}
		}
	}
	
	class lancerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			animated = true;
			t = new Thread (new LancerAnimation());
			t.start();
			lancer.setEnable(false);
			arreter.setEnable(true);
		}
	}
	
	class arreterListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			animated = false;
			lancer.setEnable(true);
			arreter.setEnable(false);
		}
	}
	
	class LancerAnimation implements Runnable
	{
		public void run()
		{
			go();
		}
	}
	
	class FormeListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			animation.setForme(liste.getSelectedItem());
		}
	}
	
	/*class ListeListener extends ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			System.out.println("Evenement déclenché sur " + e.getItem());
		}
	}*/
}