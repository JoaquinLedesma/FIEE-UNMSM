
/* EJERCICIO 05 : Un palindromo es una palabra o frase que tiene la propiedad de poder
 ser leida tanto de derecha a izquierda como de izquierda a derecha. Sabiendo esto, 
 escriba un algoritmo que informe al ususario si una determinada palabra o frase
  es o no un palindromo  */

import java.util.Scanner;
public class ejercicio05 { 

	public static void main(String[] args) {
String palabra,invertida="";
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingrese palabra o frase ");
		palabra = teclado.nextLine();
		palabra=palabra.replaceAll(" ", "");
		palabra=palabra.toLowerCase();
		
		
		for(int i=palabra.length()-1;i>=0;i--) {
			invertida= invertida + palabra.charAt(i);
			
		}
		if(invertida.contentEquals(palabra)==true) {
			System.out.println("Es palindromo");
			
		}else {
			System.out.println("No es palindromo");
			
		}
		
		
		
			
		

	}

}
