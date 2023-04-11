package operation;
import expression.Expression;
import operation.exception.ManqueOperandeException;

/**
 * Division faisant intervenir deux opérandes de type Expression<br/>
 * @see Expression
 * @see Operation 
 * @author B. LEMAIRE
 * @version 1.0
 */
public class Division extends Operation
{
	
	/**
	 * Constructeur d'initialisation champ à champ de l'opération de division<br>
	 * 
	 * Initialise les deux opérandes de la division
	 * @param operande1  (Expression) première opérande
	 * @param operande2  (Expression) deuxième opérande
	 * @throws  ManqueOperandeException  Erreur sur les opérandes
	 */	
	public Division(Expression operande1, Expression operande2) throws ManqueOperandeException
	{
		super(operande1, operande2);

	}

	/**
	 * Evalue la division en fonction des deux opérandes<br/>
	 * @return (int) entier représentant la somme des deux opérandes 
	 * @throws  ArithmeticException  Diviseur nul
	 */
	@Override
	public int valeur() throws ArithmeticException
	{
		/**
		 * Le diviseur ne doit pas être nul
		 */
		if (this.getOperande2().valeur()==0)
			throw new ArithmeticException("Diviseur nul !");
		
		return this.getOperande1().valeur() / this.getOperande2().valeur() ;
	}
	

	/**
	 * Représentation de la division courante sous forme d'une chaîne de caractères<br/>
	 * 
	 * sous la forme : ( operande1 / operande 2 )
	 * 
	 * @return (String) chaine contenant la représentation de l'opération de division
	 */
	public String toString()
	{
		return  "(" + this.getOperande1() + " / " + this.getOperande2() + ")" ; 
	}

}
