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


public class FenetreDosage extends JFrame {
	
	public JFrame FenetrePrincipale1;
	public JPanel Conteneur;
	public JLabel conc2;
	public JLabel conc1;
	public JLabel VolIns;

	public JLabel titrage;
	
	public FenetreDosage(){
		
		this.setTitle("Dosage");
		this.setLayout(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);

		ImageIcon skinTitrage = new ImageIcon("equation_reaction.jpg");
		titrage = new JLabel(skinTitrage);
		titrage.setBounds(100,100,skinTitrage.getIconWidth(),skinTitrage.getIconHeight());
		this.add(titrage);


        this.setVisible(true);

        
        
		
		

	}
}
