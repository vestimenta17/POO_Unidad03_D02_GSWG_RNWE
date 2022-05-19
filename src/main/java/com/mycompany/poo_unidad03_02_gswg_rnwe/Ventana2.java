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
import javax.swing.BorderFactory;
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
public class Ventana2 extends JFrame{
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    public Ventana2(String title) {
        super(title);
        this.setSize(600, 400);
        this.setLocation(150, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);    
    }
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setLayout(new GridLayout(9,2));
        this.jPanel1.setBorder(BorderFactory.createTitledBorder("Personal"));
        this.jPanel1.setBackground(Color.WHITE);
        //this.jPanel1.setBorder(BorderFactory.createTitledBorder("Personal"));
        //this.jPanel1.setLayout(new BorderLayout(0,1));
        this.iniciarPanel();
        this.iniciarEtiquetas();
        this.iniciarCuadrosTexto();
        //this.iniciarBotones();
        //this.iniciarChecks();
    }
    public void iniciarPanel(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(1).setBackground(Color.WHITE);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBackground(Color.WHITE);
        this.jPanelList.get(7).setBackground(Color.WHITE);
        this.jPanelList.get(8).setBackground(Color.WHITE);
        this.jPanelList.get(9).setBackground(Color.WHITE);
        this.jPanelList.get(10).setBackground(Color.WHITE);
        this.jPanelList.get(11).setBackground(Color.WHITE);
        this.jPanelList.get(12).setBackground(Color.WHITE);
        this.jPanelList.get(13).setBackground(Color.WHITE);
        this.jPanelList.get(14).setBackground(Color.WHITE);
        this.jPanelList.get(15).setBackground(Color.WHITE);
        this.jPanelList.get(16).setBackground(Color.WHITE);
        this.jPanelList.get(17).setBackground(Color.WHITE);
        
        
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6));
        this.jPanel1.add(this.jPanelList.get(7));
        this.jPanel1.add(this.jPanelList.get(8));
        this.jPanel1.add(this.jPanelList.get(9));
        this.jPanel1.add(this.jPanelList.get(10));
        this.jPanel1.add(this.jPanelList.get(11));
        this.jPanel1.add(this.jPanelList.get(12));
        this.jPanel1.add(this.jPanelList.get(13));
        this.jPanel1.add(this.jPanelList.get(14));
        this.jPanel1.add(this.jPanelList.get(15));
        this.jPanel1.add(this.jPanelList.get(16));
        this.jPanel1.add(this.jPanelList.get(17));
    }
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Apellidos: "));
        this.jLabelList.add(new JLabel("RAMON NARVAEZ"));
        this.jLabelList.add(new JLabel("Nombres: "));
        this.jLabelList.add(new JLabel("WENDY ESTEFANIA"));
        this.jLabelList.add(new JLabel("Nacionalidad: *"));
        this.jLabelList.add(new JLabel("ECUATORIANA"));
        this.jLabelList.add(new JLabel("Género: *"));
        this.jLabelList.add(new JLabel("FEMENINO"));
        this.jLabelList.add(new JLabel("Correo Electrónico Personal: *"));
        this.jLabelList.add(new JLabel("wramon445@gmail.com"));
        this.jLabelList.add(new JLabel("Fecha de Nacimiento: *"));
        this.jLabelList.add(new JLabel("2/05/2022"));
        this.jLabelList.add(new JLabel("Telefono Domicilio: *"));
        this.jLabelList.add(new JLabel("4081657"));
        this.jLabelList.add(new JLabel("Telefono Celular: *"));
        this.jLabelList.add(new JLabel("0983450165"));
        this.jLabelList.add(new JLabel("Whatsapp: *"));
         
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jLabelList.get(7));
        this.jPanelList.get(8).add(this.jLabelList.get(8));
        this.jPanelList.get(9).add(this.jLabelList.get(9));
        this.jPanelList.get(10).add(this.jLabelList.get(10));
        this.jPanelList.get(11).add(this.jLabelList.get(11));
        this.jPanelList.get(12).add(this.jLabelList.get(12));
        this.jPanelList.get(13).add(this.jLabelList.get(13));
        this.jPanelList.get(14).add(this.jLabelList.get(14));
        this.jPanelList.get(15).add(this.jLabelList.get(15));
        this.jPanelList.get(16).add(this.jLabelList.get(16));
        
    }
    public void iniciarCuadrosTexto(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(0).setColumns(10);
        this.jPanelList.get(17).add(this.jTextFieldList.get(0));   
    }
 
}

