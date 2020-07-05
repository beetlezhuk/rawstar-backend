package az.commerce.rawstar.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;

import static com.google.common.collect.Sets.newHashSet;
import static java.util.stream.Collectors.toSet;

@Getter
@RequiredArgsConstructor
public enum AppUserRole {

    USER(newHashSet(AppUserPermission.USER_PROFILE)),
    ADMIN(newHashSet(AppUserPermission.ADMIN));

    private final Set<AppUserPermission> userPermissions;

    public Set<GrantedAuthority> getGrantedAuthorities() {
        Set<GrantedAuthority> grantedAuthorities = this.getUserPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission
                        .getPermission()))
                .collect(toSet());

        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));

        return grantedAuthorities;
    }
}
