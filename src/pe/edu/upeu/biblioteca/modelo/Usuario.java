/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.biblioteca.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hubert
 */
public class Usuario {

 
    private int Id;
    private String Usuario;
    private String Clave;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Usuario() {
    }
    

    public Usuario(String usuario,String clave) {
        this.Usuario=usuario;
        this.Clave=clave;
    }

    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    public static Usuario loadUsuario(ResultSet rs)throws SQLException{
        Usuario usuario=new Usuario();
        usuario.setId(rs.getInt("idUsuario"));
        usuario.setUsuario(rs.getString("Nombre"));
        usuario.setClave(rs.getString("Clave"));
        return usuario;
        
    
    }
    

   
    
    
    
}
