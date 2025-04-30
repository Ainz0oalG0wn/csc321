import java.util.Scanner;

public class MenuSaying {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[1]USA");
        System.out.println("[2]Guatemala");
        System.out.println("[3]Morocco");
        System.out.println("[4]Mauritius");
        System.out.println("Choose an option:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Bald eagle");
                break;
            case 2:
                System.out.println("Quetzal");
                break;
            case 3:
                System.out.println("Lion");
                break;
            case 4:
                System.out.println("Dodo");
                break;

        scanner.close();
    }
}
