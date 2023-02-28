package project;

import users.User;

public class Document extends Resource{


    private Integer docSize;


    public Document(String resourceID, User createdBy, String resouceName, String createdOn) {
        super(resourceID, createdBy, resouceName, createdOn);

    }


}
