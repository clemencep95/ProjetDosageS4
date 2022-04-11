import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.io.*;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.FlowLayout; 
import javax.swing.JLabel; 
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.image.*;
import java.awt.geom.*;

import java.awt.Color; 
import java.awt.BasicStroke; 
import java.awt.geom;


public class FenetreDosage extends JFrame {
	
	public JPanel Conteneur;
	public JLabel conc2;
	public JLabel conc1;
	public JLabel VolIns;

	public JLabel titrage;

	public Image reaction;
	
	public FenetreDosage(){
		
		this.setTitle("Dosage");
		this.setLayout(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        
        Conteneur = new JPanel();
		Conteneur.setLayout(null);
		Conteneur.setBounds(0,0,this.getWidth(),this.getHeight());
       	Conteneur.setBackground(Color.WHITE);
		

		JLabel E = new JLabel(new ImageIcon("images/equation_reaction.jpg"));
		E.setBounds(10,30,1500,100);
		Conteneur.add(E);

		this.add(Conteneur);

		public void paint (Graphics g){

			Graphics2D g2 = (Graphics2D) g;

			g2.setColor(Color.pink);
        	g2.fillRect(0, 0, 1000, 1000);

			Point2D.Double [] t = new Point2D.Double [25];
			for (int i = 0 ; i<= 25 ; i++){
				t[i]= new Point2D.Double(i,i);
			}
			for (int i = 0; i <= 24; i++) {
				
				g2.draw(new Line2D.Double(t[i],t[i+1]));
			}
				
	 
			int nombreDePoints = 25;
			for (int i = 0; i <= nombreDePoints-1; i++) {
				/*double x1 = Reaction.tab[i].get(x);
				double y1 = Reaction.tab[i+1].get(y);
				double x2 = Reaction.tab[i+1].get(x);
				double y2 = Reaction.tab[i+1].get(y);
				
				g2.draw(new Line2D.Double(x1, y1, x2, y2));*/
			}
		}
	


	}

}
