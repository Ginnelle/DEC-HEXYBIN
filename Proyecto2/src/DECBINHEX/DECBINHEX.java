package DECBINHEX;

import java.util.ArrayList;
import java.util.Scanner;

public class DECBINHEX {
	

	public static String obtenerBinario(int numero){
		   ArrayList<String> binario = new ArrayList<String>();
		   int resto;
		   String binarioString = "";

		   do{
		      resto = numero%2;
		      numero = numero/2;
		      binario.add(0, Integer.toString(resto));
		   }while(numero > 2); //Haremos el bucle hasta que el cociente no se pueda dividir mas

		   binario.add(0, Integer.toString(numero)); //Cogeremos el ultimo cociente

		   //Cogemos cada uno de los elementos del ArrayList y los juntamos en un String
		   for(int i = 0; i < binario.size(); i++){
		       binarioString += binario.get(i);
		   }
		   return binarioString;
		 }
	
	public static String decimalAHexadecimal(int decimal) {
	    String hexadecimal = "";
	    String caracteresHexadecimales = "0123456789abcdef";
	    while (decimal > 0) {
	        int residuo = decimal % 16;
	        hexadecimal = caracteresHexadecimales.charAt(residuo) + hexadecimal; // Agregar a la izquierda
	        decimal /= 16;
	    }
	    return hexadecimal;
	}
	
	public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        boolean continueConversion = true;

        while(continueConversion) {
        	try {
            System.out.println("Escribe el decimal ");
            int n = s.nextInt();
            System.out.println("En Binario es " + obtenerBinario(n));
            System.out.println("En Hexadecimal es " + decimalAHexadecimal(n));
            System.out.println("Deseas continuar? (y/n)");
            continueConversion = s.next().equalsIgnoreCase("y");
           } catch (Exception e) {
	        	System.out.println("Solo se acepta números enteros");
	        	s.next();
        }}
        s.close();
}}

