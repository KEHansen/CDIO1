package Data;

import java.util.List;
import java.util.Scanner;

public class Menu implements Logic.IUserDAO {
    public void beginMenu() {
        // Menu
        // List users
        // Create user
            // Name, CPR(UNIQUE ID), Initials, Password
                // If time make the initials automaticly. based on 2 first letters in first name, and 2 last letters in last name.
        // Change name
        // Change password on user
        Scanner scanMenuInput = new Scanner(System.in);
        int ans = 0;

        while(true) {
            System.out.println("User Administration \n\n" +
                    "Select task: \n" +
                    "Enter 1 to list all users \n" +
                    "Enter 2 to create a new user \n" +
                    "Enter 3 to change a users name \n" +
                    "Enter 4 to change a users password \n" +
                    "Enter 5 to change a users Role \n" +
                    "Enter 6 to delete a user \n" +
                    "Enter q/quit to exit!");
            ans = scanMenuInput.nextInt();

            switch (ans) {
                case 1:
                    // List all users
                    break;
                case 2:
                    // Create a new user
                    break;
                case 3:
                    // Change a users name
                    // Select user by CPR number, ask for CPR number
                    break;
                case 4:
                    // Change a users password
                    break;
                case 5:
                    // Change a users Role?
                    break;
                default:
                    // exit
                    System.exit(1);
                    break;
            }
        }
    }

    public UserDTO getUser(int userId) throws DALException {
        return null;
    }

    public List<UserDTO> getUserList() throws DALException {
        return null;
    }

    public void createUser(UserDTO user) throws DALException {

    }

    public void updateUser(UserDTO user) throws DALException {

    }

    public void deleteUser(int userId) throws DALException {

    }
}
