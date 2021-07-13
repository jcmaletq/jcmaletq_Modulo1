package jclaudiomaletq_Modulo1;
//import java.math;
public class Nivell2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
// Fase 1	
	System.out.println("Modulo 1 Nivell 2 Fase 1    -----");		
   /*
    * Declara una variable double. Assigna-li un valor amb 4 decimals
    * Declara variables de tipus: int, float i string
    * Fes un "cast" de la variable double a cada una de les variables que has creat anteriorment per inicialitzar-les i pinta-les per pantalla.
    */
	 // Variables
	 //   double x_doble=Math.PI;
	    double v_doble=3.1416;
	    int v_int=(int)v_doble;
	    float v_float=(float)v_doble;
	    String v_string=Double.toString(v_doble);
	    
	 // visualiza
	    System.out.println(v_doble + " double");
	    System.out.println(v_int + " int");
	    System.out.println(v_float + " float");
	    System.out.println(v_string + " string");

     }
}
