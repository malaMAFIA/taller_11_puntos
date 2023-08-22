import javax.swing.JOptionPane;
/**
 *
 * @author ANDRES CORREA
 */
public class punto_4 {
    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("escribe un numero del que desee ver la raiz cuadrada");
        int numero1 = Integer.parseInt(num1);
     
        double raizCuadrada = Math.sqrt(numero1);
        
        JOptionPane.showMessageDialog(null,"La raíz cuadrada del numero " + numero1 +"\n" +" es: " + raizCuadrada+"\n"+"espero ta haya servido");
        
    }

}
