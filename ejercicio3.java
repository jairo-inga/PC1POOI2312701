package semana06POOI;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese un número final para los kilómetros por hora mayor a 60KPH: ");
            int numeroFinal = scanner.nextInt();
            
            if (numeroFinal <= 60 || numeroFinal % 10 != 0) {
                System.out.println("Programa finalizado, usted debe ingresar un valor múltiplo de 10 mayor a 60KPH");
                System.exit(0);
            }
            
            System.out.println("KPH\t\tMPH");
            System.out.println("-------------------");
            
            for (int kph = 60; kph <= numeroFinal; kph += 10) {
                double mph = kph * 0.6214;
                System.out.printf("%d\t\t%.1f\n", kph, mph);
            }
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Ingrese un número válido.");
        } finally {
            scanner.close();
        }
	}
	
    }