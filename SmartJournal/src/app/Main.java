package app;

import java.io.File;
import java.util.Scanner;

public class Main {

    private static final Scanner input = new Scanner(System.in);
    private static final User user = new User();

    public static void main(String[] args) {
        File dataFolder = new File("UserData/");
        if (!dataFolder.exists()) dataFolder.mkdir();
        clearScreen();
        boolean exit = true;
        while (exit) exit = loginPage();
    }

    private static boolean loginPage() {
        System.out.println("\n=== Welcome to Smart Journal ===");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("\n> ");

        switch (input.nextLine()) {
            case "1":
                if (user.register()) {
                    boolean exit = true;
                    // TODO: welcome page
                    // while (exit) exit = welcomePage();
                }
                break;
            case "2":
                if (user.login()) {
                    boolean exit = true;
                    // TODO: welcome page
                    // while (exit) exit = welcomePage();
                }
                break;
            case "3":
                System.out.println("Goodbye!");
                return false;
            default:
                clearScreen();
                System.out.println("Invaild input!");
                break;
        }
        return true;
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
