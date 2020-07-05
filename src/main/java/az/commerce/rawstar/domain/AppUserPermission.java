package az.commerce.rawstar.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AppUserPermission {

    USER_PROFILE("user:profile"),
    ADMIN("admin");

    private String permission;
}