package com.depamine.depamine.user.dto;

import com.depamine.depamine.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserDTO {

    private String userId;
    private String pw;
    private String nickName;


    public static UserDTO from(User user) {
        return UserDTO.builder()
                .userId(user.getUserId())
                .nickName(user.getNickname())
                .build();
    }
}
