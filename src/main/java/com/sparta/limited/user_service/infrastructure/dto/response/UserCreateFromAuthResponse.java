package com.sparta.limited.user_service.infrastructure.dto.response;

import com.sparta.limited.user_service.domain.model.Gender;
import com.sparta.limited.user_service.domain.model.UserRole;
import lombok.Getter;

@Getter
public class UserCreateFromAuthResponse {

    private final Long userId;
    private final String username;
    private final UserRole role;
    private final Gender gender;
    private final Integer age;
    private final String address;

    private UserCreateFromAuthResponse(Long userId, String username, UserRole role, Gender gender,
        Integer age, String address) {
        this.userId = userId;
        this.username = username;
        this.role = role;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public static UserCreateFromAuthResponse of(Long userId, String username, UserRole role,
        Gender gender,
        Integer age, String address) {
        return new UserCreateFromAuthResponse(
            userId,
            username,
            role,
            gender,
            age,
            address
        );
    }
}
