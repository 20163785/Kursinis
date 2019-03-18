package Kursiniopagrprogkodas;
import java.util.ArrayList;

 public class Kursas {
    
    private String pavadinimas;
    private ArrayList<Grupe> grupes = new ArrayList();
    private ArrayList<Destytojas> destytojai = new ArrayList();

    public Kursas(String pavadinimas, Destytojas d) {
        this.pavadinimas = pavadinimas;
        destytojai.add(d);
        
    }

    @Override
    public String toString() {
        return pavadinimas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    Kursas(String pavadinimas) {
         this.pavadinimas = pavadinimas;
         
    }
public void pridetiGrupe(Grupe g){
    grupes.add(g);
}

}
