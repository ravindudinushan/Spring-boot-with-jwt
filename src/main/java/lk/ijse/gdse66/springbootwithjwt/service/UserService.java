package lk.ijse.gdse66.springbootwithjwt.service;

import lk.ijse.gdse66.springbootwithjwt.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    UserDetailsService userDetailService();
    void Save(UserDTO userDTO);
}
