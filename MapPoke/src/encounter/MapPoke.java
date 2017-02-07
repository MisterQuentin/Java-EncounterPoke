/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encounter;

import java.util.Scanner;

/**
 *
 * @author Quentin
 */
public class MapPoke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
       // new Windows();
       int NumJeux;
       int NumZone;
        RequeteSQL affichage = new RequeteSQL();
        
        
        
        do{
            affichage.jeux();
            System.out.println("Selectionner votre jeux");
            System.out.println(affichage);
            NumJeux = new Scanner(System.in).nextInt();
             
             switch(NumJeux){
                 case 1:
                     affichage.zone(NumJeux);
                     System.out.println("Selectionner votre zone");
                     System.out.println(affichage);
                     NumZone = new Scanner(System.in).nextInt();
                     
                     switch(NumZone){
                         case 1:
                               affichage.pokemon(NumZone);
                               System.out.println("Les Pokemon présent dans la zone");
                               System.out.println(affichage);
                               break;
                         case 2 :
                             affichage.pokemon(NumZone);
                               System.out.println("Les Pokemon présent dans la zone");
                               System.out.println(affichage);
                               break;
                             
                     }
                     break;
                
                     
             } 
        }while(NumJeux != 0);
        affichage.fermerConnexion();
    }
}
