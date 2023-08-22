import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author ANDRES CORREA
 */
public class punto_7 {
    public static void main(String[] args) {
        Random num_aleatorio = new Random();
        
        int numeroAleatorio = num_aleatorio.nextInt(100);
        
        JOptionPane.showMessageDialog(null, "el numero es:"+"\n"+numeroAleatorio);
    }
}
    

