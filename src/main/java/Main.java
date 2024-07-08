import java.util.Scanner;

import static java.lang.System.exit;

public class Main {



    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        Operacion nuevaConversion;
        char opcion = ' ';
        double monto;

        System.out.println("¡Bienvenido!");
        while (opcion != '0'){

            System.out.println("""
                  Por favor elige una opción válida:
                  1. Dolar -> Peso Argentino
                  2. Peso Argentino -> Dolar
                  3. Dolar -> Real Brasileño
                  4. Real Brasileño -> Dolar
                  5. Peso Colombiano -> Dolar
                  6. Dolar -> Peso Colombiano
                  7. Salir
                  """);

            opcion = lee.next().charAt(0);

            System.out.println("Perfecto. A continuación ingresa el monto deseado:");
            switch (opcion){

                case '1':
                    monto = lee.nextDouble();
                    nuevaConversion = new Operacion("USD",
                            "ARS", monto);
                    System.out.println(nuevaConversion);
                    break;

                case '2':
                    monto = lee.nextDouble();
                    nuevaConversion = new Operacion("ARS",
                            "USD", monto);
                    System.out.println(nuevaConversion);
                    break;

                case '3':
                    monto = lee.nextDouble();
                    nuevaConversion = new Operacion("USD",
                            "BRL", monto);
                    System.out.println(nuevaConversion);
                    break;

                case '4':
                    monto = lee.nextDouble();
                    nuevaConversion = new Operacion("BRL",
                            "USD", monto);
                    System.out.println(nuevaConversion);
                    break;

                case '5':
                    monto = lee.nextDouble();
                    nuevaConversion = new Operacion("COP",
                            "USD", monto);
                    System.out.println(nuevaConversion);
                    break;

                case '6':
                    monto = lee.nextDouble();
                    nuevaConversion = new Operacion("USD",
                            "COP", monto);
                    System.out.println(nuevaConversion);
                    break;

                case '7':
                    System.out.println("O tal vez no... \n ¡Adiós!");
                    exit(0);
                    break;

                default:
                    System.out.println("...Oh, espera. Esa no es una opción válida \n");
            }
        }
    }
}
