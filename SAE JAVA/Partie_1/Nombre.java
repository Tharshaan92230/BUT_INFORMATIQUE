public class Nombre {
    private int valeurNombre;
    
    public Nombre() {}
    
    public Nombre(int valeurNombre) {
        this.valeurNombre = valeurNombre;
    }
    
    public Nombre(Nombre n){
        this.valeurNombre = n.valeur();
    }
    
    public void setValeurNombre(int valeurNombre){
        this.valeurNombre = valeurNombre;
    }
    
    public String toString(){
        String s = "Valeur du nombre :"+this.valeurNombre+".";
        return s; 
    }
    
    public int valeur() {
        return this.valeurNombre;
    }
    
}
