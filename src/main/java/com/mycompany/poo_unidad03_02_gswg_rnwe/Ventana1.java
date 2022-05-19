/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_unidad03_02_gswg_rnwe;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Ventana1 extends JFrame{
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    public Ventana1(String title) {
        super(title);
        this.setSize(400, 300);
        this.setLocation(150, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);    
    }
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(5,1));
        this.iniciarPanel();
        this.iniciarEtiquetas();
        this.iniciarCombo();
        this.iniciarCuadrosTexto();
        this.iniciarBotones();
        //this.iniciarChecks();
    }
    public void iniciarPanel(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setBackground(Color.CYAN);
        this.jPanelList.get(1).setBackground(Color.WHITE);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
    }
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("INSCRÍBETE"));
        this.jLabelList.get(0).setBackground(Color.CYAN);
        this.jLabelList.add(new JLabel("Seleccione una Sede: *"));
        this.jLabelList.add(new JLabel("Tipo de Documento: "));
        this.jLabelList.add(new JLabel("Ingrese su Identificación: *"));
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jLabelList.get(0).setOpaque(true);
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        
    }
    public void iniciarCombo(){
        this.jComboBox1= new JComboBox();
        this.jComboBox1.addItem("MATRIZ CUENCA");
        this.jComboBox1.addItem("GUAYAQUIL");
        this.jComboBox1.addItem("QUITO");
        this.jPanelList.get(1).add(this.jComboBox1);
        
        this.jComboBox2= new JComboBox();
        this.jComboBox2.addItem("CEDULA");
        this.jComboBox2.addItem("RUC");
        this.jComboBox2.addItem("PASAPORTE");
        this.jPanelList.get(2).add(this.jComboBox2);
        
    }
    public void iniciarCuadrosTexto(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(0).setColumns(10);
        this.jPanelList.get(3).add(this.jTextFieldList.get(0));   
    }
     public void iniciarBotones(){
        this.jButtonList= new ArrayList<>();
        this.jButtonList.add(new JButton());
        this.jButtonList.get(0).setText("INGRESAR");
        this.jPanelList.get(4).add(this.jButtonList.get(0));
    }
 
}
