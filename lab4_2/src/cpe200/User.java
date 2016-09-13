package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
    }

    public boolean setUserName(String name) {
        String condition = "([A-Za-z]+)([A-Za-z\\d]+)" ;
        if(name.matches(condition) && name.length() >= 8) {
        this.userName = name;
        return true;}
        else
        return false;
    }

    public boolean setPassword(String name) {
        if( name.length() < 12 || name.matches("([^A-Z]+)") || name.matches("([^a-z]+)") || name.matches("([^0-9]+)"))
        {
            return false;}
        else {
        this.password = name;
        return true;}
    }

    public String getUserName() {

        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
