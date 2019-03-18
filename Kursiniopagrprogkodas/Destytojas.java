package Kursiniopagrprogkodas;

import java.util.ArrayList;

public class Destytojas implements Comparable<Destytojas> {
    private int id;
    private String vardas, pavarde;
    private ArrayList<Kursas> kursai = new ArrayList();
    

    public Destytojas(int id, String vardas, String pavarde) {
        this.id = id;
        this.vardas = vardas;
        this.pavarde = pavarde;
    }
 public Kursas pridetiNaujaKursa(String pavadinimas){
     
     Kursas k = new Kursas(pavadinimas, this);
     kursai.add(k);
     return k;
 }
    @Override
    public String toString() {
        return vardas+" "+pavarde+" ("+id+")";
    }

    
    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Destytojas a) {
       int rez = (vardas+" "+pavarde).compareTo(a.vardas+" "+a.pavarde);
       if (rez==0)
       {
           return Integer.compare(id, a.id);
           
       }
        return rez;
    }
    
}
