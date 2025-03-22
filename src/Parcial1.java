import java.util.Scanner;

public class Parcial1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1, name2, name3, name4, name5; 
        int speed1, speed2, speed3, speed4, speed5;

        System.out.println("Introduce los datos de los conductores:");

        System.out.print("Nombre del primer conductor: ");
        name1 = scanner.nextLine();
        System.out.print("Velocidad del primer conductor: ");
        speed1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Nombre del segundo conductor: ");
        name2 = scanner.nextLine();
        System.out.print("Velocidad del segundo conductor: ");
        speed2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Nombre del tercer conductor: ");
        name3 = scanner.nextLine();
        System.out.print("Velocidad del tercer conductor: ");
        speed3 = Integer.parseInt(scanner.nextLine());

        System.out.print("Nombre del cuarto conductor: ");
        name4 = scanner.nextLine();
        System.out.print("Velocidad del cuarto conductor: ");
        speed4 = Integer.parseInt(scanner.nextLine());

        System.out.print("Nombre del quinto conductor: ");
        name5 = scanner.nextLine();
        System.out.print("Velocidad del quinto conductor: ");
        speed5 = Integer.parseInt(scanner.nextLine());

        if (speed1 > 60) {
            System.out.println("Toma tu multa, " + name1 + ": " + (speed1 - 60) * 2.5 + "$");
        } else {
            System.out.println("Felicitaciones mi Pana " + name1 + ", no excediste el límite.");
        }

        if (speed2 > 60) {
            System.out.println("Toma tu multa " + name2 + ": " + (speed2 - 60) * 2.5 + "$");
        } else {
            System.out.println("Felicitaciones mi Pana " + name2 + ", no excediste el límite.");
        }

        if (speed3 > 60) {
            System.out.println("Toma tu multa, " + name3 + ": " + (speed3 - 60) * 2.5 + "$");
        } else {
            System.out.println("Felicitaciones mi Pana " + name3 + ", no excediste el límite.");
        }

        if (speed4 > 60) {
            System.out.println("Toma tu multa, " + name4 + ": " + (speed4 - 60) * 2.5 + "$");
        } else {
            System.out.println("Felicitaciones mi Pana " + name4 + ", no excediste el límite.");
        }

        if (speed5 > 60) {
            System.out.println("Toma tu multa, " + name5 + ": " + (speed5 - 60) * 2.5 + "$");
        } else {
            System.out.println("Felicitaciones mi Pana " + name5 + ", no excediste el límite.");
        }

        scanner.close();
    }
}
