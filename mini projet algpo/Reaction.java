public class Reaction extends FenetrePrincipale{
    public Solution solA;
    public Solution solB;
    public double Veq;
    public double V0;

    public Reaction () {
        solA= new Solution ("Permanganate de Potassium",Double.parseDouble(text1.getText()),true);
        solB= new Solution ("Sel de MOhr", Double.parseDouble(text2.getText()),false);
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
