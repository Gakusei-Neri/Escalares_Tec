/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.Alumno;

/**
 *
 * @author iscne
 */
public class controladorAlumno {
    private final String tabla = "alumno";
    
    //cramos la funcion Guardar o Insertar
    public void guardar(Connection conexion, Alumno alumno) throws SQLException{
        try{
            PreparedStatement consulta;
                if(alumno.getId_alumno()== null){
                    consulta = conexion.prepareStatement("INSERT INTO " + 
                            this.tabla + "(nombre, apellido, direccion, poblacion, "
                                    + "fecha_nac, codogopostal, telefono, user_id) "
                                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
                    consulta.setString(1, alumno.getNombnre());
                    consulta.setString(2,alumno.getApellido());
                    consulta.setString(3, alumno.getDireccion());
                    consulta.setString(4, alumno.getPoblacion());
                    consulta.setString(5,alumno.getFecha_nac());
                    consulta.setInt(6, alumno.getCodigopostal());
                    consulta.setString(7, alumno.getTelefono());
                    consulta.setInt(8, alumno.getUser_id());
                }else{
                    consulta = conexion.prepareStatement("UPDATE " + this.tabla + 
                            " SET nombre = ?, apellido = ?, "
                                    + "direccion = ? "
                                    + "poblacion = ? "
                                    + "fechanac = ? "
                                    + "codogopostal = ? "
                                    + "telefono = ? "
                                    + "user_id = ? "
                                    + "WHERE id_tarea = ?");
                    consulta.setString(1, alumno.getNombnre());
                    consulta.setString(2,alumno.getApellido());
                    consulta.setString(3, alumno.getDireccion());
                    consulta.setString(4, alumno.getPoblacion());
                    consulta.setString(5,alumno.getFecha_nac());
                    consulta.setInt(6, alumno.getCodigopostal());
                    consulta.setString(7, alumno.getTelefono());
                    consulta.setInt(8, alumno.getUser_id());
                    consulta.setInt(9,alumno.getId_alumno());
                    
                }
        }catch(SQLException ex) {
            throw new SQLException(ex);
        }
    }
    
}
