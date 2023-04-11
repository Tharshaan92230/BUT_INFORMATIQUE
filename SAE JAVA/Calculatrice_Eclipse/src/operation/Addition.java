package operation;
import expression.Expression;
import operation.exception.ManqueOperandeException;

/**
 * Addition faisant intervenir deux opérandes de type Expression<br/>
 * @see Expression
 * @see Operation 
 * @author B. LEMAIRE
 * @version 1.0
 */
public class Addition extends Operation
{

	/**
	 * Constructeur d'initialisation champ à champ de l'opération d'addition<br/>
	 * Initialise les deux opérandes de l'addition
	 * @param operande1  (Expression) première opérande
	 * @param operande2  (Expression) deuxième opérande
	 * @throws  ManqueOperandeException  Erreur sur les opérandes
	 */	
	public Addition(Expression operande1, Expression operande2) throws ManqueOperandeException {
		super( operande1, operande2 );
	}

	/**
	 * Evalue l'addition en fonction des deux opérandes
	 * @return (int) entier représentant la somme des deux opérandes 
	 */
	@Override
	public int valeur()
	{
		return this.getOperande1().valeur() + this.getOperande2().valeur() ;
	}
	

	/**
	 * Représentation de l'addition courante sous forme d'une chaîne de caractères<br/>
	 * sous la forme : ( operande1 + operande 2 )
	 * 
	 * @return (String) chaine contenant la représentation de l'opération d'addition
	 */
	public String toString()
	{
		return  "(" + this.getOperande1() + " + " + this.getOperande2() + ")" ; 
	}

}
