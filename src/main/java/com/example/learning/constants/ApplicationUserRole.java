package com.example.learning.constants;

import com.google.common.collect.Sets;
import lombok.Getter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static com.example.learning.constants.ApplicationUserPermission.*;

@Getter
public enum ApplicationUserRole {

    // TODO: Replace Collections List with Sets for avoiding duplication
    ELECTOR(Sets.newHashSet(VOTE_WRITE)),
    CANDIDATE(Sets.newHashSet(VOTE_READ, VOTE_WRITE)),
    SUPERVISOR(Sets.newHashSet(VOTE_READ, VOTE_WRITE)),
    ADMIN(Sets.newHashSet(VOTE_READ, VOTE_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }
}
