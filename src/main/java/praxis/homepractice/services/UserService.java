package praxis.homepractice.services;

import org.springframework.stereotype.Service;
import praxis.homepractice.model.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Service
public interface UserService {

    List<User>  getUsers();

    User getUser(String userName);
    void saveUser(User user);
    void deleteUser(User user);
    void updateUser (User user);
}
