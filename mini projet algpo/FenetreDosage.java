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
import java.awt.*;


public class FenetreDosage extends JFrame {
	
	public JPanel Conteneur;
	public JLabel conc2;
	public JLabel conc1;
	public JLabel VolIns;

	public JLabel titrage;

	public Image reaction;
	FenetrePrincipale fenetreParente;
	
	public FenetreDosage(FenetrePrincipale laFenetreParente){
		
		fenetreParente = laFenetreParente;

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
	}

		public void paint (Graphics g){

			Graphics2D g2 = (Graphics2D) g;

			int nombreDePoints = 25;
			for (int i = 0; i <= nombreDePoints-2; i++) {
				double x1 = fenetreParente.R1.points[i].x;
				double y1 = fenetreParente.R1.points[i+1].y;
				double x2 = fenetreParente.R1.points[i+1].x;
				double y2 = fenetreParente.R1.points[i+1].y;
				
				g2.draw(new Line2D.Double(x1, y1, x2, y2));
			}
		}
}
