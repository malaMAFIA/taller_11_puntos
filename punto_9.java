import javax.swing.JOptionPane;
/**
 *
 * @author ANDRES CORREA
 */
public class punto_9 {
    public static void main (String[]args){
    
        double decimales = 0;
        double redondeado, redondeado1 = 2; 
        double nota1, nota2, nota3;
        String estudiante;
        
        estudiante= JOptionPane.showInputDialog("porfavor ingrese el nombre del alumno");
        String not1 = JOptionPane.showInputDialog("Ingresa la prierma nota");
        nota1 = Double.parseDouble(not1);       
        String not2 = JOptionPane.showInputDialog("Ingresa la segunda nota");
        nota2 = Double.parseDouble(not2);
        String not3 = JOptionPane.showInputDialog("Ingresa la tercera nota");
        nota3 = Double.parseDouble(not3);
        
       double media = (nota1 + nota2 + nota3)/3;
       double extra= media +1;
       
       redondeado = Math.round(media * Math.pow(10, decimales)) / Math.pow(10, decimales);
       redondeado1 = Math.round(extra * Math.pow(10, decimales)) / Math.pow(10, decimales);
       
       JOptionPane.showMessageDialog( null,"el estudiante "+estudiante+" "+"tiene un promedio de "+redondeado+"\n"+"tiene un punto adicional por un excelente trabajo hecho anterior mente"+"\n"+"por lo tanto su promedio queda asi"+" "+redondeado1);


        
    
    
    }
}
