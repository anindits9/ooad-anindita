package users;

public class Admin extends User{

    protected String emailID;
    public Admin(String email, String fName, String lName) {
        super(email, fName, lName);
        this.emailID = email;
    }

    void createUser(){

    }

    void disableUser(){

    }
}
