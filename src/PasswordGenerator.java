public class PasswordGenerator {
    // Method to generate a password of specified length
    public String generate(int password_length) {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < password_length; i++) {
            // Generates a random uppercase letter
            char p = (char) ('A' + Math.random() * 26);
            password.append(p);
        }
        return password.toString();
    }
}


