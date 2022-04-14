public class Reaction {
    public Solution solA;
    public Solution solB;
    public double Veq;
    public double V0;
    public APoint [] points = new APoint [26];
    FenetrePrincipale fenetreParente;

    public Reaction (FenetrePrincipale laFenetreParente){
        super();
        fenetreParente = laFenetreParente;
        solA = new Solution (fenetreParente.soltitrante.getText(),fenetreParente.conce1,true);
        solB = new Solution (fenetreParente.soltitree.getText(),fenetreParente.conce2,false);
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
            points[i]= new APoint(i,(-Math.log10(((A.concentration*this.V0)-(B.concentration*i))/(this.V0+i))));
        }
        for (int i=((int)Veq+1); i<26; i++){
            points[i]=new APoint(i,(-Math.log10(Math.pow(10,-14)/(B.concentration*(i-Veq)/(V0+i)))));
        }
    }   
}
