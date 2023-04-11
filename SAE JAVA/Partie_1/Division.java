public class Division extends Operation {

    public Division (Nombre nb1, Nombre nb2){
    	super(nb1,nb2);
    }	

    public String toString() {
        return "Division : " + this.getOperande1().valeur() + " / " + this.getOperande2().valeur(); 
    } 
    
    public int valeur(){
        return this.getOperande1().valeur() / this.getOperande2().valeur();
    }
}

