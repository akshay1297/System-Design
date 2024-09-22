package behavioral.chainOfResponsibility.userAuthentication;

public class PasswordAuthenticationHandler extends AuthenticationHandler{
    @Override
    protected boolean isAuthentic(User user) {
        if(user.getPassword().equals("password")){
            System.out.println("Password is valid");
            return true;
        }
        System.out.println("Password is Invalid");
        return false;
    }
}
