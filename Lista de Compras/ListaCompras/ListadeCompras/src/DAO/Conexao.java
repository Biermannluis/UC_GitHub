/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author 180000B1Z
 */
public class Conexao {
    private static final String url="jdbc:mysql://localhost:3306/projeto_integrador";
    private static final String user="root";
    
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String senha="";
    
    public static void executar(String query) {
        try {
            Class.forName(driver);
            Connection conn= DriverManager.getConnection(url,user,senha);
            Statement st=conn.createStatement();
            st.execute(query);
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }
    public static ResultSet consultar(String query) {
        try {
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(url,user,senha);
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(query);
            return rs;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
        
    }
    
}
