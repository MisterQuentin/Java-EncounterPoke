/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappoke;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Quentin
 */
public class Windows extends JFrame {
    //ajout de l'image
        
        JPanel jPanel1 = new JPanel();
        ImageIcon icone;
        JLabel map = new JLabel(icone);
    public Windows(){
        this.setTitle("Map poke");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        icone = new ImageIcon("../img/Carte_Sinnoh.png");
        map.setSize(jPanel1.getWidth(),jPanel1.getHeight());
        jPanel1.add(map);
        jPanel1.repaint();
        add(jPanel1);
        pack();
       
        
        this.setSize(1000, 800);
        this.setVisible(true);
    }
}
