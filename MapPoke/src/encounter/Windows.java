/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encounter;


import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 *
 * @author Quentin
 */
public class Windows extends JFrame {
    
    JPanel container = new JPanel();
    JComboBox combo = new JComboBox();
    JLabel label = new JLabel("Le jeux:");
         
    public Windows(){
        
         
        
        setTitle("Encounter slot");//titre de la fenetre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//quand on clique sur la croix sa ferme
        
        //mise en place combobox
        
            combo.setPreferredSize(new Dimension(100, 20));
            combo.addItem("Option 1");
            combo.addItem("Option 2");
            combo.addItem("Option 3");
            combo.addItem("Option 4");
            
            JPanel top = new JPanel();
            top.add(label);
            top.add(combo);
            
            container.add(top, BorderLayout.NORTH);
            this.setContentPane(container);
        
        setSize(1000, 800);//taille
        setVisible(true);//permet l'affichage
        setLocationRelativeTo(null);//centre la fenetre
    }

}
