package uztioma.authservice.service;

import uztioma.authservice.entity.User;
import uztioma.authservice.payload.reuest.UserInformationRequest;

import java.util.List;

public interface UserService {

    List<User> getUserList();

    User getUser(Long userId);

    String updateUserInformation(Long userId, UserInformationRequest request);

    boolean deleteUser(Long userId);

}
