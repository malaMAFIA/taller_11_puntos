/** 
 * ANDRES CORREA
 */
import javax.swing.JOptionPane;

public class punto_1 {
public static void main (String[]args){

String profesor;
String alumno;

profesor= JOptionPane.showInputDialog("pls insert your name teacher");
alumno= JOptionPane.showInputDialog("pls insert name the student");

String [] opciones ={"english","spanish","psicology","artes"};
int seleccion = JOptionPane.showOptionDialog(null, "Selecciona la materia", "Calculadora", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        String num1 = JOptionPane.showInputDialog("Ingresa la primera nota");
        int numero1 = Integer.parseInt(num1);       
        String num2 = JOptionPane.showInputDialog("Ingresa la segunda nota");
        int numero2 = Integer.parseInt(num2);
        String num3 = JOptionPane.showInputDialog("Ingresa la tercera nota");
        int numero3 = Integer.parseInt(num3);       
        String num4 = JOptionPane.showInputDialog("Ingresa la cuarta nota");
        int numero4 = Integer.parseInt(num4);
        
        int resultado = 0;               
        String operacion = "";

        switch (seleccion) {
            case 0:
                resultado = (numero1 + numero2 + numero3 + numero4) /4;
                operacion = "english";
                break;
            case 1:
                resultado = (numero1 + numero2 + numero3 + numero4) /4;
                operacion = "spansh";
                break;
            case 2:
                resultado = (numero1 + numero2 + numero3 + numero4) /4;
                operacion = "psicology";
                break;
            case 3:
                    resultado = (numero1 + numero2 + numero3 + numero4) /4;
                    operacion = "artes";


                
        }
        JOptionPane.showMessageDialog(null, "Hola profesor "+profesor+"\n"+"el estudiante"+" "+alumno + "\n"+"en"+" "+operacion +" "+ "tiene un porcentaje de  "+ resultado);
}
}
    
