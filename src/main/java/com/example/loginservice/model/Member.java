package com.example.loginservice.model;

import com.example.loginservice.enums.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class Member {
    private Long id;
    private String userId;
    private String password;
    private String userName;
    private String nickName;
    private String emailProvider;
    private Role role;
    private String email;
}
