abstract public class Operation extends Expression{
    
    private Expression operande1;
    private Expression operande2;

    public Operation() {
    }
    
    public Operation(Expression op1,Expression op2) {
    	this.operande1 = op1;
    	this.operande2 = op2;
        
    }
    public Operation(Operation o) {
    	this.operande1 = o.getOperande1();
    	this.operande2 = o.getOperande2();
        
    }
    
    public Expression getOperande1(){
        return this.operande1;
    } 
    
    public Expression getOperande2(){
        return this.operande2;
    }
    
    public abstract int valeur();
}
