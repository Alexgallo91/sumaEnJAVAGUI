/***
 * 
 * Autor: Alexis Abraham Araujo Moreno
 * 
 * */


package calculadoragui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculadoraGUI extends JFrame{
    
    private JTextField numero1, numero2;
    private JButton suma, resta, multiplicacion, division;
    private JLabel resultado, etNum1, etNum2;
    private double campo1, campo2, campoRes;
    private JOptionPane mensaje = new JOptionPane();
    private Color colorBackground;
    private ImageIcon icono;
    
    public CalculadoraGUI()
    {
        super("Calculadora");
        setLayout(new FlowLayout());
        
        //campos de texto
        numero1 = new JTextField(16);
        numero2 = new JTextField(16);
        
        //etiquetas
        etNum1 = new JLabel("Ingrese el primer numero");
        etNum2 = new JLabel("Ingresa el segundo numero");
        resultado = new JLabel("Resultado");
        resultado.setFont(new Font("serif", Font.BOLD, 26));
        
        suma = new JButton("+");
        resta = new JButton("-");
        multiplicacion = new JButton("*");
        division = new JButton("/");
        
        suma.setFont(new Font("arial", Font.BOLD, 20));
        resta.setFont(new Font("arial", Font.BOLD, 20));
        division.setFont(new Font("arial", Font.BOLD, 20));
        multiplicacion.setFont(new Font("arial", Font.BOLD, 20));
        
        colorBackground = new Color(69, 72, 61);
        this.getContentPane().setBackground(colorBackground);
        
        resultado.setForeground(Color.white);
        etNum1.setForeground(Color.white);
        etNum2.setForeground(Color.white);
        
        //establece el icono de la ventana
        icono = new ImageIcon(getClass().getResource("icono.png"));
        CalculadoraGUI.this.setIconImage(icono.getImage());
        
        add(etNum1);
        add(numero1);
        
        add(etNum2);
        add(numero2);
        
        add(suma);
        add(resta);
        add(multiplicacion);
        add(division);
        
        add(resultado);
        
        //evento para boton suma
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                   campo1 = Double.parseDouble(numero1.getText());  
                   campo2 = Double.parseDouble(numero2.getText());  
                   
                   resultado.setText(String.format("%.2f", (campo1+campo2))); 
                }
                catch(NumberFormatException ex)
                {
                   mensaje.showMessageDialog(CalculadoraGUI.this, "Ingresa solo numeros");
                }
                
            }
        });
        
        //evento para boton resta
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                   campo1 = Double.parseDouble(numero1.getText());  
                   campo2 = Double.parseDouble(numero2.getText());  
                   
                   resultado.setText(String.format("%.2f", (campo1-campo2))); 
                }
                catch(NumberFormatException ex)
                {
                   mensaje.showMessageDialog(CalculadoraGUI.this, "Ingresa solo numeros");
                }
                
            }
        });
        
        //evento para boton multiplicacion
        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                   campo1 = Double.parseDouble(numero1.getText());  
                   campo2 = Double.parseDouble(numero2.getText());  
                   
                   resultado.setText(String.format("%.2f", (campo1*campo2))); 
                }
                catch(NumberFormatException ex)
                {
                   mensaje.showMessageDialog(CalculadoraGUI.this, "Ingresa solo numeros");
                }
                
            }
        });
        
        //evento pata boton division
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                   campo1 = Double.parseDouble(numero1.getText());  
                   campo2 = Double.parseDouble(numero2.getText());
                   
                   if(campo2 == 0)
                   {
                       mensaje.showMessageDialog(CalculadoraGUI.this, "No se debe divir entre 0");
                       return;
                   }
                   
                   resultado.setText(String.format("%.2f", (campo1/campo2))); 
                }
                catch(NumberFormatException ex)
                {
                   mensaje.showMessageDialog(CalculadoraGUI.this, "Ingresa solo numeros");
                }
                
            }
        });
        
    }
}
