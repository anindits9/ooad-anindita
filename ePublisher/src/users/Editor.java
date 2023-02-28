package users;

public class Editor extends User{

    public Editor(String email, String fName, String lName) {
        super(email, fName, lName);
        this.emailID = email;
    }

}
