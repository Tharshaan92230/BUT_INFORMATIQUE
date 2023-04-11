package expression;

import operation.Operation;

/**
 * Représente une expression mathématique :
 * <ul>
 * <li>Un nombre</li>
 * <li>Une opération</li>
 * </ul>
 * @see Operation
 * @see Nombre
 * 
 * @author B.L.
 * @version 1.0
 */
public abstract class Expression {
	
	
	/**
	 * Evalue la valeur de l'expression
	 * @return  (int) valeur de l'expression
	 */
	public abstract int valeur();

    /**
     * Accesseur à la première opérande<p>
     * Renvoie 
     * <ul>
     * <li>null si l'expression est un nombre</li>
     * <li>la valeur de la première opérande si l'expression est une opération</li>
     * </ul>
     * @return  (Expression) qui représente la première opérande de l'expression
     */
	public Expression getOperande1() {
		return null;
	}

	 /**
     * Accesseur à la deuxième opérande
     * <p>
     * Renvoie 
     * <ul>
     * <li>null si l'expression est un nombre</li>
     * <li>la valeur de la deuxième opérande si l'expression est une opération</li>
     * </ul>
     * @return  (Expression) qui représente la deuxième opérande de l'expression
     */
	public Expression getOperande2() {
		return null;
	}

}