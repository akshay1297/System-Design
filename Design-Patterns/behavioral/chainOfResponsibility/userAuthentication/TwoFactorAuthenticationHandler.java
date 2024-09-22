package behavioral.chainOfResponsibility.userAuthentication;

public class TwoFactorAuthenticationHandler extends AuthenticationHandler {

    @Override
    protected boolean isAuthentic(User user) {
        if(user.isTwoFactorAuthenticated()){
            System.out.println("Password is valid");
            return true;
        }
        System.out.println("Password is Invalid");
        return false;
    }
}
