
import java.util.Scanner;
/**
 *
 * @author CEDENORTE
 */

public class punto_2 {
    public static void main (String[]args){
        
        Scanner dinero = new Scanner(System.in);
    

        
        System.out.println("ingresa el dinero que tiene pablo");
         int pablo = dinero.nextInt();
         
         int jose= pablo * 2;
         int miguel = (pablo + jose) /2;
         
         System.out.println("el dinero de jose es:  "+jose);
         System.out.println("el dinero de miguel es:  "+miguel);
         System.out.println("el dinero de pablo es:  "+pablo);
         
        
        
    }
}
