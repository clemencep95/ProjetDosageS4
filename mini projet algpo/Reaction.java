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

public class Reaction extends FenetrePrincipale{
    public Solution solA;
    public Solution solB;
    public double Veq;
    public double V0;
    

    public Reaction () {
        super();
        System.out.println(conce2);
        solA = new Solution (soltitrante.getText(),conce1,true);
        System.out.println(solA.concentration);
        solB = new Solution (soltitree.getText(),conce2,false);
        System.out.println(solB.concentration);
        V0 = calculV0(solA,solB);
        Veq = volumeEquivalence(solA,solB);
    }

    public double volumeEquivalence (Solution A, Solution B){
        double Veq = 0.0;
        if (A.titrante==true){
            Veq = A.concentration*V0/B.concentration;
        } else {
            Veq = B.concentration*V0/A.concentration;
        }
        return (Veq+Math.random()*0.002-Math.random()*0.002);
    }

    public double calculV0 ( Solution A, Solution B){
        double V0 = 0.0; 
        if (A.titrante==true) {
            V0 = B.concentration * 0.024 / (A.concentration);
            System.out.println(V0);
        }else{
            V0 = A.concentration * 0.024 / (B.concentration);
            System.out.println(V0);
        }
        return (V0+Math.random()*0.002-Math.random()*0.002);
    }

}
