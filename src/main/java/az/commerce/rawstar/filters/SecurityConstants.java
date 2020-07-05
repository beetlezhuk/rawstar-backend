package az.commerce.rawstar.filters;

public class SecurityConstants {

    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users/sign-up";
    public final static String USER_ID_JWT_CLAIM = "uid";
    public final static String USER_ROLES_JWT_CLAIM = "roles";
    public final static String ROLE_USER = "ROLE_USER";
    public final static String ROLE_ADMIN = "ROLE_ADMIN";
    public final static String ENDPOINT_MY_PROFILE = "/my-profile";
}
