import javax.swing.JOptionPane;
/**
 *
 * @author Intel
 */
public class punto_5 {
    public static void main(String[] args) {
        
        double base, exponente;
        double resultado;
                
        JOptionPane.showMessageDialog(null, "Bienvenido a la calculadora de potencias");
        String num1 = JOptionPane.showInputDialog("Ingresa el numero base");
        base = Double.parseDouble(num1);       
        String num2 = JOptionPane.showInputDialog("Ingresa el numero al que desea exponer");
        exponente = Double.parseDouble(num2);
        
        resultado = Math.pow(base, exponente);
        
        JOptionPane.showMessageDialog(null, "el numero"+" "+base+" "+"elevado a la potencia"+" "+exponente+"\n"+"es igual a "+" "+resultado);
        
        
    }
    
}
