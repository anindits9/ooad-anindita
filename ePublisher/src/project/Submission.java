package project;

import comments.Comment;
import users.Author;
import java.util.List;

public class Submission {
    enum Status{
        INACTIVE,
        ACTIVE,
        COMPLETED
    }
    private String submissionId;

    private Resource resource;

    Author createdBy;

    private String createdOn;
    private Status status;

    private List<Comment> commentList;

    private List<Revision> revisions;

    public Submission(Resource resource, Author createdBy, String createdOn, Status status) {
        this.resource = resource;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.status = status;
    }

}
