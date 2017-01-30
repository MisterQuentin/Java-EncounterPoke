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
    JComboBox comboJeux = new JComboBox();
    JLabel jeux = new JLabel("Le jeux:");
    
    JComboBox comboZone = new JComboBox();
    JLabel zone = new JLabel("Zones:");
         
    public Windows(){
        
         
        
        setTitle("Encounter slot");//titre de la fenetre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//quand on clique sur la croix sa ferme
        
        //mise en place combobox jeux
        
            comboJeux.setPreferredSize(new Dimension(100, 20));
            comboJeux.addItem("Option 1");
            comboJeux.addItem("Option 2");
            comboJeux.addItem("Option 3");
            comboJeux.addItem("Option 4");
            
            JPanel top = new JPanel();
            top.add(jeux);
            top.add(comboJeux);
            
            top.setBounds(450,100,100,70);
            container.setLayout(null);
            container.add(top);
     
            
         
            
            
            
            
            
        // Combo zone
        
            comboZone.setPreferredSize(new Dimension(100,20));
            comboZone.addItem("zone");
            
            JPanel bot = new JPanel();
            bot.add(zone);
            bot.add(comboZone);
            
            bot.setBounds(450,200,100,70);
            container.setLayout(null);
            container.add(bot);
            
            
        this.setContentPane(container);
        
        setSize(1000, 800);//taille
        setVisible(true);//permet l'affichage
        setLocationRelativeTo(null);//centre la fenetre
    }

}
