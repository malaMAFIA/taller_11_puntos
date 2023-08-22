import javax.swing.JOptionPane;
/**
 *
 * @author ANDRES CORREA
 */
public class punto_10 {
    public static void main (String[]args){
String name;
    //calculo del sueldo restante despues de pagar gastos 
    name = JOptionPane.showInputDialog("ingrese su nombre");
        String num1 = JOptionPane.showInputDialog("Ingresa el valor del sueldo");
        int numero1 = Integer.parseInt(num1);       
        String num2 = JOptionPane.showInputDialog("Ingresa el valor del primer gasto");
        int numero2 = Integer.parseInt(num2);
        String num3 = JOptionPane.showInputDialog("Ingresa el valor del segundo gasto");
        int numero3 = Integer.parseInt(num3);
        String num4 = JOptionPane.showInputDialog("Ingresa el valor del tercer gasto");
        int numero4 = Integer.parseInt(num4);   
        double sueldoFinal = numero1 - numero2 - numero3 - numero4; 

        JOptionPane.showMessageDialog(null, "Hola "+name+"\n"+"tu sueldo final es:"+" " + sueldoFinal);
        JOptionPane.showMessageDialog(null, "espero haber sido de ayuda :) "+"\n"+"regresa pronto");


    }
}
