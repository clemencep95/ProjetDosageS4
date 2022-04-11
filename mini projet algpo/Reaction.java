public class Reaction extends FenetrePrincipale{
    public Solution solA;
    public Solution solB;
    public double Veq;
    public double V0;
<<<<<<< HEAD
<<<<<<< HEAD
    public Apoint [] points = new Apoint [26];
=======
    FenetrePrincipale fenetreParente;
>>>>>>> 16571ceea279ae59c92eadfd59120a92052eb1d9
=======
>>>>>>> aced66e600f4f605a243fd1c8294abd58a494c7f

    public Reaction () {
        super();
        System.out.println("R1 " + getConce1());
        solA = new Solution (soltitrante.getText(),0.15,true);
        System.out.println("R " + solA.concentration);
        solB = new Solution (soltitree.getText(),0.05,false);
        System.out.println("R " + solB.concentration);
        V0 = calculV0(solA,solB);
        Veq = volumeEquivalence(solA,solB);
        calculpH(solA, solB);
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
        if (A.titrante==true) {
            V0 = B.concentration * 0.0225 / (A.concentration);
            System.out.println(V0);
        }else{
            V0 = A.concentration * 0.0225 / (B.concentration);
            System.out.println(V0);
        }
        return (V0+Math.random()*0.002-Math.random()*0.002);
    }

    public void calculpH (Solution A, Solution B){
        double [] pH = new double [26];
        for (int i=1; i<=((int)Veq); i++){
            tab[i]= APoint(i,(-Math.log10(((A.concentration*this.V0)-(B.concentration*i))/(this.V0+i))));
        }
        for (int i=((int)Veq+1); i<26; i++){
            tab[i]= APoint(i,(-Math.log10(Math.pow(10,-14)/(B.concentration*(i-Veq)/(V0+i)))));
        }
    }
<<<<<<< HEAD
 
=======

    
>>>>>>> aced66e600f4f605a243fd1c8294abd58a494c7f


    
}
