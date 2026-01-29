import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        double numero1 = 0;
        double numero2 = 0;
        
        System.out.println("Ingrese la operacion a realizar (suma, resta, multiplicacion, division):");
        try (Scanner entrada = new Scanner(System.in)) {
            String cadena=entrada.nextLine();
             System.out.println(cadena);

            switch (cadena) {
                case "suma" -> {
                    System.out.println("Ingrese el primer numero:");
                    numero1=entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    numero2=entrada.nextDouble();
                    System.out.println("El resultado de la suma es: " + suma(numero1, numero2));
                }
                case "resta" -> {
                    System.out.println("Ingrese el primer numero:");
                    numero1=entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    numero2=entrada.nextDouble();
                    System.out.println("El resultado de la resta es: " + resta(numero1, numero2));
                }
                case "multiplicacion" -> {
                    System.out.println("Ingrese el primer numero:");
                    numero1=entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    numero2=entrada.nextDouble();
                    System.out.println("El resultado de la multiplicacion es: " + multiplicacion(numero1, numero2));
                }
                case "division" -> {
                    System.out.println("Ingrese el primer numero:");
                    numero1=entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    numero2=entrada.nextDouble();
                    System.out.println("El resultado de la division es: " + division(numero1, numero2));
                }
                default -> System.out.println("Operacion no reconocida");
            }
        }
    }

        public static double suma (double numero1, double numero2) {
            return numero1 + numero2;
        }

        public static double resta (double numero1, double numero2) {
            return numero1 - numero2;
        }

        public static double multiplicacion (double numero1, double numero2) {
            return numero1 * numero2;
        }

        public static double division (double numero1, double numero2) {
            if (numero2 != 0) {
                return numero1 / numero2;
            } else {
                System.out.println("No se puede dividir entre 0");
                return 0;
            }
        }
    }      






    
