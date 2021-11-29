/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author iscne
 */
public class Alumno {
    //mis variables globales
    private final Integer id_alumno;
    private String nombre;
    private String apellido;
    private String direccion;
    private String poblacion;
    private String fecha_nac;
    private Integer codigopostal;
    private String telefono;
    private Integer user_id;
    
    //contructores
    public Alumno(){
        this.id_alumno= null;
        this.nombre= null;
        this.apellido=null;
        this.direccion= null;
        this.poblacion= null;
        this.fecha_nac= null;
        this.codigopostal= null;
        this.telefono= null;
        this.user_id = null;
    }
    
    public Alumno(Integer id_alumno,String nombre,String apellido,String direccion,
            String poblacion, String fecha_nac, Integer codigopostal,String telefono,
            Integer user_id){
        this.id_alumno= id_alumno;
        this.nombre= nombre;
        this.apellido=apellido;
        this.direccion= direccion;
        this.poblacion= poblacion;
        this.fecha_nac= fecha_nac;
        this.codigopostal= codigopostal;
        this.telefono= telefono;
        this.user_id = user_id;
    
    }
    //getters
    public Integer getId_alumno(){
        return id_alumno;
    }
    public String getNombnre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public String getPoblacion(){
        return poblacion;
    }
    
    public String getFecha_nac(){
        return fecha_nac;
    }
    
    public Integer getCodigopostal(){
        return codigopostal;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public Integer getUser_id(){
        return user_id;
    }
    //setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public void setPoblacion(String poblacion){
        this.poblacion = poblacion;
    }
    public void setFecha_nac(String fecha_nac){
        this.fecha_nac = fecha_nac;
    }
    
    public void SetCodigopostal(Integer codigopostal){
        this.codigopostal = codigopostal;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setUser_id(Integer user_id){
        this.user_id = user_id;
    }
    
    
    
}
