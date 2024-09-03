/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VISTAS;

import guia.telefonica.Herramientas;
import javax.swing.ButtonGroup;

/**
 *
 * @author Max
 */
public class Busqueda extends javax.swing.JInternalFrame {

    private int seleccion;
    ButtonGroup grupo = new ButtonGroup();
    
    public Busqueda() {
        initComponents();
        grupo.add(BotonTelefono);
        grupo.add(BotonApellido);
        grupo.add(BotonCiudad);
        LabelVacio.setVisible(false);
        
        
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
        Panel2 = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        BotonCiudad = new javax.swing.JToggleButton();
        BotonTelefono = new javax.swing.JToggleButton();
        BotonApellido = new javax.swing.JToggleButton();
        CampoDeIngreso = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        LabelVacio = new javax.swing.JLabel();
        ComboBox = new javax.swing.JComboBox<>();
        BotonAceptar = new javax.swing.JButton();

        setTitle("Busqueda");

        jPanel1.setBackground(java.awt.SystemColor.textHighlight);
        jPanel1.setForeground(java.awt.Color.white);
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel2.setBackground(java.awt.Color.white);
        Panel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Panel2.setForeground(java.awt.Color.white);
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelTitulo.setForeground(java.awt.Color.black);
        LabelTitulo.setText("Seleccione el Criterio de Busqueda");
        Panel2.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 43));

        BotonCiudad.setText("Por Ciudad");
        BotonCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BotonCiudadItemStateChanged(evt);
            }
        });
        Panel2.add(BotonCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 90, 40));

        BotonTelefono.setText("Por Telefono");
        BotonTelefono.setToolTipText("");
        BotonTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonTelefono.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BotonTelefonoItemStateChanged(evt);
            }
        });
        Panel2.add(BotonTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 40));

        BotonApellido.setText("Por Apellido");
        BotonApellido.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BotonApellidoItemStateChanged(evt);
            }
        });
        Panel2.add(BotonApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 90, 40));

        CampoDeIngreso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoDeIngresoFocusLost(evt);
            }
        });
        CampoDeIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoDeIngresoMouseClicked(evt);
            }
        });
        CampoDeIngreso.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                CampoDeIngresoInputMethodTextChanged(evt);
            }
        });
        CampoDeIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoDeIngresoKeyTyped(evt);
            }
        });
        Panel2.add(CampoDeIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 300, 40));

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });
        Panel2.add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 110, 50));

        LabelVacio.setBackground(java.awt.Color.red);
        LabelVacio.setForeground(java.awt.Color.red);
        LabelVacio.setText("No puede estar vacio");
        Panel2.add(LabelVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jPanel1.add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 580));

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un contacto" }));
        ComboBox.setToolTipText("");
        jPanel1.add(ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 410, 30));

        BotonAceptar.setText("Aceptar");
        jPanel1.add(BotonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 524, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void BotonTelefonoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BotonTelefonoItemStateChanged
        seleccion = 1;
        Herramientas.comprobarSiElBotonEstaSeleccionado(BotonTelefono,BotonBuscar,CampoDeIngreso, "el Telefono", seleccion);
        
    }//GEN-LAST:event_BotonTelefonoItemStateChanged

    private void BotonApellidoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BotonApellidoItemStateChanged
        seleccion = 2;
        Herramientas.comprobarSiElBotonEstaSeleccionado(BotonApellido,BotonBuscar,CampoDeIngreso, "el Apellido",seleccion);
    }//GEN-LAST:event_BotonApellidoItemStateChanged

    private void BotonCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BotonCiudadItemStateChanged
        seleccion = 3;
        Herramientas.comprobarSiElBotonEstaSeleccionado(BotonCiudad,BotonBuscar,CampoDeIngreso ,"la Ciudad", seleccion);
    }//GEN-LAST:event_BotonCiudadItemStateChanged

    private void CampoDeIngresoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_CampoDeIngresoInputMethodTextChanged
        
    }//GEN-LAST:event_CampoDeIngresoInputMethodTextChanged

    private void CampoDeIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoDeIngresoKeyTyped
        
        Herramientas.noDejarIngresarNumeros(seleccion, evt);
        
    }//GEN-LAST:event_CampoDeIngresoKeyTyped

    private void CampoDeIngresoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoDeIngresoFocusLost
        
    }//GEN-LAST:event_CampoDeIngresoFocusLost

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        boolean validacion = Herramientas.revisarSiEstaVacio(CampoDeIngreso,LabelVacio ,BotonBuscar);
        if(!validacion){
            switch(seleccion){
                case 1 -> {
                     System.out.println("Telefono");
                     Long telefono = Long.valueOf(CampoDeIngreso.getText());
                     telefono
                }
                case 2 -> {
                    System.out.println("Apellido");
                }
                case 3 -> {
                    System.out.println("Ciudad");
                }
            }
           
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void CampoDeIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoDeIngresoMouseClicked
        CampoDeIngreso.setText("");
        BotonBuscar.setEnabled(true);
             
    }//GEN-LAST:event_CampoDeIngresoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JToggleButton BotonApellido;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JToggleButton BotonCiudad;
    private javax.swing.JToggleButton BotonTelefono;
    private javax.swing.JTextField CampoDeIngreso;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel LabelVacio;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
