public class Nombre extends Expression{
    private int valeurNombre;
    
    public Nombre() {}
    
    public Nombre(int valeurNombre) {
        this.valeurNombre = valeurNombre;
    }
    
    public Nombre(Nombre uneValeur){
        this.valeurNombre = uneValeur.valeur();
    }
    
    public void setValeurNombre(int valeurNombre){
        this.valeurNombre = valeurNombre;
    }
    
    public String toString(){
        String s = ""+this.valeurNombre+"";
        return s; 
    }
    
    public int valeur() {
        return this.valeurNombre;
    }
    
}
