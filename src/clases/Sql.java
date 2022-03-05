/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.PreparedStatement;


/**
 *
 * @author USUARIO
 */
public class Sql {
 
    public int id_incrementable(){
    int id = 1;
      
        Conexion con = new Conexion();
        try{
        con.ConexionPostgres();
        String query = "select max(id_venta) from venta";
        java.sql.ResultSet rs =con.consultar(query);
        while (rs.next()){
            id = rs.getInt(1) + 1;
        }
        }catch (Exception ex){
        }
        finally{
        try{
        con.cerrar();
        }catch(Exception ex){
        }
        }
        return id;
    }
}
