package Kursiniopagrprogkodas;

import java.util.ArrayList;
import java.util.Collections;


public class Sistema {
    
    private ArrayList<Destytojas> destytojai = new ArrayList();
    private ArrayList<Grupe> grupes = new ArrayList();
    private ArrayList<Kursas> kursai = new ArrayList();
    public void pridetiDestytoja(int id, String vardas, String pavarde)
    {
            Destytojas naujas = new Destytojas(id, vardas, pavarde);
            destytojai.add(naujas);
            Collections.sort(destytojai);
            
    }

    public ArrayList<Grupe> getGrupes() {
        return grupes;
    }

 public Grupe pridetiGrupe(String Id, int years){
    
        Grupe naujas = new Grupe(Id,years);
        grupes.add(naujas);
        
       return naujas;
    }
 
   public Grupe grupesID(String poz){
        for(Grupe g:grupes){
                
            if(poz.equals(g.getKodas()))
                return g;
         
        }
        return null;
    }
    
    
public Kursas pridetiKursa( String pavadinimas)
{
    
        Kursas naujas = new Kursas(pavadinimas);
        kursai.add(naujas);
        
       return naujas;
    }

    public void setKursai(ArrayList<Kursas> kursai) {
        this.kursai = kursai;
    }

    public ArrayList<Destytojas> getDestytojai() 
    {
        return destytojai;
    }
    public Destytojas gautiDestytojaPagalId(int id)
    {
        for(Destytojas d:destytojai)
        {
            if(d.getId()==id)
            {
                return d;
                
                
            }
        }
        return null;
    }
    public void salintiDestytoja(int id)
    {
        destytojai.remove(gautiDestytojaPagalId(id));
    }

    public Grupe pridetiGrupe(int metai, String kodas)
    {
            Grupe naujas = new Grupe(kodas, metai);
          grupes.add(naujas);
                       return naujas;
                       
    }

   
 
     public Kursas KursoId(String pav){
        for(Kursas g:kursai){
                
            if(pav == g.getPavadinimas())
                return g;
         
        }
        return null;
    }
    
    public ArrayList<Kursas> getKursai() {
        return kursai;
    }

   
}
