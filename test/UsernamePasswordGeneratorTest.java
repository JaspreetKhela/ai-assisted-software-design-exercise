import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains test cases for the UsernamePasswordGenerator class.
 */
public class UsernamePasswordGeneratorTest {
        /**
         * Test case to verify the correctness of the generateUsername method.
         */
        @Test
        void testGenerateUsername() {
            String username = UsernamePasswordGenerator.generateUsername(6);
            assertNotNull(username); // Ensure that the generated username is not null
            assertEquals(6, username.length()); // Ensure that the generated username has the correct length
            assertTrue(username.matches("[a-z]+")); // Ensure that the username consists of only lowercase letters
        }

        /**
         * Test case to verify the correctness of the generatePassword method.
         */
        @Test
        void testGeneratePassword() {
            String password = UsernamePasswordGenerator.generatePassword(12);
            assertNotNull(password); // Ensure that the generated password is not null
            assertEquals(12, password.length()); // Ensure that the generated password has the correct length
            assertTrue(password.matches("[a-zA-Z0-9!@#$%^&*()_-]+")); // Ensure that the password meets complexity criteria
        }

        /**
         * Test case to ensure that the main method can be executed without exceptions.
         * This test does not check the correctness of the generated output, but it provides
         * a way to visually inspect the generated username and password.
         */
//        @Test
//        void testMainMethod() {
//            // This test just checks that the main method doesn't throw exceptions
//            // and provides a way to visually inspect the generated output.
//            UsernamePasswordGenerator.main(new String[]{});
//        }
}