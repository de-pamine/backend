package com.depamine.depamine.user;

import com.depamine.depamine.user.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public String create(UserDTO userDTO) {
//        String pass = passwordEncoder.encode(userDTO.getPw()); 패스워드 관리
        userRepository.save(User.of(userDTO));
        return "SUCCESS";
    }


    public UserDTO read(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow();
        return UserDTO.from(user);
    }


}
