
package calculadoragui;

import java.awt.Color;
import javax.swing.JFrame;

public class Main {

    public static void main(String []args)
    {
        CalculadoraGUI calc = new CalculadoraGUI();
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setSize(250,250);
        calc.setVisible(true);
        calc.setLocationRelativeTo(null);
        
    }

}
