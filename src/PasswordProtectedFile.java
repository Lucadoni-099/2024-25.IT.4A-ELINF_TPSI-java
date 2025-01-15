
public class PasswordProtectedFile {
    String password;

    public PasswordProtectedFile(int password_length) {
        this.password = generatePassword(password_length);
    }

    private String generatePassword(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) ('A' + (int) (Math.random() * 26))); // Caratteri tra 'A' e 'Z'
        }
        return sb.toString();
    }

    public boolean open(String user_password) {
        return this.password.equals(user_password);
    }

    public String getPassword() { // Metodo per debug, opzionale
        return password;
    }
}
