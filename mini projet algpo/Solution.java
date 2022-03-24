//import java.util.ArrayList;
public class Solution {

    public boolean type;
    public double concentration;
    public String nom;
    public double volume;
    public boolean titrante;
    

    public Solution (boolean t, String n, double c, boolean titre, double v) {
        this.type = t;
        this.nom=n;
        this.concentration = c;
        this.volume = v;
        this.titrante=titre;
    }
    public Solution (boolean t, String n, double c, boolean titre){
        this.type = t;
        this.nom=n;
        this.concentration = c;
        this.volume=-1.0;
        this.titrante=titre;
    }

   // ArrayList <Solution> Acide = new ArrayList <Solution>();
    //ArrayList <Solution> Base = new ArrayList <Solution>();

    public String toString(){
        if (concentration==-1.0){
            return "solution "+nom+" de concentration inconnue";
        }else {
            return "solution" + nom + "de concentration" + concentration;
        }
    }
}
