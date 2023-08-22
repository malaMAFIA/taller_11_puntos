import javax.swing.JOptionPane;
/**
 *
 * @author Intel
 */
public class punto_8 {
    public static void main(String[] args) {
    
        double base, altura;
        double area;
        
        String bas = JOptionPane.showInputDialog("Ingresa la base del triangulo");
        base = Double.parseDouble(bas);       
        String alt = JOptionPane.showInputDialog("Ingresa la altura del triangulo");
        altura = Double.parseDouble(alt);
        
        area = (base*altura)/2;
        
        JOptionPane.showMessageDialog(null, "el area del triangulo es:"+" "+area);
    
    }
}
