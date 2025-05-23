package com.sparta.limited.user_service.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserRole {

    ROLE_ADMIN("관리자"),
    ROLE_USER("일반 사용자");

    private final String description;

    public static UserRole from(String role) {
        return UserRole.valueOf(role);
    }

}
