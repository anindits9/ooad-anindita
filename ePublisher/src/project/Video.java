package project;

import users.User;

public class Video extends Resource{

    public Video(String resourceID, User createdBy, String resouceName, String createdOn) {
        super(resourceID, createdBy, resouceName, createdOn);
    }

    void compress(){

    }
}
