package behavioral.chainOfResponsibility.userAuthentication;

public class UserAuthenticationHandler extends AuthenticationHandler{
    @Override
    protected boolean isAuthentic(User user) {
        if(user.getUserName() != null) {
            System.out.println("User is valid");
            return true;
        }

        System.out.println("User is Invalid");
        return false;

    }
}
