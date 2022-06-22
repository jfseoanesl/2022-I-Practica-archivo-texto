/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Jairo F
 */
public class GuiPrincipal extends JDialog {
    
    private JLabel lbSerie, lbMarca, lbPrecio;
    private JTextField txtSerie;
    private JFormattedTextField txtPrecio;
    private JComboBox cmbMarca;
    private JPanel panelDatos, panelBotones, principal;
    private JButton btnGuardar, btnCancelar, btnNuevo;
    private Container contenedor;
    

    public GuiPrincipal(Frame frame, boolean bln) {
        super(frame, bln);
        this.setTitle("Catalogo de Computadores - Registro - Version 1.0");
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.inicializarComponentes();
        this.pack();
        //this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }
    
    
    private void inicializarComponentes(){
        this.contenedor=this.getContentPane();
        this.contenedor.setLayout(new FlowLayout());
        this.principal = new JPanel();
        this.principal.setLayout(new BorderLayout());
        this.principal.setBorder(BorderFactory.createTitledBorder("Registro de nuevo PC"));
        this.inicializarPanelDatos();
        this.inicializarPanelBotones();
        this.contenedor.add(this.principal);
    }
    
    private void inicializarPanelDatos(){
        this.panelDatos=new JPanel();
        this.panelDatos.setLayout(new GridLayout(3,2,5,5));
        
        this.lbMarca= new JLabel( "Marca:    ");
        this.lbSerie= new JLabel( "No serie: ");
        this.lbPrecio= new JLabel("Precio:   ");
        
        this.txtSerie = new JTextField(15);
        this.cmbMarca = new JComboBox();
        this.cmbMarca.addItem("Hp");
        this.cmbMarca.addItem("Lenovo");
        this.cmbMarca.addItem("Samsung");
        this.cmbMarca.addItem("Dell");
        this.cmbMarca.addItem("Asus");
        this.txtPrecio = new JFormattedTextField(new Integer(0));
        
        this.panelDatos.add(this.lbSerie);
        this.panelDatos.add(this.txtSerie);
        
        this.panelDatos.add(this.lbMarca);
        this.panelDatos.add(this.cmbMarca);
        this.panelDatos.add(this.lbPrecio);
        this.panelDatos.add(this.txtPrecio);
        
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new FlowLayout());
        subPanel.add(this.panelDatos);
        subPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        this.principal.add(subPanel, BorderLayout.CENTER);
        
    }
    
    
    private void inicializarPanelBotones(){
        
        this.panelBotones = new JPanel();
        this.panelBotones.setLayout(new GridLayout(3,1,5,5));
        
        this.btnNuevo = new JButton("Nuevo");
        this.btnGuardar = new JButton("Guardar");
        this.btnCancelar = new JButton("Cancelar");
        
        this.panelBotones.add(this.btnNuevo);
        this.panelBotones.add(this.btnGuardar);
        this.panelBotones.add(this.btnCancelar);
        
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new FlowLayout());
        
        subPanel.add(this.panelBotones);
        subPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        this.principal.add(subPanel, BorderLayout.EAST);
    
    }
    
    
    
    
}
