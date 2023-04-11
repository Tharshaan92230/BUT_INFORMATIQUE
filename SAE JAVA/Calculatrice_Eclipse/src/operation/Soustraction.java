package operation;
import expression.Expression;
import operation.exception.ManqueOperandeException;


/**
 * Soustraction faisant intervenir deux opérandes de type Expression<br/>
 * @see Expression
 * @see Operation 
 * @author B. LEMAIRE
 * @version 1.0
 */
public class Soustraction extends Operation
{
	/**
	 * Constructeur d'initialisation champ à champ de l'opération d'addition
	 * <p>
	 * Initialise les deux opérandes de la soustraction
	 * @param operande1  (Expression) première opérande
	 * @param operande2  (Expression) deuxième opérande
	 * @throws  ManqueOperandeException  Erreur sur les opérandes
	 */	
	public Soustraction(Expression operande1, Expression operande2) throws ManqueOperandeException {
		super( operande1, operande2 );
	}

	/**
	 * Evalue la soustraction en fonction des deux opérandes
	 * 
	 * @return (int) entier représentant la somme des deux opérandes 
	 */
	@Override
	public int valeur()
	{
		return this.getOperande1().valeur() - this.getOperande2().valeur() ;
	}
	

	/**
	 * Représentation de la soustraction courante sous forme d'une chaîne de caractères
	 * 
	 * <p>
	 * 
	 * sous la forme : ( operande1 - operande 2 )
	 * 
	 * @return (String) chaine contenant la représentation de l'opération de soustraction
	 */
	public String toString()
	{
		return  "(" + this.getOperande1() + " - " + this.getOperande2() + ")" ; 
	}

}
