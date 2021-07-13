package jclaudiomaletq_Modulo1;

public class Nivell3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
// Fase 1	
	System.out.println("Modulo 1 Nivell 3 Fase 1    -----");		
   /*
    * Declara un array de numeros int e inicialitzala amb valors del 1 al 10
    * Rota l’array sense utilitzar un array auxiliar ni llibreries. Pots utilizar una variable auxiliar.
    */
	 // Variables
	    int[] numeros= {1,2,3,4,5,6,7,8,9,10};
	    int v_int=0;
	    int lon=numeros.length;
	    
	 // visualiza
	    for (int i=0; i<lon; i++)
	    { System.out.print(numeros[i] + " ");}
	    System.out.println("");
	 // rotar
	    for (int i=0; i<(lon/2); i++)
	    { v_int=numeros[i];
	      numeros[i]=numeros[lon-i-1];
	      numeros[lon-i-1]=v_int;    
	    }
	 // visualiza
	    for (int i=0; i<lon; i++)
	    { System.out.print(numeros[i] + " ");}
	    System.out.println("");	    
	    
     }
}
