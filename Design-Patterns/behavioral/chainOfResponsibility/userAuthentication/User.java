package behavioral.chainOfResponsibility.userAuthentication;

public class User {
    String userName;
    String password;
    boolean twoFactorAuthenticated; // permission

    public User(String userName, String password, boolean twoFactorAuthenticated) {
        this.userName = userName;
        this.password = password;
        this.twoFactorAuthenticated = twoFactorAuthenticated;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTwoFactorAuthenticated(){
        return this.twoFactorAuthenticated;
    }

}
