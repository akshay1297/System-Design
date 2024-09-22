package behavioral.chainOfResponsibility.userAuthentication;

public abstract class AuthenticationHandler {
    public AuthenticationHandler nextHandler;

    public AuthenticationHandler setNextHandler(AuthenticationHandler nextHandler) { // we can directly use constructor here and super() in child class.
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public void authenticate(User user){
        if(isAuthentic(user)){
            if(nextHandler != null){
                nextHandler.authenticate(user);
            }
        }
    }

    protected abstract boolean  isAuthentic(User user);
}
