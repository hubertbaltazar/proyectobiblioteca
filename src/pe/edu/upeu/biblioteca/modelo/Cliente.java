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
public class Cliente {
    private int idcliente;
    private String codigo;
    private String apellidos;
    private String nombres;
    private String sexo;
    private int edad;
    private String direccion;
    private String telefono;
    private String religion;
    private String categoria;

    public Cliente() {
    }

    public Cliente(String codigo, String apellidos, String nombres, String sexo,int edad, String direccion, String telefono, String religion, String categoria) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.sexo = sexo;
        this.edad=edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.religion = religion;
        this.categoria = categoria;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     public static Cliente loadCliente(ResultSet rs)throws SQLException {
        Cliente cliente=new Cliente();
        cliente.setIdcliente(rs.getInt("idCliente"));
        cliente.setCodigo(rs.getString("Codigo"));
        cliente.setApellidos(rs.getString("Apellidos"));
        cliente.setNombres(rs.getString("Nombres"));
        cliente.setSexo(rs.getString("Sexo"));
        cliente.setEdad(rs.getInt("Edad"));
        cliente.setDireccion(rs.getString("Direccion"));
        cliente.setTelefono(rs.getString("Telefono"));
        cliente.setReligion(rs.getString("Religion"));
        cliente.setCategoria(rs.getString("Categoria"));
        
        return cliente;
       
    }
    
}
