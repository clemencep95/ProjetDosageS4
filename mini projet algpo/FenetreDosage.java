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
       	Conteneur.setBackground(new Color(51,153,255));
		

		JLabel E = new JLabel(new ImageIcon("images/equation_reaction.jpg"));
		E.setBounds(50,50,1500,100);
		Conteneur.add(E);

		this.add(Conteneur);


		
	}

}
