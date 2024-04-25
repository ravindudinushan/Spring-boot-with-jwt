package lk.ijse.gdse66.springbootwithjwt.service;

import lk.ijse.gdse66.springbootwithjwt.auth.request.SignInRequest;
import lk.ijse.gdse66.springbootwithjwt.auth.request.SignUpRequest;
import lk.ijse.gdse66.springbootwithjwt.auth.response.JwtAuthResponse;

public interface AuthenticationService {
    JwtAuthResponse signIn(SignInRequest signInRequest);
    JwtAuthResponse signUp(SignUpRequest signUpRequest);
}
