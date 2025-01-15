public class PasswordCracker {
    private PasswordProtectedFile fileToCrack;
    private int password_length;


    public PasswordCracker(PasswordProtectedFile file, int password_length) {
        this.fileToCrack = file;
        this.password_length = password_length;
    }

    public String crack_it() {
        char[] attempt = new char[password_length];


        for (int i = 0; i < password_length; i++) {
            attempt[i] = 'A'; // Start with "AAAA"
        }


        while (true) {
            String guess = new String(attempt);
            if (fileToCrack.open(guess)) {
                return guess;
            }
            increment(attempt);
        }
    }


    private void increment(char[] attempt) {
        for (int i = attempt.length - 1; i >= 0; i--) {
            if (attempt[i] < 'Z') {
                attempt[i]++;
                return;
            } else {
                attempt[i] = 'A';
            }
        }
    }
}