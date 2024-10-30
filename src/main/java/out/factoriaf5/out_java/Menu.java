package out.factoriaf5.out_java;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("--- My Diary ---");
        System.out.println("1. Add a moment");
        System.out.println("2. View all available moments");
        System.out.println("3. Delete a moment");
        System.out.println("4. Filter moments");
        System.out.println("5. Exit");
    }

    public int getUserOption() {
        System.out.print("Select an option: ");
        return scanner.nextInt();
    }
}

}
