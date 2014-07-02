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
import pe.edu.upeu.biblioteca.modelo.Cliente;
import pe.edu.upeu.biblioteca.modelo.Usuario;

/**
 *
 * @author Hubert
 */
public class ClienteDAO {
     int res;
    Connection cx;
    Statement st;
    ResultSet rs;
    String sql;
   
    public int registrarCliente(String codigo,String apellidos,String nombres,String sexo,int edad, String direccion,String telefono,String religion,String categoria)
    {
        sql="INSERT INTO cliente VALUES (null,'"+codigo+"', '"+apellidos+"','"+nombres+"','"+sexo+"','"+edad+"','"+direccion+"','"+telefono+"','"+religion+"','"+categoria+"')";
        try{
             cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
       } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }      
  
        return res;
    }
    
    public ArrayList<Cliente> listarCliente(){
        ArrayList<Cliente> lista = new ArrayList();
        sql = "select * from cliente";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Cliente.loadCliente(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    }
    
    public int eliminarCliente(int id){
        sql="DELETE FROM cliente WHERE idCliente='"+id+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        } 
    return res;
    }
    
    public int modificarCliente(int idp,  String codigo,String apellidos, String nombres, String sexo,int edad,String dir,String tlf,String rel,String cat){
    sql="UPDATE cliente set Codigo='"+codigo+"', Apellidos='"+apellidos+"', Nombres='"+nombres+"', Sexo='"+sexo+"', Edad='"+edad+"',Direccion='"+dir+"',Telefono='"+tlf+"',Religion='"+rel+"',Categoria='"+cat+"' WHERE idCliente='"+idp+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }  
    return res;
    }    
    public int buscarcliente(int idc,String codigo,String ape,String nom,String sexo,int edad,String dir,String tlf,String rel,String cat )
    {
        sql = "SELECT *FROM Cliente WHERE Codigo LIKE '%" + codigo + "%', "
                 + "OR Nombres LIKE '%" + nom + "%',"
                 + "OR Apellidos LIKE '%" + ape + "%',"
                 + "OR Sexo LIKE '%" + sexo + "%',"
                 + "OR Edad LIKE '%" + edad + "%',"
                 + "OR Direccion LIKE '%" + dir + "%',"
                 + "OR Telefono LIKE '%" + tlf + "%',"
                 + "OR Categoria LIKE '%" + cat + "%',"
                + "OR Religion LIKE '%" + rel + "%',"
                     + "OR idCliente LIKE '%" + idc + "%'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }  
    return res;
        
    }
    public ArrayList<Cliente> listarCliente(int id){
        ArrayList<Cliente> lista = new ArrayList();
        sql = "select * from cliente WHERE idCliente="+id;
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Cliente.loadCliente(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    }
    
}
