package mains;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Introduce un texto:");
	        String texto = sc.nextLine();

	        String[] palabras = texto.split("\\s+");

	        try {
	            BufferedWriter archivo = new BufferedWriter(new FileWriter("palabras.txt"));
	            for (String palabra : palabras) {
	                archivo.write(palabra);
	                archivo.newLine();
	            }
	            archivo.close();
	            System.out.println("Archivo generado correctamente.");
	        } catch (IOException e) {
	            System.out.println("Ha ocurrido un error al generar el archivo");
	            e.printStackTrace();
	        }

	        sc.close();
	    }

	}



