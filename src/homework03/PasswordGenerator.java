package homework03;

import java.util.Random;

public class PasswordGenerator {

    private int lenght = 8;

    public String generatePassword() {

        Random random = new Random();
        StringBuilder passwd = new StringBuilder();
        String options = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!%?";


        while (passwd.length() < lenght) {
            int i = (int) (random.nextFloat() * options.length());
            passwd.append(options.charAt(i));
        }
        String finalPassword = passwd.toString();
        return finalPassword;
    }
}
