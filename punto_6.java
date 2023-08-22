 import javax.swing.JOptionPane;

public class punto_6 {
    public static void main(String[] args) {
        String[] variable = {"redondear", "redondear con decimales elejidos"};
        int variable1 = JOptionPane.showOptionDialog( null, "selecciona la opcion", "opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, variable,variable[0]);

        int resultado = 0;
        String opcion = "";
        double numero = 0; 
        double redondeado1 = 0; 
        double numero2 = 0; 
        double decimales = 0; 
        double redondeado2 = 0; 

        switch (variable1) {
            case 0:
                String num1 = JOptionPane.showInputDialog("Ingrese el numero a redondear");
                numero = Double.parseDouble(num1);
                redondeado1 = Math.round(numero);
                opcion = "redondear";
                break;
            case 1:
                String num2 = JOptionPane.showInputDialog("Ingrese el numero a redondear");
                numero2 = Double.parseDouble(num2);

                String num3 = JOptionPane.showInputDialog("Ingresa el numero de decimales con los que desea redondear");
                decimales = Double.parseDouble(num3);
                redondeado2 = Math.round(numero2 * Math.pow(10, decimales)) / Math.pow(10, decimales);
                opcion = "redondear con decimales elejidos";
                break;
        }
    
        if (variable1 == 0) {
            JOptionPane.showMessageDialog( null,"Hola " + "\n" + "la opcion elejida es " + opcion + "\n" + " el numero a redondear es " + numero + "\n " + "el resultado es: " + redondeado1);
        } else {
            JOptionPane.showMessageDialog( null,"Hola " + "\n" + "la opcion elejida es " + opcion + "\n" + " el numero a redondear es " + numero2 + "\n " + "el numero de decimales por el que elijo redondear es: " + decimales + "\n" + "el resultado es: " + redondeado2);
        }
    }
}

