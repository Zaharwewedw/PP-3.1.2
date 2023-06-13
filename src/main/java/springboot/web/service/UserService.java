package springboot.web.service;

import springboot.web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    void upDateUser(User user);

    void deleteUser(Long id);

    User getByIdUser(Long id);
}