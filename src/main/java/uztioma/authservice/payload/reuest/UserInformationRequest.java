package uztioma.authservice.payload.reuest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uztioma.authservice.entity.User;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInformationRequest {
    @Size(max = 20)
    private String username;
    @JsonIgnore
    @Size(max = 120)
    private String password;
    @Email
    @Size(max = 50)
    private String email;

    public User setUserInformation(User user){
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .build();
    }
}
