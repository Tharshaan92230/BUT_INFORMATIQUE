public class Division extends Operation {

    public Division (Expression nb1, Expression nb2){
    	super(nb1,nb2);
    }	

    public String toString() {
        return "(" + this.getOperande1() + " / " + this.getOperande2() + ")"; 
    } 
    
    public int valeur(){
    	int div = this.getOperande1().valeur() / this.getOperande2().valeur();
        return div;
    }
}

