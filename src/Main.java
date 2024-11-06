import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String validUsername = "Coded";
        final String validPassword = "Coded123";

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (!username.equals(validUsername) && !password.equals(validPassword)) {
                throw new Exception("Invalid credentials");
            }

            System.out.println("Logged in successfully!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        scanner.close();
    }
}
