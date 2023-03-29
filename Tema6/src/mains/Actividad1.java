package mains;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad1 {

    public static void main(String[] args) {
        
        // Pedimos el número N
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int N = sc.nextInt();
        
        // Crear el nombre del archivo
        String nombreArchivo = "tabla de multiplicar " + N + ".txt";
        
        // Escribir la tabla de multiplicar en el archivo
        try {
            FileWriter archivo = new FileWriter(nombreArchivo);
            for (int i = 1; i <= 10; i++) {
                int resultado = N * i;
                archivo.write(N + " x " + i + " = " + resultado + "\n");
            }
            archivo.close();
            System.out.println("La tabla de multiplicar se ha escrito en el archivo " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al escribir en el archivo");
            e.printStackTrace();
        }
        
        sc.close();
    }

}
