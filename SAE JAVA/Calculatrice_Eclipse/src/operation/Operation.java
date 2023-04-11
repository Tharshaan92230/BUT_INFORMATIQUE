package operation;

import expression.Expression;
import operation.exception.ManqueOperandeException;

/**
 * Classe abstraite qui représente une opération arithmétique avec deux opérandes
 * de type Expression<br/>
 * @see Expression
 * @author B.LEMAIRE
 * @version : 1.0
 */

public abstract class Operation extends Expression {

	private Expression operande1;
	private Expression operande2;
	
	/**
	 * Constructeur d'initialisation champ à champ de l'opération
	 * <p>
	 * Initialise les deux opérandes de l'opération
	 * @param operande1  (Expression) première opérande
	 * @param operande2  (Expression) deuxième opérande
	 * @throws  ManqueOperandeException  Erreur sur les opérandes
	 */
	public Operation(Expression operande1, Expression operande2) throws ManqueOperandeException {
		
		if (operande1 == null || operande2 == null)
			throw new ManqueOperandeException( operande1, operande2);
			
		this.operande1 = operande1;
		this.operande2 = operande2;
	}

    /**
     * Accesseur à la première opérande
     * 
     * @return  (Expression) première opérande de l'expression
     */
	public Expression getOperande1() {
		return this.operande1;		
	}

    /**
     * Accesseur à la première opérande
     * 
     * @return  (Expression) deuxième opérande de l'expression
     */
	public Expression getOperande2() {
		return this.operande2;
	}

}