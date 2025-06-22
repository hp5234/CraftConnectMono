package com.craftconnect.craftconnectmono.app.users.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private Long id;
    private String nickname;
    private String loginid;
    private String password;
    private String kind;
} 