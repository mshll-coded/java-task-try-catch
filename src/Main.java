import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String validUsername = "Coded";
        final String validPassword = "Coded123";

        Scanner scanner = new Scanner(System.in);

        boolean loggedIn = false;
        for (int attempts = 0; attempts < 5; attempts++) {
            try {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();

                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                if (username.equals(validUsername) && password.equals(validPassword)) {
                    loggedIn = true;
                    break;
                } else {
                    throw new Exception("Invalid credentials");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (loggedIn) System.out.println("Logged in successfully!");
        scanner.close();
    }
}
