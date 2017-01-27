/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encounter;


import javax.swing.JFrame;



/**
 *
 * @author Quentin
 */
public class Windows extends JFrame {
    
    public Windows(){
        setTitle("Encounter slot");//titre de la fenetre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//quand on clique sur la croix sa ferme
        setSize(1000, 800);//taille
        setVisible(true);//permet l'affichage
        setLocationRelativeTo(null);//centre la fenetre
    }

}
