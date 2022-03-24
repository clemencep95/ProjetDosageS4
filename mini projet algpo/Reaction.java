public class Reaction extends FenetrePrincipale{
    public Solution solA;
    public Solution solB;
    public double Veq;
    public double V0;

    public Reaction {
        solA= new Solution (1,"Permanganate de Potassium",text1.getText(),1);
        solB= new Solution (1,"Sel de MOhr", text2.getText(),0);
        V0=calculV0(solA,solB);
        Veq=volumeEquivalence(solA,solB);
    }

    public double volumeEquivalence (Solution A, Solution B){
        double Veq = 0.0;
        if (A.titrante==true){
            Veq = 2*A.concentration*V0/B.concentration;
        } else {
            Veq = 2*B.concentration*V0/A.concentration;
        }
        return (Veq+Math.random()*0.002-Math.random()*0.002);
    }

    public double calculV0 ( Solution A, Solution B){
        if (A.titrante==true) {
            V0 = B.concentration * 0.024 / (2 * A.concentration);
        }else{
            V0 = A.concentration * 0.024 / (2 * B.concentration);
        }
        return (V0+Math.random()*0.002-Math.random()*0.002);
    }

}
