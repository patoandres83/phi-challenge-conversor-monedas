import com.conversormonedas.consumirapi.ConsumirApi;
import java.io.IOException;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {

        boolean salidaDeLaApp;
        salidaDeLaApp = false;
        Scanner scanner = new Scanner(System.in);
        ConsumirApi consumirApi = new ConsumirApi();
        double montoAConvertir;

        while(!salidaDeLaApp) {
            System.out.println("**************************************************");
            System.out.println("************* CONVERSOR DE MONEDAS ***************");
            System.out.println("**************************************************");
            System.out.println("*________________________________________________*");
            System.out.println("* Menú: ******************************************");
            System.out.println("* 1. Convertir de dólar USD a peso chileno CLP   *");
            System.out.println("* 2. Convertir de peso chileno CLP a dólar USD   *");
            System.out.println("* 3. Convertir de dólar USD a real brasileño BRL *");
            System.out.println("* 4. Convertir de real brasileño BRL a dólar USD *");
            System.out.println("* 5. Convertir de dólar USD a peso argentino ARS *");
            System.out.println("* 6. Convertir de peso argentino ARS a dólar USD *");
            System.out.println("* 7. Salir                                       *");

            System.out.println("Ingrese su opción: ");
            int opcionIngresada = scanner.nextInt();

            switch(opcionIngresada){
                case 1:
                    System.out.print("Ingresa el monto a convertir: ");
                    montoAConvertir = scanner.nextDouble();
                    try {
                        consumirApi.convertirMonedas("USD","CLP",montoAConvertir);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 2:
                    System.out.print("Ingresa el monto a convertir: ");
                    montoAConvertir = scanner.nextDouble();
                    try {
                        consumirApi.convertirMonedas("CLP","USD",montoAConvertir);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 3:
                    System.out.print("Ingresa el monto a convertir: ");
                    montoAConvertir = scanner.nextDouble();
                    try {
                        consumirApi.convertirMonedas("USD","BRL",montoAConvertir);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 4:
                    System.out.print("Ingresa el monto a convertir: ");
                    montoAConvertir = scanner.nextDouble();
                    try {
                        consumirApi.convertirMonedas("BRL","USD",montoAConvertir);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 5:
                    System.out.print("Ingresa el monto a convertir: ");
                    montoAConvertir = scanner.nextDouble();
                    try {
                        consumirApi.convertirMonedas("USD","ARS",montoAConvertir);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 6:
                    System.out.print("Ingresa el monto a convertir: ");
                    montoAConvertir = scanner.nextDouble();
                    try {
                        consumirApi.convertirMonedas("ARS","USD",montoAConvertir);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 7:
                    salidaDeLaApp = true;
                    System.out.println("Ha seleccionado salir de la app...adios!");
                    scanner.close();
                    break;
            }
        }
        scanner.close();
    }
}
