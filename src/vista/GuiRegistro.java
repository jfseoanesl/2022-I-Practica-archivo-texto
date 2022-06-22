package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.*;

public class GuiRegistro extends JDialog{
    private JPanel panelPrincipal, panelDatos, panelOpciones;
    private JButton btnNuevo, brnguardar, btnCancelar;
    private JLabel lbSerie, lbMarca, lbPrecio;
    private JTextField txtSerie;
    private JComboBox cmbMarca;
    private JFormattedTextField txtPrecio;
    private Container contenedor;

    public GuiRegistro(Frame frame, boolean bln) {
        super(frame, bln);
        this.setTitle("Registro de Computadores - Version 1.0");
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.iniciarComponentes();
        //this.setSize(300, 200);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    private void iniciarComponentes(){
        this.contenedor = this.getContentPane();
        this.contenedor.setLayout(new FlowLayout());
        
        this.panelPrincipal = new JPanel();
        this.panelPrincipal.setLayout(new BorderLayout());
        
        this.iniciarPanelDatos();
        this.iniciarPanelOpciones();
        
        this.panelPrincipal.setBorder(BorderFactory.createTitledBorder("Datos basicos de pc"));
       
        this.contenedor.add(this.panelPrincipal);
    
    }
    
    private void iniciarPanelDatos(){
        
        this.panelDatos = new JPanel();
        this.panelDatos.setLayout(new GridLayout(3,2,5,5));
        
        this.lbSerie= new JLabel("No serie: ");
        this.lbMarca = new JLabel("Marca PC: ");
        this.lbPrecio = new JLabel("Precio $: ");
        
        this.txtSerie = new JTextField(15);
        this.txtPrecio = new JFormattedTextField(new Integer(0));
        
        this.cmbMarca = new JComboBox();
        this.cmbMarca.addItem("Hp");
        this.cmbMarca.addItem("Lenovo");
        this.cmbMarca.addItem("Asus");
        this.cmbMarca.addItem("Dell");
        this.cmbMarca.addItem("Acer");
        this.cmbMarca.addItem("Otra");
        
        this.panelDatos.add(this.lbSerie);
        this.panelDatos.add(this.txtSerie);
        
        this.panelDatos.add(this.lbMarca);
        this.panelDatos.add(this.cmbMarca);
        
        this.panelDatos.add(this.lbPrecio);
        this.panelDatos.add(this.txtPrecio);
        
        this.panelDatos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        this.panelPrincipal.add(this.panelDatos, BorderLayout.CENTER);
        
    }
    
    private void iniciarPanelOpciones(){
        
        this.panelOpciones = new JPanel();
        this.panelOpciones.setLayout(new GridLayout(3,1,5,5));
        
        this.brnguardar = new JButton("Guardar");
        this.btnCancelar = new JButton("Cancelar");
        this.btnNuevo = new JButton("Nuevo");
        
        this.panelOpciones.add(this.btnNuevo);
        this.panelOpciones.add(this.brnguardar);
        this.panelOpciones.add(this.btnCancelar);
        
        this.panelOpciones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        this.panelPrincipal.add(this.panelOpciones, BorderLayout.EAST);
    }
    
    
    
}
