/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.biblioteca.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pe.edu.upeu.biblioteca.config.Conexion;
import pe.edu.upeu.biblioteca.modelo.Usuario;

/**
 *
 * @author Hubert
 */
public class UsuarioDAO {
    int res;
    Connection cx;
    Statement st;
    ResultSet rs;
    String sql;
   
    public int ValidarUsuario(String nom,String clave){
        sql="SELECT *FROM Usuario WHERE Nombre='"+nom+"'AND Clave='"+clave+"'";
        try{
            cx=Conexion.GetConexion();
            st=cx.createStatement();
            rs=st.executeQuery(sql);
            if(rs.next()){
                res=1;
            }else{
                res=2;
            }
        }catch(ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error"+ex);
        }
        return res;
    }
    
    public int verificarUsuario(String user){
    sql="SELECT *FROM Usuario WHERE Nombre='"+user+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            //cx.close();
            if(rs.next()){
                res=1;
            }else{
                res=2;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return res;    
    }
    public int registrarUsuario(String user, String clave){
        sql="INSERT INTO Usuario VALUES(null,'"+user+"','"+clave+"')";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }         
    return res;
    }
    public ArrayList<Usuario> listarUsuario(){
        ArrayList<Usuario> lista = new ArrayList();
        sql = "select *from Usuario";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Usuario.loadUsuario(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    }
    public int modificarUsuario(int idu, String usuario, String clave){
    sql="UPDATE USUARIO set Nombre='"+usuario+"', Clave='"+clave+"' WHERE idUsuario='"+idu+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }  
    return res;
    }
    public int eliminarUsuario(int idu){
        sql="DELETE FROM Usuario WHERE idUsuario='"+idu+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        } 
    return res;
    }
    public ArrayList<Usuario> listarUsuario(int id){
        ArrayList<Usuario> lista = new ArrayList();
        sql = "select *from Usuario WHERE idUsuario="+id;
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Usuario.loadUsuario(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    } 
    public ArrayList<Usuario> listarUsuario(String us){
    ArrayList<Usuario> lista = new ArrayList();
        sql = "select *from Usuario WHERE Nombre LIKE '"+us+"'%";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Usuario.loadUsuario(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }   
    return lista;
    }
}
