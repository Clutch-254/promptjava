import java.util.Scanner;

class prompt{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s. How are you?", name);
        int age = scanner.nextInt();

        System.out.printf("I started coding when I was %d.", age);

        scanner.close();
    }
}