package lk.ijse.gdse66.springbootwithjwt.service.impl;

import lk.ijse.gdse66.springbootwithjwt.dto.UserDTO;
import lk.ijse.gdse66.springbootwithjwt.entity.UserEntity;
import lk.ijse.gdse66.springbootwithjwt.repository.UserRepo;
import lk.ijse.gdse66.springbootwithjwt.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final ModelMapper mapper;

    @Override
    public UserDetailsService userDetailService() {
        return username -> userRepo.findByEmail(username)
                .orElseThrow(() -> new
                        UsernameNotFoundException(
                                "user not found"));
    }

    @Override
    public void Save(UserDTO userDTO) {
        userRepo.save(mapper.map(userDTO, UserEntity.class));
    }
}
