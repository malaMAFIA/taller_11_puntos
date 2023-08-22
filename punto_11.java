import javax.swing.JOptionPane;

/**
 *
 * @author ANDRES CORREA
 */
public class punto_11 {
    public static void main (String[]args){
     int winner = 320;
    
        String num1 = JOptionPane.showInputDialog("escribe un numero que numero dividido entre 8"+"\n"+" y el cual le sumas 12 sale 52.");
        int numero1 = Integer.parseInt(num1);
    
        if (numero1== winner){
        JOptionPane.showMessageDialog(null, "felicidades has acertado "+"\n"+"regresa pronto");
        }
        else {
        JOptionPane.showMessageDialog(null, "has fallado"+"\n"+"regresa pronto");
        }
        
    }
}
