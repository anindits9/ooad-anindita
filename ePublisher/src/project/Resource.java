package project;

import users.User;

public class Resource {

    private String resourceID;

    private String resouceName;



    public Resource(String resourceID,  String resouceName) {
        this.resourceID = resourceID;

        this.resouceName = resouceName;

    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }


    public String getResouceName() {
        return resouceName;
    }

    public void setResouceName(String resouceName) {
        this.resouceName = resouceName;
    }


}
