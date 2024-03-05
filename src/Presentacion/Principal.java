package Presentacion;

import java.util.Scanner;

import Logica.Calculadora;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. División");
            System.out.println("2. Factorial");
            System.out.println("3. Combinatoria");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 4) {
                System.out.println("Saliendo de la calculadora.");
                break;
            }

            try {
                switch (opcion) {
                    case 1:
                        realizarDivision(scanner);
                        break;
                    case 2:
                        calcularFactorial(scanner);
                        break;
                    case 3:
                        calcularCombinatoria(scanner);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    public static void realizarDivision(Scanner scanner) throws Exception {
        System.out.println("Ingrese el dividendo:");
        double dividendo = scanner.nextDouble();
        System.out.println("Ingrese el divisor:");
        double divisor = scanner.nextDouble();

        double resultado = Calculadora.Division(dividendo, divisor);
        System.out.println("El resultado de la división es: " + resultado);
    }

    public static void calcularFactorial(Scanner scanner) throws Exception {
        System.out.println("Ingrese un número para calcular su factorial:");
        int numero = scanner.nextInt();
        long factorial = Calculadora.Factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    public static void calcularCombinatoria(Scanner scanner) throws Exception {
        System.out.println("Ingrese el valor de 'n':");
        int n = scanner.nextInt();
        System.out.println("Ingrese el valor de 'r':");
        int r = scanner.nextInt();
        long combinacion = Calculadora.calcularCombinacion(n, r);
        System.out.println("El resultado de la combinatoria (" + n + "C" + r + ") es: " + combinacion);
        
        long permutacion = Calculadora.Permutacion(n);
        System.out.println("El resultado de la permutacion es: " + permutacion);
        
        long variacion = Calculadora.calcularVariacion(n, r);
        System.out.println("El resultado de la variacion (" + n + "C" + r + ") es: " + variacion);
	}

}
