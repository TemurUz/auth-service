package uztioma.authservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uztioma.authservice.entity.User;
import uztioma.authservice.payload.reuest.UserInformationRequest;
import uztioma.authservice.repository.UserRepository;
import uztioma.authservice.service.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();//todo ' 1) userlarni belgilangan tartibda olib keladigan qilish sizeni berish 2) Json data get full
    }

    @Override
    public User getUser(Long userId) {
        return userRepository.findById(userId)//todo Json information get full
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with user_id: " + userId));
    }

    @Override
    public String updateUserInformation(Long userId, UserInformationRequest request) {
        var user = getUser(userId);
        userRepository.save(request.setUserInformation(user));
        return "User updated successfully !!!)";
    }

    @Override
    public boolean deleteUser(Long userId) {
        try {
           userRepository.deleteById(userId);
           return true;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
