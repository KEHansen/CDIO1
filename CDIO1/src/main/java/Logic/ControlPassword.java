package Logic;

import java.util.Scanner;

public class ControlPassword {

    private String password;

    public String newPassword() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Requirements:\n" +
                "Password must contain more than 6 characters. \n" +
                "Avoid using your name or birthday as your password. \n" +
                "Your password must contain one of the following special-characters: {'.', '-', '_', '+', '!', '?', '='}");
        while(true) {
            System.out.print("Please enter a password: ");
            password = scan.nextLine();
            System.out.print("Please enter a password: ");
            String temp = scan.nextLine();
            if(password.equals(temp)) {
                if (password.length() < 6 || password.length() > 50) {
                    if ((password.contains(".")) || (password.contains("-")) || (password.contains("+")) || (password.contains("!")) || (password.contains("?")) || (password.contains("=")) || (password.contains("_"))) {
                        break;
                    } else {
                        System.out.println("ERROR: Password must contain one of the following special-characters: {'.', '-', '_', '+', '!', '?', '='}!");
                    }
                } else {
                    System.out.println("ERROR: Passwords must be greater than 6 and less than 50 characters!");
                }
            } else {
                System.out.println("ERROR: Passwords didn't match!");
            }
        }
        return password;
    }

    public String getPassword() {
        return password;
    }
}
