package jclaudiomaletq_Modulo1;
public class Nivell1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
// Fase 1	
	System.out.println("Modulo 1 Nivell 1 Fase 1    -----");		
   /*
    * Crea tres variables string e inicialitzales amb les dades pertinents (nom, cognom1, cognom2).
    * Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes, any).
    * Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom).
    * Mostra per pantalla les variables int concatenant-les amb “/” entre cada una d’elles.
    */
	 // Variables nom, cognom1, cognom2
	    String nom="Lionel";
	    String cognom1="Messi";
	    String cognom2="Cuccittini";
	 // Variables dia, mes, any
	    int dia=24;
	    int mes=6;
	    int any=1987;
	 // visualiza
	    System.out.println(cognom1+" "+cognom2+", "+nom);
	    System.out.println(dia+"/"+mes+"/"+any);
	    System.out.println("");
// Fase 2
		System.out.println("Modulo 1 Nivell 1 Fase 2    -----");	    
	/*
	 * Creeu una constant amb el valor de l’any (1948).
	 * Creeu una variable que guardi cada quan hi ha un any de traspàs
	 * Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor resultant en una variable. 
	 * Mostreu per pantalla el resultat del càlcul.
	 * Feu servir un bucle for, mostrant tots aquests anys. 
	*/
    // Variables
	    final int inicio=1948;
	    int perio=4;
	    int conta=0;
	    final int nacim=1961;
     // visualiza
	    System.out.println("Any de traspàs des de "+inicio+" fins "+nacim);
	    for (int j=inicio; j<nacim; j = j + perio ){ 
	       System.out.print(j+" ");
	       conta++;
	    }
	    System.out.println("");
	    System.out.println("");
	    System.out.println("Nombre d'any de traspàs des de "+inicio+" fins "+nacim+": "+conta);
	    System.out.println("");
	 // Fase 3
	 		System.out.println("Modulo 1 Nivell 1 Fase 3    -----");	    
	/*
	 *  Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa si no ho és.
	 *  En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui, en cas de ser falsa mostrareu la frase pertinent. Creeu dues variables string per guardar les frases.		
	 */
	 // Variables
		    String text1="L'any ";
		    String text2="no és de traspàs.";
		    String text3="és de traspàs.";
		    int residuo=(nacim-inicio)%perio;
	// visualiza
		    System.out.print(text1+nacim+" ");
		    if (residuo==0) {
		    	System.out.print(text3+"");}
		    else {System.out.print(text2+"");}
		    System.out.println("");
		    System.out.println("");
    // Fase 4
	 		System.out.println("Modulo 1  Nivell 1 Fase 4    -----");	    
	/*
	 *  Creeu una variable on juntareu el nom i els cognoms (tot en una variable) i un altre on juntareu la data de 
	 *  naixement separada per “/” (tot en una variable). Mostreu per consola les variables del nom complet, la data de 
	 *  naixement i si l’any de naixement es de traspàs o no		
	 */	
	// Variables
		    String frase1="El meu nom és ";
		    String frase2="Vaig nèixer el ";
		    String frase3="L' any "+ any+" ";
		    residuo=(any-inicio)%perio;
		    if (residuo==0) {
		    	frase3=frase3+text3;}
		    else {frase3=frase3+text2;}
	// visualiza
		    frase1=frase1+nom+" "+cognom1+" "+cognom2;
		    frase2=frase2+dia+"/"+mes+"/"+any;
		    System.out.println(frase1);
		    System.out.println(frase2);
		    System.out.println(frase3);
     }
}
