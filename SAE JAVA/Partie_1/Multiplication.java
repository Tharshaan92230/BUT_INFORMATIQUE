public class Multiplication extends Operation{

    public Multiplication (Nombre nb1, Nombre nb2){
    	super(nb1,nb2);
    }	

    public String toString() {
        return "Multiplication : " + this.getOperande1().valeur() + " * " + this.getOperande2().valeur(); 
    } 
    
    public int valeur(){
        return this.getOperande1().valeur() + this.getOperande2().valeur();
    }
}
    
