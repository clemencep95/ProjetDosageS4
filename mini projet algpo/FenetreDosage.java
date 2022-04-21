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
	public JLabel titreGraph;
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

		titreGraph = new JLabel ("Graphique representant l'evolution du pH de la solution en fonction du volume de la solution insere");
        titreGraph.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
        titreGraph.setBounds(100,500,1000,300);
        titreGraph.setForeground(Color.white);
        Conteneur.add(titreGraph);
		
		repaint();
		this.add(Conteneur);
		repaint();
	}

	public void paint (Graphics g){
 
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(Color.white);
	   

		int nombreDePoints = 25;
		for (int i = 1; i <= nombreDePoints-2; i++) {
			int x1 = (int)(i*(FenetrePrincipale.l)/26);
			int y1 = (int)((Reaction.points[i].y)*((FenetrePrincipale.h)*590/1550)/((Reaction.points[25].y))+((FenetrePrincipale.h)*150/1550));
			int x2 = (int)((i+1)*(FenetrePrincipale.l)/26);
			int y2 = (int)((Reaction.points[i+1].y)*((FenetrePrincipale.h)*590/1550)/((Reaction.points[25].y))+((FenetrePrincipale.h)*150/1550));
			g2.fillOval(x1, y1, 10, 10);
			g2.fillOval(x2, y2, 10, 10);
			g2.draw(new Line2D.Double(x1, y1, x2, y2));
		}
	}
}
