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

	public JPanel Conteneur;
	public JTextArea textArea;
	public JButton sol1;
	public JButton sol2;
	public JTextField text2;
	public JTextField text1;
	public JLabel conc2;
	public JLabel conc1;
	public JButton demarrer;
	public int type1 = 0 ;
	public int type2 = 0 ;
	public double conce1 ;
	public double conce2 ;
	public JLabel scientifique;
	public JPanel contentPane;
    public JLabel imageLabel = new JLabel();
    public JLabel headerLabel = new JLabel();
	public JLabel soltitrante;
	public JLabel soltitree;
	public Reaction R1;
    
	public FenetrePrincipale() {
		
		this.setTitle("Dosage");
		this.setLayout(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        
        Conteneur = new JPanel();
		Conteneur.setLayout(null);
		Conteneur.setBounds(0,0,this.getWidth(),this.getHeight());
       	Conteneur.setBackground(new Color(51,153,255));
		
		textArea = new JTextArea("Bonjour ! Bienvenue dans le logiciel de modelisation de dosage chimique ! Tu peux des a present choisir quel dosage tu veux modeliser en choisissant les solutions et les concentrations ! On s'occupe du reste !");
		textArea.setBackground(new Color(51,153,255));
		textArea.setForeground(Color.white);
		textArea.setBounds(500,100,900,200);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setVisible(true);
		Conteneur.add(textArea);
		textArea.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		textArea.setAlignmentX(JTextArea.CENTER_ALIGNMENT);

		soltitrante = new JLabel("Choix de la solution titrante");
		soltitrante.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
		soltitrante.setBounds(20,400,940,40);
		soltitrante.setForeground(Color.white);
		Conteneur.add(soltitrante);
			
		sol1 = new JButton("Hydroxyde de sodium");
		sol1.setBounds(300,400,250,40);
		sol1.addActionListener(this);
		Conteneur.add(sol1);
		
		text1 = new JTextField();
		text1.setBounds(600,400,150,40);
		text1.setBackground(Color.white);
		text1.addActionListener(this);
		Conteneur.add(text1);

		soltitree = new JLabel("Choix de la solution titree");
		soltitree.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
		soltitree.setBounds(20,600,940,40);
		soltitree.setForeground(Color.white);
		Conteneur.add(soltitree);
		
		conc1 = new JLabel("Concentration de la solution titrante");
		conc1.setBounds(600,340,940,40);
		conc1.setForeground(Color.blue);
		Conteneur.add(conc1);
		
	
		sol2 = new JButton("Acide Chlorhydrique");
		sol2 .setBounds(350,600,150,40);
		sol2.addActionListener(this);
		Conteneur.add(sol2);
		
		text2 = new JTextField();
		text2.setBounds(600,600,150,40);
		text2.setBackground(Color.white);
		text2.addActionListener(this);
		Conteneur.add(text2);
		
		conc2 = new JLabel("Concentration de la solution titree :");
		conc2.setBounds(600,540,940,40);
		conc2.setForeground(Color.blue);
		Conteneur.add(conc2);
		
		demarrer = new JButton("Doser !");
		demarrer.setBounds(1200,500,150,40);
		demarrer.addActionListener(this);
		Conteneur.add(demarrer);


		JLabel M = new JLabel(new ImageIcon("images/potion1.gif"));
		M.setBounds(1000,200,800,500);
		Conteneur.add(M);

		JLabel N = new JLabel(new ImageIcon("images/labo11.png"));
		N.setBounds(0,320,800,700);
		Conteneur.add(N);

		JLabel L = new JLabel(new ImageIcon("images/laboratoire.JPEG"));
		L.setBounds(1000,400,800,696);
		Conteneur.add(L);

		this.add(Conteneur);
		Conteneur.repaint();
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource()==sol1){
			type1=1;
			System.out.println(type1);
		}else if (e.getSource()==sol2){
			type2=2;
			System.out.println(type2);
		} else if (e.getSource()==text1){
			conce1 = Double.parseDouble(text1.getText());
			System.out.println(conce1);
		} else if (e.getSource()==text2){
			conce2 = Double.parseDouble(text2.getText());
			System.out.println(conce2);
		} else if (e.getSource()==demarrer){
			if ((type1 != 0) && (type2 != 0) && (conce1 != 0) && (conce2 != 0)){
				R1 = new Reaction();
				System.out.println("V0 = "+ R1.V0);
				System.out.println("Veq = "+ R1.Veq);
				FenetreDosage f = new FenetreDosage();
				test(R1.calculpH(R1.solA, R1.solB));
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
	


