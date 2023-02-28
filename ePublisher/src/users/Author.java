package users;

public class Author extends User{

    public Author(String email, String fName, String lName) {
        super(email, fName, lName);
        this.emailID = email;
    }
}
