/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_unidad03_02_gswg_rnwe;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana5 extends JFrame {
    private JPanel jPanel1;
    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private List<JComboBox> jComboBoxList;

    public Ventana5(String title) throws HeadlessException {
        super(title);
        this.setSize(1300,200);
        this.setLocation(60, 70);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    public void iniciarComponentes(){
        this.jPanel1=new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(3,3));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarCombo();
     }
    
    public void iniciarPaneles(){
         this.jPanelList=new ArrayList<>();
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
         
         this.jPanel1.add(this.jPanelList.get(0));
         this.jPanel1.add(this.jPanelList.get(1));
         this.jPanel1.add(this.jPanelList.get(2));
         this.jPanel1.add(this.jPanelList.get(3));
         this.jPanel1.add(this.jPanelList.get(4));
         this.jPanel1.add(this.jPanelList.get(5));
         this.jPanel1.add(this.jPanelList.get(6)); 
     }
     
     public void iniciarEtiquetas(){
         this.jLabelList= new ArrayList<>();
         this.jLabelList.add(new JLabel("Sede: "));
         this.jLabelList.add(new JLabel("Campus/Extension: "));
         this.jLabelList.add(new JLabel("Carrera: "));
         this.jLabelList.add(new JLabel("Código del proyecto: "));
         this.jLabelList.add(new JLabel("Modalidad: "));
         this.jLabelList.add(new JLabel("Periodo Académico: "));
         this.jLabelList.add(new JLabel("Fecha Inicio Clases: "));
         this.jLabelList.add(new JLabel(" 28/03/2022 al 06/08/2022 "));         
         
         this.jPanelList.get(0).add(this.jLabelList.get(0));
         this.jPanelList.get(1).add(this.jLabelList.get(1));
         this.jPanelList.get(2).add(this.jLabelList.get(2));
         this.jPanelList.get(3).add(this.jLabelList.get(3));
         this.jPanelList.get(4).add(this.jLabelList.get(4));
         this.jPanelList.get(5).add(this.jLabelList.get(5));
         this.jPanelList.get(6).add(this.jLabelList.get(6));
         this.jPanelList.get(6).add(this.jLabelList.get(7));
     }
     
     public void iniciarCombo(){
         this.jComboBoxList= new ArrayList<>();
         this.jComboBoxList.add(new JComboBox());
         this.jComboBoxList.add(new JComboBox());
         this.jComboBoxList.add(new JComboBox());
         this.jComboBoxList.add(new JComboBox());
         this.jComboBoxList.add(new JComboBox());
         this.jComboBoxList.add(new JComboBox());
        
         this.jComboBoxList.get(0).addItem("MATRIZ CUENCA");
         this.jComboBoxList.get(0).addItem("GUAYAQUIL");
         this.jComboBoxList.get(0).addItem("QUITO");
         
         this.jComboBoxList.get(1).addItem("EL VECINO");
         this.jComboBoxList.get(1).addItem("EL GIRON");
         this.jComboBoxList.get(1).addItem("MARIA AUXILIADORA");
         this.jComboBoxList.get(1).addItem("QUITO SUR");
         this.jComboBoxList.get(1).addItem("QUITO NORTE");
         
         this.jComboBoxList.get(2).addItem("AGROPECUARIA");
         this.jComboBoxList.get(2).addItem("TELECOMUNICACIONES");
         this.jComboBoxList.get(2).addItem("ARQUITECTURA");
         this.jComboBoxList.get(2).addItem("ECONOMIA");
         this.jComboBoxList.get(2).addItem("ELECTRONICA Y AUTOMATIZACION");
         this.jComboBoxList.get(2).addItem("ING. CIVIL");
         this.jComboBoxList.get(2).addItem("MECATRONICA");
         this.jComboBoxList.get(2).addItem("PSICOLOGIA");
         this.jComboBoxList.get(2).addItem("COMUNICACION");
         this.jComboBoxList.get(2).addItem("AUTOMOTRIZ");

         this.jComboBoxList.get(3).addItem("AGROPECUARIA[REDISEÑO]-NUEVA O REDISEÑO");
         this.jComboBoxList.get(3).addItem("TELECOMUNICACIONES[REDISEÑO]-NUEVA O REDISEÑO");
         this.jComboBoxList.get(3).addItem("ARQUITECTURA[REDISEÑO]-NUEVA O REDISEÑO");
         this.jComboBoxList.get(3).addItem("ECONOMIA[REDISEÑO]-NUEVA O REDISEÑO");
         this.jComboBoxList.get(3).addItem("ELECTRONICA Y AUTOMATIZACION[REDISEÑO]-NUEVA O REDISEÑO");
         this.jComboBoxList.get(3).addItem("ING. CIVIL[REDISEÑO]-NUEVA O REDISEÑO");
         this.jComboBoxList.get(3).addItem("MECATRONICA[REDISEÑO]-NUEVA O REDISEÑO");
         this.jComboBoxList.get(3).addItem("PSICOLOGIA[REDISEÑO]-NUEVA O REDISEÑO");
         this.jComboBoxList.get(3).addItem("COMUNICACION[REDISEÑO]-NUEVA O REDISEÑO");
         this.jComboBoxList.get(3).addItem("AUTOMOTRIZ[REDISEÑO]-NUEVA O REDISEÑO");

         this.jComboBoxList.get(4).addItem("PRESENCIAL");
         this.jComboBoxList.get(4).addItem("EN LINEA");
         this.jComboBoxList.get(4).addItem("DUAL");
         
         this.jComboBoxList.get(5).addItem("2021-2022");
         this.jComboBoxList.get(5).addItem("2022-2022");
        
        this.jPanelList.get(0).add(this.jComboBoxList.get(0));
        this.jPanelList.get(1).add(this.jComboBoxList.get(1)); 
        this.jPanelList.get(2).add(this.jComboBoxList.get(2));
        this.jPanelList.get(3).add(this.jComboBoxList.get(3));
        this.jPanelList.get(4).add(this.jComboBoxList.get(4));
        this.jPanelList.get(5).add(this.jComboBoxList.get(5));
     }
     
}
