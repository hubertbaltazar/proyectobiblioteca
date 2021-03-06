/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.biblioteca.vista;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.edu.upeu.biblioteca.DAO.ClienteDAO;
import pe.edu.upeu.biblioteca.config.Conexion;

/**
 *
 * @author Hubert
 */
public class ClienteForm extends javax.swing.JInternalFrame {
ClienteDAO pd = new ClienteDAO();
    int op;
    ArrayList<pe.edu.upeu.biblioteca.modelo.Cliente> lista = new ArrayList();
    DefaultTableModel model;
    DefaultComboBoxModel modelocombo = new DefaultComboBoxModel();
    DefaultListModel modelolista =  new DefaultListModel();
           int res;
    Connection cx;
    Statement st;
    ResultSet rs;
    Conexion cc=new Conexion();
    /**
     * Creates new form Cliente
     */
    public ClienteForm() {
        initComponents();
        listarCliente();
        txtcodigo.requestFocus();
        saltar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtidcliente = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtreligion = new javax.swing.JTextField();
        cbosexo = new javax.swing.JComboBox();
        cbocategoria = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblista = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnmodificar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btninsertar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtbuscartodo = new javax.swing.JTextField();

        setForeground(new java.awt.Color(255, 255, 255));
        setIconifiable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de cliente"));

        jLabel1.setText("IdCliente");

        jLabel2.setText("Codigo");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Nombres");

        jLabel5.setText("Sexo");

        jLabel6.setText("Edad");

        jLabel7.setText("Direccion");

        jLabel8.setText("Telefono");

        jLabel9.setText("Religion");

        jLabel10.setText("Categoria");

        txtidcliente.setEnabled(false);

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        txtapellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidosActionPerformed(evt);
            }
        });
        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidosKeyTyped(evt);
            }
        });

        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });

        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        cbosexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione\t\t", "F", "M" }));

        cbocategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Academico", "Personal" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombres)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbocategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtreligion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel9)
                        .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtreligion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cbocategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de clientes"));

        jtblista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Codigo", "Apellidos", "Nombres", "Sexo", "Edad", "Direccion", "Telefono", "Religion", "Categoria"
            }
        ));
        jtblista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblistaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblista);
        if (jtblista.getColumnModel().getColumnCount() > 0) {
            jtblista.getColumnModel().getColumn(0).setMinWidth(10);
            jtblista.getColumnModel().getColumn(0).setMaxWidth(50);
            jtblista.getColumnModel().getColumn(1).setPreferredWidth(200);
            jtblista.getColumnModel().getColumn(2).setPreferredWidth(400);
            jtblista.getColumnModel().getColumn(3).setPreferredWidth(400);
            jtblista.getColumnModel().getColumn(4).setPreferredWidth(100);
            jtblista.getColumnModel().getColumn(5).setPreferredWidth(100);
            jtblista.getColumnModel().getColumn(6).setPreferredWidth(500);
            jtblista.getColumnModel().getColumn(7).setPreferredWidth(200);
            jtblista.getColumnModel().getColumn(8).setPreferredWidth(300);
            jtblista.getColumnModel().getColumn(9).setPreferredWidth(180);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btninsertar.setText("Insertar");
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel11.setText("Buscar");

        txtbuscartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscartodoActionPerformed(evt);
            }
        });
        txtbuscartodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscartodoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnmodificar)
                .addGap(36, 36, 36)
                .addComponent(btneliminar)
                .addGap(18, 18, 18)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addComponent(txtbuscartodo))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(btninsertar)
                    .addContainerGap(448, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbuscartodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btninsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtapellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidosKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
            if(!Character.isLetter(c)&& c!=KeyEvent.VK_SPACE){
                getToolkit().beep();
                evt.consume();
            }
    }//GEN-LAST:event_txtapellidosKeyTyped

    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
            if(!Character.isLetter(c)&& c!=KeyEvent.VK_SPACE){
                getToolkit().beep();
                evt.consume();
            }
    }//GEN-LAST:event_txtnombresKeyTyped

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
        // TODO add your handling code here:
           String c=String.valueOf(evt.getKeyChar());
            if(!c.matches("[0-9]")){
                getToolkit().beep();
                evt.consume();
            }
    }//GEN-LAST:event_txtedadKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        // TODO add your handling code here:
           String c=String.valueOf(evt.getKeyChar());
            if(!c.matches("[0-9]")){
                getToolkit().beep();
                evt.consume();
            }
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed
        // TODO add your handling code here:
        String codigo=txtcodigo.getText();
        String apellidos = txtapellidos.getText();
        String nombres = txtnombres.getText();
        String sexo=cbosexo.getSelectedItem().toString();
        int edad=Integer.parseInt(txtedad.getText());
       
        String direccion=txtdireccion.getText();
        String telefono=txttelefono.getText();
        String religion=txtreligion.getText();
         String categoria=cbocategoria.getSelectedItem().toString();
        op = pd.registrarCliente(codigo,apellidos, nombres, sexo,edad,direccion,telefono,religion,categoria);
        limpiar();
        if(op!=0){
            JOptionPane.showMessageDialog(null,"Cliente registrado!");
            updateComponets();
        }else{
            JOptionPane.showMessageDialog(null,"Cliente no registrado!");
        }
    }//GEN-LAST:event_btninsertarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        int fil =jtblista.getSelectedRow();
        if(fil<0){
            JOptionPane.showMessageDialog(null, "Seleccionar El Pasajero a MODIFICAR!");
        }else{
            int confirmar=JOptionPane.showConfirmDialog(null, "Esta seguro que desea MODIFICAR el Pasajero? "); 
            if(JOptionPane.OK_OPTION==confirmar) {
                  int id = Integer.parseInt(txtidcliente.getText());
                  String codigo=txtcodigo.getText();
                  String apellidos = txtapellidos.getText();
                  String nombres = txtnombres.getText();
                  String sexo = cbosexo.getSelectedItem().toString();
                  int edad=Integer.parseInt(txtedad.getText());
                  String categoria=cbocategoria.getSelectedItem().toString();
                  String direccion=txtdireccion.getText();
                  String telefono=txttelefono.getText();
                  String religion=txtreligion.getText();
               
                  int x = pd.modificarCliente(id, codigo,apellidos, nombres, sexo,edad,direccion,telefono,religion,categoria);
                  if(x==1){
                      JOptionPane.showMessageDialog(null, "Cliente MODIFICADO!");
                      updateComponets();
                      limpiar();
                  }else{
                      JOptionPane.showMessageDialog(null, "El cliente no se ha MODIFICADO!");      
                  }                   
            }        
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void jtblistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblistaMouseClicked
        // TODO add your handling code here:
        if(evt.getButton()==1){
            int fila = jtblista.getSelectedRow();
            int celda = (int)jtblista.getValueAt(fila, 0);
            lista = pd.listarCliente(celda);
            for(int i=0;i<lista.size();i++){
                txtidcliente.setText(""+lista.get(i).getIdcliente());
                txtcodigo.setText(lista.get(i).getCodigo());
                txtapellidos.setText(lista.get(i).getApellidos());
                txtnombres.setText(lista.get(i).getNombres());
                cbosexo.setSelectedItem(lista.get(i).getSexo());
                txtedad.setText(""+lista.get(i).getEdad());
                txtdireccion.setText(lista.get(i).getDireccion());
                txttelefono.setText(lista.get(i).getTelefono());
                txtreligion.setText(lista.get(i).getReligion());
                cbocategoria.setSelectedItem(lista.get(i).getCategoria());
                
            }
        }
    }//GEN-LAST:event_jtblistaMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        int fila = jtblista.getSelectedRow();
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccionar El Cliente a ELIMINAR");            
        }else{
            int confirmar=JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea ELIMINAR a este Cliente? "); 
            if(JOptionPane.OK_OPTION==confirmar) {
                    int celda = (int) jtblista.getValueAt(fila, 0);
                    int x = pd.eliminarCliente(celda);
                    if(x==1){
                        JOptionPane.showMessageDialog(null, "Cliente ELIMINADO!");
                        updateComponets();
                        limpiar();
                    }else{
                        JOptionPane.showMessageDialog(null, "Cliente no ELIMINADO!");      
                    }                   
            } 
            
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtapellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtapellidosActionPerformed

    private void txtbuscartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscartodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscartodoActionPerformed

    private void txtbuscartodoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscartodoKeyPressed
        // TODO add your handling code here:
  
    
        String[] titulos = {"Id", "Codigo", "Apellidos", "Nombres", "Sexo", "Edad","Direccion","Telefono","Religion","Categoria"};
       
            String[] registros = new String[50];

            String sql = "SELECT *FROM Cliente WHERE idCliente LIKE '%" + txtbuscartodo.getText() + "%' "
                    + "OR Codigo LIKE '%" + txtbuscartodo.getText() + "%'"
                    + "OR Apellidos LIKE '%" + txtbuscartodo.getText() + "%'"
                    + "OR Nombres LIKE '%" + txtbuscartodo.getText() + "%'"
                    + "OR Sexo LIKE '%" + txtbuscartodo.getText() + "%'"
                    + "OR Edad LIKE '%" + txtbuscartodo.getText() + "%'"
                    + "OR Direccion LIKE '%" + txtbuscartodo.getText() + "%'"
                    + "OR Telefono LIKE '%" + txtbuscartodo.getText() + "%'"
                    + "OR Religion LIKE '%" + txtbuscartodo.getText() + "%'"
                    + "OR Categoria LIKE '%" + txtbuscartodo.getText() + "%'";
            model = new DefaultTableModel(null,titulos);
         
            Connection conect = null;
            
            try {
           try {
               conect=Conexion.GetConexion();
           } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error: "+ex);
           }
               st = (Statement) conect.createStatement();
               rs = st.executeQuery(sql);
               
                while (rs.next()) {
                    registros[0] = rs.getString("idCliente");
                    registros[1] = rs.getString("Codigo");
                    registros[2] = rs.getString("Apellidos");
                    registros[3] = rs.getString("Nombres");
                    registros[4] = rs.getString("Sexo");
                    registros[5] = rs.getString("Edad");
                    registros[6] = rs.getString("Direccion");
                    registros[7] = rs.getString("Telefono");
                    registros[8] = rs.getString("Religion");
                    registros[9] = rs.getString("Categoria");
                    model.addRow(registros);
                }
               jtblista.setModel(model);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        
        /*int id=Integer.parseInt(""+txtidcliente.getText());
        String cod=txtcodigo.getText();
        String ape=txtapellidos.getText();
        String nom=txtnombres.getText();
        String sexo=cbosexo.getSelectedItem().toString();;
        int edad=Integer.parseInt(""+txtedad.getText());
        String dir=txtdireccion.getText();
        String tlf=txttelefono.getText();
        String rel=txttelefono.getText();
        String cat=cbocategoria.getSelectedItem().toString();
        op=pd.buscarcliente(id, cod, ape, nom, sexo, edad, dir, tlf, rel, cat);*/
        
    
    
    
                
    }//GEN-LAST:event_txtbuscartodoKeyPressed

    final void saltar()
    {
        txtcodigo.requestFocus();
        txtcodigo.transferFocus();
        txtapellidos.requestFocus();
        txtapellidos.transferFocus();
    }
     final void listarCliente(){
    lista = pd.listarCliente();
    model = (DefaultTableModel) jtblista.getModel();
        Object[] p = new Object[10];
        for(int i=0;i<lista.size();i++){
            p[0]=lista.get(i).getIdcliente();
            p[1]=lista.get(i).getCodigo();
            p[2]=lista.get(i).getApellidos();
            p[3]=lista.get(i).getNombres();
            p[4]=lista.get(i).getSexo();
            p[5]=lista.get(i).getEdad();
            p[6]=lista.get(i).getDireccion();
            p[7]=lista.get(i).getTelefono();
            p[8]=lista.get(i).getReligion();
            p[9]=lista.get(i).getCategoria();
            model.addRow(p);
        }        
        jtblista.setModel(model);
    }
    
    void limpiar(){
        txtcodigo.setText(null);
        txtapellidos.setText(null);
        txtnombres.setText(null);
        txtedad.setText(null);
        txtdireccion.setText(null);
        txtedad.setText(null);
        txttelefono.setText(null);
        txtreligion.setText(null);
        txtcodigo.requestFocus();
        
    }
    
    void updateComponets(){
            LimpiarTabla(model);
            listarCliente();
            modelocombo.removeAllElements();
            modelolista.clear();    
    }
   
    void LimpiarTabla(DefaultTableModel modelo){
        int a =modelo.getRowCount()-1;
        for(int i=a;i>=0;i--){  
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btninsertar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox cbocategoria;
    private javax.swing.JComboBox cbosexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblista;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtbuscartodo;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtreligion;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
