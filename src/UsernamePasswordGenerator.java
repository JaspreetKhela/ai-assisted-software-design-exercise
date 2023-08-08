import java.util.Random;
import java.util.Scanner;

/**
 * This class demonstrates a simple username and password generator.
 */
public class UsernamePasswordGenerator {

    // Character sets for generating password
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_-+=<>?";

    /**
     * Main method to showcase the username and password generation.
     */
    public static void main(String[] strings) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter desired username length: ");
        int usernameLength = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter desired password length: ");
        int passwordLength = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        scanner.close();

        String generatedUsername = generateUsername(usernameLength);
        String generatedPassword = generatePassword(passwordLength);

        System.out.println("Generated Username: " + generatedUsername);
        System.out.println("Generated Password: " + generatedPassword);
    }

    /**
     * Generates a random username of specified length consisting of lowercase letters.
     *
     * @param length The desired length of the username
     * @return The generated username
     */
    public static String generateUsername(int length) {
        Random random = new Random();
        StringBuilder username = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char randomChar = LOWERCASE.charAt(random.nextInt(LOWERCASE.length()));
            username.append(randomChar);
        }

        return username.toString();
    }

    /**
     * Generates a random password with the specified length.
     *
     * @param length The desired length of the password
     * @return The generated password
     */
    public static String generatePassword(int length) {
        Random random = new Random();
        String characters = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            password.append(randomChar);
        }

        return password.toString();
    }
}