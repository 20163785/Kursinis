package Kursiniopagrprogkodas;

import java.io.PrintWriter;
import java.util.Scanner;


public class Laboratorinis2 {

    public static void main(String[] args) {
      
    Sistema sist = new Sistema();
 
    Scanner klav = new Scanner(System.in);
        while(true){
            System.out.println("Pasirinkite funkcija:\n"
                        + "d - darbas su destytojais\n"
                        + "g - darbas su grupemis\n"
                        + "k - darbas su kursais\n"
                        + "q - baigti darba");
            String k = klav.nextLine();
            switch(k){
                case "d":
                    while(!k.equals("qd")){
                        try{
                        System.out.println("\nPasirinkite ka norite atlikti:\n"
                        + "add  {id} [vardas] [pavarde]\n"
                        + "print - Isvesti sarasa i ekrana\n"
                        + "delete {id} - istrinti destytoja\n"
                        + "printF - Isvesti destytojus i ekrana \n"
                        + "qd - baigti darba su destytojais\n");
                       k = klav.nextLine();
                       String[] dalys = k.split(" ");
                       k = dalys[0];
                       switch(k){
                           case "add":
                               sist.pridetiDestytoja(Integer.parseInt(dalys[1]), dalys[2],dalys[3]);
                               break;
                               
                           case "print":
                               for(Object o : sist.getDestytojai()){
                                   System.out.println(o);
                               }
                               break;
                               
                           case "delete":
                               sist.salintiDestytoja(Integer.parseInt(dalys[1]));
                                break;
                                
                           case "printF":
                               PrintWriter writer = new PrintWriter("DestytojuSarasas.txt", "UTF-8");
                                for(Object o : sist.getDestytojai()){
                                   writer.println(o);
                               }
                                writer.close();
                               break;
                              
                           case "qd":
                               System.out.println("Pabaiga");
                          
                       }
                        }
                       catch(Exception e){
                               System.out.println("Ivyko klaida");
                               }
                        }
                        
                        
                    
                    break;
                 case "g":
                    while(!k.equals("qd")){
                  try{
                        System.out.println("\nPasirinkite ka norite atlikti:\n"
                        + "spausdinti - Isvesti grupiu sarasa i ekrana\n"
                        + "printS {grupes id} - Isvesti pasirinktos grupes informacija\n"
                        + "prideti - nauja grupe {grupes kodas} {grupes stojimo metai}\n"
                        + "addG - Prideti studenta i grupe {grupes id} {studento id} {studento vardas} {studento pavarde} \n"
                        + "qd - baigti darba su destytojais\n");
                         k = klav.nextLine();
                         String[] dalys = k.split(" ");
                         k = dalys[0];

                       
                           
                         switch(k){
                        
                         case "spausdinti":
                         for(Object o : sist.getGrupes()){
                                   System.out.println(o);
                               }
                          break;
                          
                          case "prideti":
                           
                            sist.pridetiGrupe(dalys[1], Integer.parseInt(dalys[2]));
                                
                          break;
                          
                          case "qd":
                              System.out.println("Pabaiga");
                             break;
                             
                          case "addG":
                              sist.grupesID(dalys[1]).pridetiStudenta(Integer.parseInt(dalys[2]), dalys[3], dalys[4]);
                             
                            
                             
                              break;
                              
                          case "printS":
                                  
                                 System.out.println(sist.grupesID(dalys[1]).getStudentai());
                                          
                                  break;
                                  
                                     }
      
                                }
                        
                        catch(Exception e){
                        System.out.println("Ivyko klaida");
                                  }
                    }
                    break;
                    ///////////
                    
                    case "k":
                    while(!k.equals("qd")){
                  try{
                        System.out.println("\nPasirinkite ka norite atlikti\n"
                        + "isvesti - Isvesti visus kursus i ekrana\n"
                        + "printK {kurso pavadinimas} isvesti i ekrana pasirinkta kursa\n"
                        + "prideti  - {kurso pavadinimas, vienu zodziu} \n"
                        + "uzbaigti - baigti darba su kursais\n");
                         k = klav.nextLine();
                         String[] dalys = k.split(" ");
                         k = dalys[0];

                       
                           
                         switch(k){
                        
                         case "isvesti":
                         for(Object o : sist.getKursai()){
                                   System.out.println(o);
                               }
                          break;
                          
                          case "prideti":
                           
                            sist.pridetiKursa(dalys[1] );
                                
                          break;
                          
                          case "uzbaigti":
                              System.out.println("Pabaiga");
                             break;
                             
                       
                              
                          case "printK":
                                  
                                 System.out.println(sist.KursoId(dalys[1]));
                                          
                                  break;
                                  
                                     }
      
                                }
                        
                        catch(Exception e){
                        System.out.println("Klaida");
                                  }
                    }
                    break;
                    
                    
                    
                    
                    
                   ////////////// 
                case "q":
                    System.exit(0);
                    break;
                    
                default:
                  System.out.println("Ivyko klaida");
            }
        }
   
   
   
   
   
   
   
   
   
   
   
    }
}