package test_junit;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import expression.Nombre;
import operation.Addition;
import operation.Division;
import operation.Multiplication;
import operation.Soustraction;
import operation.exception.ManqueOperandeException;



public class TestCalculatrice {

	
	
	@Test(expected = ManqueOperandeException.class)
	public void testErreurOperande1Manquante() throws ManqueOperandeException  {
		Addition d = new Addition(null, new Nombre(2));
	}

	@Test(expected = ManqueOperandeException.class)
	public void testErreurOperande2Manquante() throws ManqueOperandeException  {
		Addition d = new Addition(new Nombre(2), null);
	}
	
	@Test(expected = ManqueOperandeException.class)
	public void testErreurOperande1Operande2Manquantes() throws ManqueOperandeException  {
		Addition d = new Addition(null, null);
	}
	
	@Test
	public void testAddition() {
		try {
			assertTrue(new Addition(new Nombre(4), new Nombre(11)).valeur()==15);
		}
		catch(ManqueOperandeException e) {
			Assert.fail();
		}
	}
	@Test
	public void testSoustraction() {
		try {
			assertTrue(new Soustraction(new Nombre(15), new Nombre(8)).valeur()==7);
		}
		catch(ManqueOperandeException e) {
			Assert.fail();
		}
	}
	
	@Test
	public void testMultiplication() {
		try {
			assertTrue(new Multiplication(new Nombre(5), new Nombre(6)).valeur()==30);
		}
		catch(ManqueOperandeException e) {
			Assert.fail();
		}
	}
	
	@Test
	public void testMultiplicationUneOperandeNulle() {
		try {
			assertTrue(new Multiplication(new Nombre(4), new Nombre(0)).valeur()==0);
		}
		catch(ManqueOperandeException e) {
			Assert.fail();
		}
	}
	
	@Test
	public void testDivision() {
		try {
			assertTrue(new Division(new Nombre(56), new Nombre(2)).valeur()==28);
		}
		catch(ManqueOperandeException e) {
			Assert.fail();
		}
	}
	

	@Test(expected = ArithmeticException.class)
	public void testDiviseurNul() throws ManqueOperandeException, ArithmeticException  {
		Division d = new Division(new Nombre(1), new Nombre(0));
		
		int valeur = d.valeur();
		
	}
}
