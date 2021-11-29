/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author iscne
 */
public class Conexion {
    private static Connection cnx = null;
    //cramos la función obtener()
    public static Connection obtener() throws SQLException, ClassNotFoundException{
        if (cnx == null) {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/escolares", "root", "");
            }catch(SQLException ex){
                throw new SQLException(ex);
            }catch(ClassNotFoundException ex){
                throw new ClassCastException(ex.getMessage());
            }
        }
        return cnx;
        
    }
    //fin de la funcion obtener()
}
