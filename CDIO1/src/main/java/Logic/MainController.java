package Logic;

import Data.Menu;
import Data.UserDTO;

import java.util.List;

public class MainController implements IUserDAO {

    public void userAdministration() {

        Menu menu = new Menu();
        menu.beginMenu();
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
