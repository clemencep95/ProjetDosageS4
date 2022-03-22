import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.io.*;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.awt.FlowLayout; 
import javax.swing.JLabel; 
import javax.swing.SwingConstants;
import java.awt.Font;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;

import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;


public class FenetrePrincipale extends JFrame implements ActionListener {
	
	public JFrame FenetrePrincipale1;
	public JPanel Conteneur;
	public JTextArea textArea;
	public JButton sol1;
	public JButton sol2;
	public JTextField text2;
	public JTextField text1;
	public JLabel conc2;
	public JLabel conc1;
	public JButton demarrer;
	int type1 = 0 ;
	int type2 = 0;
	double conce1 = 0;
	double conce2 = 0;
	public JLabel scientifique;
	public JPanel contentPane;
    public JLabel imageLabel = new JLabel();
    public JLabel headerLabel = new JLabel();
    
	public FenetrePrincipale(){
		
		FenetrePrincipale1 = new JFrame();
		FenetrePrincipale1.setTitle("Dosage");
		FenetrePrincipale1.setLayout(null);
		FenetrePrincipale1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        FenetrePrincipale1.setVisible(true);
        
        Conteneur = new JPanel();
		Conteneur.setLayout(null);
		Conteneur.setBounds(0,0,1600,1500);
        Conteneur.setBackground(new Color(51,153,255));
        Conteneur.setVisible(true);
		FenetrePrincipale1.add(Conteneur);
		
		textArea = new JTextArea(" Bonjour ! Bienvenue dans le logiciel de modelisation de dosage chimique ! Tu peux des a present choisir quel dosage tu veux modeliser en choisissant les solutions et les concentrations ! On 	   	             s'occupe du reste !");
		textArea.setBackground(new Color(51,153,255));
		textArea.setForeground(Color.white);
		textArea.setBounds(500,100,600,100);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setVisible(true);
		Conteneur.add(textArea);
		textArea.setFont(new java.awt.Font("Liberation Serif", Font.BOLD, 20));
		
			
		sol1 = new JButton("Acide");
		sol1.setBounds(200,400,150,40);
		sol1.addActionListener(this);
		Conteneur.add(sol1);
		
		text1 = new JTextField();
		text1.setBounds(500,400,150,40);
		text1.setBackground(Color.white);
		text1.addActionListener(this);
		Conteneur.add(text1);
		
		conc1 = new JLabel("Concentration de la solution titrante :");
		conc1.setBounds(500,340,940,40);
		conc1.setForeground(Color.blue);
		Conteneur.add(conc1);
		
	
		sol2 = new JButton("Base");
		sol2 .setBounds(200,600,150,40);
		sol2.addActionListener(this);
		Conteneur.add(sol2);
		
		text2 = new JTextField();
		text2.setBounds(500,600,150,40);
		text2.setBackground(Color.white);
		text2.addActionListener(this);
		Conteneur.add(text2);
		
		conc2 = new JLabel("Concentration de la solution titree :");
		conc2.setBounds(500,540,940,40);
		conc2.setForeground(Color.blue);
		Conteneur.add(conc2);
		
		demarrer = new JButton("Doser !");
		demarrer.setBounds(1200,500,150,40);
		demarrer.addActionListener(this);
		Conteneur.add(demarrer);
		
		ImageIcon skinScientifique = new ImageIcon("scientifique.gif.gif");
		scientifique = new JLabel(skinScientifique);
		scientifique.setBounds(0,0,skinScientifique.getIconWidth(),skinScientifique.getIconHeight());
		scientifique.setVisible(true);
		this.add(scientifique);
		
		
		FenetrePrincipale1.add(Conteneur);
		Conteneur.repaint();

	}

	public void actionPerformed(ActionEvent e){
		
		
		if (e.getSource()==sol1){
			type1=1;
		}else if (e.getSource()==sol2){
			type2=2;
		} else if (e.getSource()==text1){
			conce1 = Double.parseDouble(text1.getText());
		} else if (e.getSource()==text2){
			conce2 = Double.parseDouble(text2.getText());
		} else if (e.getSource()==demarrer){
			if ((type1 != 0) && (type2 != 0) && (conce1 != 0) && (conce2 != 0)){
				/*Reaction r = new Reaction (type1,type2,conc1,conc2);*/
				FenetreDosage f = new FenetreDosage();
			} else {
				JLabel erreur = new JLabel("erreur");
				erreur.setBounds(500,500,1000,100);
				erreur.setBackground(Color.red);
				Conteneur.add(erreur);
				erreur.setVisible(true);
				
			} 
			 Conteneur.repaint();
		}
		

	}
	

}
	


