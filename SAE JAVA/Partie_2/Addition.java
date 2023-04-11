public class Addition extends Operation{

    public Addition (Expression op1, Expression op2){
    	super(op1,op2);
    }	
    
    public int valeur(){
    	int add = this.getOperande1().valeur() + this.getOperande2().valeur();
        return add;
    }
    
    public String toString() {
        return "(" + this.getOperande1() + " + " + this.getOperande2() + ")"; 
    } 
}
