public class Multiplication extends Operation{

    public Multiplication (Expression nb1, Expression nb2){
    	super(nb1,nb2);
    }	

    public String toString() {
        return "(" + this.getOperande1() + " * " + this.getOperande2() + ")"; 
    } 
    
    public int valeur(){
        int mul = this.getOperande1().valeur() + this.getOperande2().valeur();
        return mul;
    }
}
    
