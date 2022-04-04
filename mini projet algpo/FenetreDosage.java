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
	
	public JFrame FenetrePrincipale1;
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

		Conteneur = new JPanel();

		ImageIcon skinTitrage = new ImageIcon("equation_reaction.jpg");
		titrage = new JLabel(skinTitrage);
		titrage.setBounds(100,100,skinTitrage.getIconWidth(),skinTitrage.getIconHeight());
		this.add(titrage);

		Toolkit T=Toolkit.getDefaultToolkit();
		reaction = T.getImage("lion_final.png"); // 


		JLabel E = new JLabel(new ImageIcon("images/equation_reaction.jpg"));
		E.setBounds(250,690,200,200);
		Conteneur.add(E);



        this.setVisible(true);
		
	}

	public void paint (Graphics g){

		BufferedImage imagePreparation = new BufferedImage(600,500,BufferedImage.TYPE_INT_RGB);

		Graphics imagePreparationGraphics = imagePreparation.getGraphics();

		imagePreparationGraphics.drawImage(reaction, 0, 0, this);

		g.drawImage(imagePreparation,0,0,this);

	}
}
