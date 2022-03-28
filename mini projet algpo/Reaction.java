public class Reaction extends FenetrePrincipale{
    public Solution solA;
    public Solution solB;
    public double Veq;
    public double V0;

    public Reaction () {
        solA= new Solution ("Hydroxyde de sodium",conce1,true);
        solB= new Solution ("Acide Chlorhydrique",conce2,false);
        V0=calculV0(solA,solB);
        Veq=volumeEquivalence(solA,solB);
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
        }else{
            V0 = A.concentration * 0.024 / (B.concentration);
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
