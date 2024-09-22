package behavioral.chainOfResponsibility.userAuthentication;

/*
Consider a user authentication system that checks the validity of a user through multiple stages like :
username validation -> password validation -> 2-factor authentication

question to ask ??? -> if we already mention logger level while logging , why Logger implementation follow chain of responsiblity principle ? why not directly call that perticular logger level class ?
 */
public class Client {

    public static void main(String[] args) {
        User user = new User("Akshay", "password", true);
        AuthenticationHandler userAuthenticationHandler = new UserAuthenticationHandler();
        AuthenticationHandler passwordAuthenticationHandler = new PasswordAuthenticationHandler();
        AuthenticationHandler twoFactorAuthenticationHandler = new TwoFactorAuthenticationHandler();
        // forming a chain
        userAuthenticationHandler.setNextHandler(passwordAuthenticationHandler).setNextHandler(twoFactorAuthenticationHandler);
        // valid case
        // userAuthenticationHandler.authenticate(user);
        System.out.println("INVALID CASE");
        // Invalid case
        User user1 = new User("Akshay" , "wrongPassword", true);
        userAuthenticationHandler.authenticate(user1);

    }

}
