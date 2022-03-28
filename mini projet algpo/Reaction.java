public class Reaction extends FenetrePrincipale{
    public Solution solA;
    public Solution solB;
    public double Veq;
    public double V0;

    public Reaction () {
<<<<<<< HEAD
        super();
        System.out.println(conce2);
        solA = new Solution (soltitrante.getText(),conce1,true);
        System.out.println(solA.concentration);
        solB = new Solution (soltitree.getText(),conce2,false);
        System.out.println(solB.concentration);
        V0 = calculV0(solA,solB);
        Veq = volumeEquivalence(solA,solB);
=======
        solA= new Solution ("Hydroxyde de sodium",conce1,true);
        solB= new Solution ("Acide Chlorhydrique",conce2,false);
        V0=calculV0(solA,solB);
        Veq=volumeEquivalence(solA,solB);
>>>>>>> 874f95bc7506772790e705bc878bb44ccd45d289
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
            V0 = B.concentration * 0.024 / (A.concentration);
            System.out.println(V0);
        }else{
            V0 = A.concentration * 0.024 / (B.concentration);
            System.out.println(V0);
        }
        return (V0+Math.random()*0.002-Math.random()*0.002);
    }
    public double [] calculpH (Solution A, Solution B){
        double [] pH = new double [] {25};
        for (int i=0; i<26; i++){
                pH[i]= -Math.log10((A.concentration*this.V0)-(B.concentration*i)*(this.V0*i));
        }
        return pH;
    }

    
}
