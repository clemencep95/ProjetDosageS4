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
	
	public FenetreDosage(){
		
		FenetrePrincipale1 = new JFrame () ;
		FenetrePrincipale1.setTitle("Dosage");
		FenetrePrincipale1.setLayout(null);
		FenetrePrincipale1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        FenetrePrincipale1.setVisible(true);
        
        FenetrePrincipale1.repaint();
        
        
		
		

	}
}
