public class PasswordBreaker {
    final static int PASSWORD_LENGTH = 4;

    public static void main(String[] args) {

        PasswordProtectedFile file = new PasswordProtectedFile(PASSWORD_LENGTH);


        PasswordCracker cracker = new PasswordCracker(file, PASSWORD_LENGTH);

        System.out.println("Un file password protected è stato creato.");
        System.out.println("Stiamo cercando di violare la password...");
        System.out.println();


        Cronometro crono = new Cronometro();
        crono.start();


        String secret_password = cracker.crack_it();

        crono.stop();

        System.out.println("La password segreta: " + secret_password);
        System.out.println("È stata violata in: " + crono.elapsed() + " millisecondi");
    }
}
