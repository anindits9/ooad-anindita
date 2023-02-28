package project;

import users.Editor;


public class Revision {

    private String revisionId;

    private Resource revisionResource;

    private Editor revisedBy;

    public Revision(Resource revisionResource, Editor revisedBy) {
        this.revisionResource = revisionResource;
        this.revisedBy = revisedBy;
    }


}
