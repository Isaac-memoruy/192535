import java.util.Scanner;

public class MuyMal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número límite: ");
        int NumeroLimitante = scanner.nextInt();
        int numerodevarible1 = 1;
        int numerodevariablecero = 0;
        int numeroigualcero1 = 0;
        int numeroigualcero2 = 0;
        while (numerodevarible1 <= NumeroLimitante) {
            if (numerodevarible1 % 3 == 0) {
                numerodevariablecero = numerodevariablecero + numerodevarible1;
                System.out.println(numerodevarible1 + " es un múltiplo de 3");
            }
            if (numerodevarible1 % 5 == 0) {
                numeroigualcero1 = numeroigualcero1 + numerodevarible1;
                System.out.println(numerodevarible1 + " es un múltiplo de 5");
            }
            if (numerodevarible1 % 3 != 0 && numerodevarible1 % 5 != 0) {
                numeroigualcero2 = numeroigualcero2 + numerodevarible1;
                System.out.println(numerodevarible1 + " no es un múltiplo de 3 ni 5");
            }
            numerodevarible1 = numerodevarible1 + 1;
        }
        System.out.println("La sumatoria de multiplos de 3 es: " + numerodevariablecero);
        System.out.println("la sumatoria de multiplos de 5 es: " + numeroigualcero1);
        System.out.println("se suman los numeros restantes y da: " + numeroigualcero2);
        
        scanner.close();
    }
}
