/*
Parte 2: Ejercicios sobre Excepciones
1. División segura
○ Solicitar dos números y dividirlos. Manejar ArithmeticException si el divisor es cero.
2. Conversión de cadena a número
○ Leer texto del usuario e intentar convertirlo a int. Manejar NumberFormatException si no es válido.
3. Lectura de archivo
○ Leer un archivo de texto y mostrarlo. Manejar FileNotFoundException si el archivo no existe.
4. Excepción personalizada
○ Crear EdadInvalidaException. Lanzarla si la edad es menor a 0 o mayor a 120. Capturarla y mostrar mensaje.
5. Uso de try-with-resources
○ Leer un archivo con BufferedReader usando try-with-resources.
Manejar IOException correctamente.
 */
package modulo8_ej_dos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Modulo8_Ej_Dos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // 1. División segura
        try {
            System.out.print("Numero a dividir: ");
            int a = sc.nextInt();
            System.out.print("Divisor: ");
            int b = sc.nextInt();
            System.out.println("Resultado: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por 0");
        }

        // 2. Conversión de cadena a número
        sc.nextLine();
        try {
            System.out.print("Ingrese un número: ");
            int n = Integer.parseInt(sc.nextLine());
            System.out.println("Número: " + n);
        } catch (NumberFormatException e) {
            System.out.println("Error: El valor agregado no es un numero valido");
        }
        
        // 3. Lectura de archivo -- Se intenta leer la primera linea
        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
            String linea = reader.readLine();  
            System.out.println("Primer línea del archivo: " + linea);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

        // 4. Excepción personalizada
        try {
            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();
            if (edad < 0 || edad > 120) throw new EdadInvalidaException("Edad inválida: " + edad);
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }

        // 5. Lectura de archivo con try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo");
        }
    }
}