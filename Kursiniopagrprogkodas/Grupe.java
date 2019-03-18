package Kursiniopagrprogkodas;

import java.util.ArrayList;


 public class Grupe {
    private String kodas;
    private int stojimoMetai;

    public ArrayList<Studentas> getStudentai() {
        return studentai;
    }
    private ArrayList<Studentas> studentai = new ArrayList();
    public Grupe(String kodas, int stojimoMetai) {
        this.kodas = kodas;
        this.stojimoMetai = stojimoMetai;
    }
    public void pridetiStudenta(long id, String vardas, String pavarde)
    {
        Studentas naujas = new Studentas(id, vardas, pavarde);
        studentai.add(naujas);
    }

    @Override
    public String toString() {
        return kodas;
    }
    

    public String getKodas() {
        return kodas;
    }

    public void setKodas(String kodas) {
        this.kodas = kodas;
    }
    

    public int getStojimoMetai() {
        return stojimoMetai;
    }

    public void setStojimoMetai(int stojimoMetai) {
        this.stojimoMetai = stojimoMetai;
    }

    
}
