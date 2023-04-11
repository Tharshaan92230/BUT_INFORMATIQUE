package expression;

import operation.Operation;

/**
 * Encapsule un nombre constant entier<br>
 * 
 * @see Expression
 * @author B.L.
 * @version : 1.0
 */


public class Nombre extends Expression
{
	

	private int valeurNombre ; // Entier encapsulé


	/**
	 * Constructeur
	 * @param uneValeur (int) : entier permettant d'initialiser un correction_partie_1.Nombre
	 */
	
	/**
	 * Constructeur
	 * @param uneValeur  valeur entière qui sera encapsulé par Nombre
	 */
	public Nombre(int uneValeur)
	{
		super() ;
		this.valeurNombre = uneValeur ;
	}

	/**
	 * Evalue la valeur du Nombre
	 * @return  (int) valeur encapsulé par Nombre
	 */
	public int valeur()
	{
		return this.valeurNombre ;
	}

	/**
	 * Représentation du Nombre courant sous forme d'une chaîne de caractères
	 * @return (String) chaine de caractères représentant le nombre 
	 */
	public String toString()
	{
				// possible : 
				// return "" + this.valeurNombre ;
		return Integer.toString(this.valeurNombre) ;
	}
	
}
// fin classe partie_1.correction_partie_1.Nombre
