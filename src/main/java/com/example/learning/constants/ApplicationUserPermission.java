package com.example.learning.constants;

import lombok.Getter;

@Getter
public enum ApplicationUserPermission {
    VOTE_READ("candidate:read"),
    VOTE_WRITE("candidate:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }
}
