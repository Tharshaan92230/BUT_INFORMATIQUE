public class Soustraction extends Operation{

    public Soustraction (Expression nb1, Expression nb2){
    	super(nb1,nb2);
    }
    
    public String toString() {
        return "(" + this.getOperande1() + " - " + this.getOperande2() + ")"; 
    } 
    
    public int valeur() {
    	int soustra = this.getOperande1().valeur() - this.getOperande2().valeur();
    	return soustra;
    }   
}
