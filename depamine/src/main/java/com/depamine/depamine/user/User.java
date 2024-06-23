package com.depamine.depamine.user;

import com.depamine.depamine.user.dto.UserDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String pw;
    private String nickname;


    public static User of(UserDTO userDTO) {
        return User.builder()
                .userId(userDTO.getUserId())
                .pw(pass)
                .nickname(userDTO.getNickName())
                .build();
    }


}
