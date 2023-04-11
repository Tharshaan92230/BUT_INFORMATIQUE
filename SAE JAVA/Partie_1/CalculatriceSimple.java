public class CalculatriceSimple {
    public static void main (String[] args) {
    try{
        Nombre six = new Nombre(5);
        Nombre dix = new Nombre(10);
        Operation s = new Soustraction(dix,six);
        Operation sa = new Addition(dix,six);
        Operation si = new Multiplication(dix,six);
        Operation so = new Division(dix,six);
        System.out.println(s + " = " + s.valeur());
        System.out.println(sa + " = " + sa.valeur());  
        System.out.println(si + " = " + si.valeur()); 
        System.out.println(so + " = " + so.valeur()); 
        
    }
    catch(Exception e){}
  }
}
