package uztioma.authservice.service;

import uztioma.authservice.payload.responce.JwtResponse;
import uztioma.authservice.payload.responce.MessageResponse;
import uztioma.authservice.payload.reuest.LoginRequest;
import uztioma.authservice.payload.reuest.SignupRequest;

public interface AuthService {

    /**
     * Authenticate do user
     * @param loginRequest checking element parameters
     * @return {@code JwtResponse}
     */
    JwtResponse authenticateUser(LoginRequest loginRequest);

    /**
     * User registration function
     * @param signupRequest element to be added to this set
     * @return {@code MessageResponse}
     */
    MessageResponse registerUser(SignupRequest signupRequest);

}
