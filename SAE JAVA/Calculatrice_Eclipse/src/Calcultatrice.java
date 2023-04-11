import expression.Expression;
import expression.Nombre;
import operation.Addition;
import operation.Division;
import operation.Operation;
import operation.Soustraction;
import operation.exception.ManqueOperandeException;


/**
 * Test de la calculatrice<br/>
 * 
 * @author B. LEMAIRE
 * @version 1.0
 */
public class Calcultatrice {
	
	/**
	 * main
	 * @param args  arguments de la ligne de commande
	 */
    public static void main( String [] args ){
        Expression test = new Nombre(2) ;
        Expression deux = new Nombre(2) ;
        Expression trois = new Nombre(3) ;
        Expression dixSept = new Nombre(17) ;
        
        try {
        	Expression s = new Soustraction(dixSept, deux) ;
        	Expression a = new Addition(deux, trois) ;
        	Expression d = new Division(s, a) ;
        	
        	System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3
        }
        catch (ManqueOperandeException e) {
        	System.out.println(e.getMessage());
        }
        
        catch (ArithmeticException e) {
        	System.out.println(e);
        }
    }
}
