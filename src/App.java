import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        pressEnter(scanner);
        showMenu(scanner);
        System.out.println("La app termino...");

        scanner.close();
    }

    private static void showMenu(Scanner keyBoard) {
        int opcion;
        do {
            System.out.println("======================================");
            System.out.println("Menu clase 05");
            System.out.println("-------------------------------------");
            System.out.println("1. Prueba del ciclo for");
            System.out.println("2. Prueba del ciclo do-while");
            System.out.println("3. Prueba del ciclo while");
            System.out.println("0. Salir de la aplicaición");

            System.out.print("Ingresa una opcion: ");

            opcion = keyBoard.nextInt();
            keyBoard.nextLine(); // limpiar el boffer o gastar datos de linea anterior

            switch (opcion) {
                case 1 -> forTest();
                case 2 -> doWhileTest();
                case 3 -> whileTest();
                case 0 -> System.out.println("Termino...");
                default -> System.err.println("Ingrese una opcion valida");
            }
            if (opcion != 0) {
                pressEnter(keyBoard);
            }
        } while (opcion != 0);
    }

    private static void pressEnter(Scanner enter) {
        System.out.println("Presione enter para continuar..");
        enter.nextLine();
    }

    private static void forTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i++);
        }
    }

    private static void doWhileTest() {
        var counter = 10;

        do {
            System.out.println(counter);
            counter--;
        } while (counter > 0);
        System.out.println("Boom!");
    }

    public static void whileTest() {
        var counter = 0;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
    }
}
