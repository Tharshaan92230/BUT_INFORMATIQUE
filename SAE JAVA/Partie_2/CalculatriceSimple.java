public class CalculatriceSimple {
    public static void main (String[] args) {
    try{
	/*
        Nombre six = new Nombre(6);
        Nombre dix = new Nombre(10);
        Nombre zero = new Nombre(0);
        Operation s = new Soustraction(dix,six);
        Operation a = new Addition(dix,six);
        Operation m = new Multiplication(dix,six);
        Operation d1 = new Division(dix,six);
        Operation d2 = new Division(dix,zero);
        System.out.println(s + " = " + s.valeur());
        System.out.println(a + " = " + a.valeur());  
        System.out.println(m + " = " + m.valeur()); 
        System.out.println(d1 + " = " + d1.valeur()); 
        System.out.println(d2 + " = " + d2.valeur()); */
    
    	Expression deux = new Nombre(2);
    	Expression trois = new Nombre(3);
    	Expression dixSept = new Nombre(17);
    	Expression s = new Soustraction(dixSept, deux) ;
	Expression a = new Addition(deux, trois) ;
	Expression d = new Division(s, a) ;
	System.out.println(d + " = " + d.valeur()); 

    }
    catch (ArithmeticException e) {
	System.out.println("Il y a eu une erreur, on ne peut pas diviser par 0");
    }
  }
}
