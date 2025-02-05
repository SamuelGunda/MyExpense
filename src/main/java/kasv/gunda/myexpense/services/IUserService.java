package kasv.gunda.myexpense.services;

import kasv.gunda.myexpense.models.entities.User;

public interface IUserService {
    User getUserByEmail(String email);
    User getUserById(String id);
    void deleteUser();
}
