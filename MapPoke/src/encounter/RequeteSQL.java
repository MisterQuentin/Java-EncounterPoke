/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encounter;

import java.sql.*;

import java.util.HashMap;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 *
 * @author Quentin
 */
public class RequeteSQL {

    private Connection connexion ;
    private HashMap<Integer,String> all = new HashMap<Integer, String>();
    String url = "jdbc:mysql://localhost:3306/encounter";
    String utilisateur = "root";
    String motDePasse = "root";
    
    public RequeteSQL() throws Exception{

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        connexion = DriverManager.getConnection( url, utilisateur, motDePasse );

    }
    Vector columnNames = new Vector();
    Vector data = new Vector();
    
    
        public void insert() throws SQLException{
            Statement statement = connexion.createStatement();
            ResultSet jeux = statement.executeQuery("SELECT nom FROM Pokemon;");
             ResultSetMetaData metaData = jeux.getMetaData();
             int columns = metaData.getColumnCount();
                for (int i = 1; i <= columns; i++) {
                    columnNames.addElement(metaData.getColumnName(i));
                }
                while (jeux.next()) {
                    Vector row = new Vector(columns);
                    for (int i = 1; i <= columns; i++) {
                        row.addElement(jeux.getObject(i));
                    }
                    data.addElement(row);

                }
                
         JTable table = new JTable(data, columnNames);
         System.out.println(table);
        }
}