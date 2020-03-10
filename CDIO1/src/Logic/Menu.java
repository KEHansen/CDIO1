package Logic;

import java.util.Scanner;

public class Menu {
    public void beginMenu() {
        // Menu
        // List users
        // Create user
            // Name, CPR(UNIQUE ID), Initials, Password
                // If time make the initials automaticly. based on 2 first letters in first name, and 2 last letters in last name.
        // Change name
        // Change password on user
        Scanner scanMenuInput = new Scanner(System.in);
        String ans = "";

        while(true) {
            System.out.println("User Administration \n\n" +
                    "Select task: \n" +
                    "Enter 1 to list all users \n" +
                    "Enter 2 to create a new user \n" +
                    "Enter 3 to change a users name \n" +
                    "Enter 4 to change a users password \n" +
                    "Enter 5 to change a users Role \n" +
                    "Enter q/quit to exit!");
            ans = scanMenuInput.nextLine();

            if(ans == "q" || ans.toLowerCase() == "quit") {
                break;
            }

            switch (ans) {
                case "1":
                    // List all users
                    break;
                case "2":
                    // Create a new user
                    break;
                case "3":
                    // Change a users name
                    // Select user by CPR number, ask for CPR number
                    break;
                case "4":
                    // Change a users password
                    break;
                case "5":
                    // Change a users Role?
                    break;
            }
        }
    }
}
