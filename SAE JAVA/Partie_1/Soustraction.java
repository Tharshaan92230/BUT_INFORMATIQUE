public class Soustraction extends Operation{

    public Soustraction (Nombre nb1, Nombre nb2){
    	super(nb1,nb2);
    }
    
    public String toString() {
        return "Soustraction : " + this.getOperande1().valeur() + " - " + this.getOperande2().valeur(); 
    } 
    
    public int valeur() {
    	return this.getOperande1().valeur() - this.getOperande2().valeur();
    }
    
}
