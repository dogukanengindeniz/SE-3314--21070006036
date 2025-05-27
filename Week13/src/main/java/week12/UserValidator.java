package week12;

public class UserValidator {

    public boolean validateUser(String name, int age, String email) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid input: Name is missing or empty.");
            return false;
        }

        if (name.length() < 2) {
            System.out.println("Invalid input: Name is too short.");
            return false;
        }

        if (age < 0 || age > 120) {
            System.out.println("Invalid input: Age must be between 0 and 120.");
            return false;
        }

        if (email == null || !email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid input: Email format is incorrect.");
            return false;
        }

        return true;
    }
}
