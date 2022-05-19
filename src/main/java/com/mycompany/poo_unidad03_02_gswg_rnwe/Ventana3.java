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

/*
 *
 * @author HP
 */
public class Ventana3 extends JFrame{
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JLabel> jLabelList2;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JComboBox jComboBox3;
    private JComboBox jComboBox4;
    private JComboBox jComboBox5;
    public Ventana3(String title) {
        super(title);
        this.setSize(400, 400);
        this.setLocation(150, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);    
    }
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(9,1));
        this.iniciarPanel();
        this.iniciarEtiquetas();
        this.iniciarEtiquetas2();
        this.iniciarCombo();
        this.iniciarBotones();
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
        this.jPanelList.get(0).setBackground(Color.CYAN);
        this.jPanelList.get(1).setBackground(Color.WHITE);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBackground(Color.WHITE);
        this.jPanelList.get(7).setBackground(Color.WHITE);
        this.jPanelList.get(8).setBackground(Color.WHITE);
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6));
        this.jPanel1.add(this.jPanelList.get(7));
        this.jPanel1.add(this.jPanelList.get(8));
    }
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("INFORMACION CARRERA"));
        this.jLabelList.get(0).setBackground(Color.CYAN);
        this.jLabelList.add(new JLabel("Periodo Academico: ")); 
        this.jLabelList.add(new JLabel("Carrera: *"));
        this.jLabelList.add(new JLabel("Modalidad: *"));
        this.jLabelList.add(new JLabel("Sede: *"));
        this.jLabelList.add(new JLabel("Campus: *"));
        this.jLabelList.add(new JLabel("Jornada: *"));
        this.jLabelList.add(new JLabel("Fecha de Registro: "));
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jLabelList.get(0).setOpaque(true);
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jLabelList.get(7));
        
    }
     public void iniciarCombo(){
        this.jComboBox1= new JComboBox();
        this.jComboBox1.addItem("Telecomunicaciones");
        this.jComboBox1.addItem("Arquitectura");
        this.jComboBox1.addItem("Electronica");
        this.jComboBox1.addItem("Computacion");
        this.jComboBox1.addItem("Ing. Civil");
        this.jComboBox1.addItem("Automotriz");
        this.jComboBox1.addItem("Mecanica");
        this.jComboBox1.addItem("Ing. Industrial");
        this.jComboBox1.addItem("Biotecnologia");
        this.jComboBox1.addItem("Derecho");
        this.jComboBox1.addItem("Psicologia");
        this.jComboBox1.addItem("Educacion");
        this.jComboBox1.addItem("Turismo");
        this.jComboBox1.addItem("Mecatronica");
        this.jComboBox1.addItem("Comunicacion");
        this.jPanelList.get(2).add(this.jComboBox1);
        
        this.jComboBox2= new JComboBox();
        this.jComboBox2.addItem("Presencial");
        this.jComboBox2.addItem("En Línea");
        this.jComboBox2.addItem("Dual");
        this.jPanelList.get(3).add(this.jComboBox2);
        
        this.jComboBox3= new JComboBox();
        this.jComboBox3.addItem("Matriz Cuenca");
        this.jComboBox3.addItem("Quito");
        this.jComboBox3.addItem("Guayaquil");
        this.jPanelList.get(4).add(this.jComboBox3);
        
        this.jComboBox4= new JComboBox();
        this.jComboBox4.addItem("El Vecino");
        this.jComboBox4.addItem("Maria Auxiliadora");
        this.jComboBox4.addItem("Guayaquil");
        this.jComboBox4.addItem("El Giron");
        this.jComboBox4.addItem("El Giron");
        
        this.jPanelList.get(5).add(this.jComboBox4);
        
        this.jComboBox5= new JComboBox();
        this.jComboBox5.addItem("Seleccione una opción");
        this.jComboBox5.addItem("Diurna");
        this.jComboBox5.addItem("Matutina");
        this.jComboBox5.addItem("Vespertina");
        this.jPanelList.get(6).add(this.jComboBox5);
    }
     public void iniciarEtiquetas2(){
        this.jLabelList2 = new ArrayList<>();
        this.jLabelList2.add(new JLabel("2022-2022"));
        this.jLabelList2.add(new JLabel("29/04/2022"));
        this.jPanelList.get(1).add(this.jLabelList2.get(0));
        this.jPanelList.get(7).add(this.jLabelList2.get(1));
    }
  
    public void iniciarBotones(){
        this.jButtonList= new ArrayList<>();
        this.jButtonList.add(new JButton());
        this.jButtonList.get(0).setText("SIGUIENTE");
        this.jPanelList.get(8).add(this.jButtonList.get(0));
    }
 
}

