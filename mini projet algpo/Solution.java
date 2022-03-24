//import java.util.ArrayList;
public class Solution {

    public double concentration;
    public String nom;
    public double volume;
    public boolean titrante;
    

    public Solution (String n, double c, boolean titre, double v) {
        this.nom=n;
        this.concentration = c;
        this.volume = v;
        this.titrante=titre;
    }
    public Solution (String n, double c, boolean titre){
        this.nom=n;
        this.concentration = c;
        this.volume=-1.0;
        this.titrante=titre;
    }

   // ArrayList <Solution> Acide = new ArrayList <Solution>();
    //ArrayList <Solution> Base = new ArrayList <Solution>();

    public String toString(){
        return "solution" + nom + "de concentration" + concentration;
    }
}
