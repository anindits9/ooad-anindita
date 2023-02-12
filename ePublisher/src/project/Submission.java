package project;

import comments.Comment;
import users.Author;
import users.Editor;

import java.util.ArrayList;
import java.util.List;

public class Submission {
    enum Status{
        INACTIVE,
        ACTIVE,
        COMPLETED
    }
    private String subId;

    private Document document;

    private Author author;

    private Editor editor;

    private String created_date;
    private String modified_date;

    private Status status;

    private List<Comment> commentList;

    public Submission(String subId) {
        this.subId = subId;
        this.status = Status.INACTIVE;
        commentList = new ArrayList<>();
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getModified_date() {
        return modified_date;
    }

    public void setModified_date(String modified_date) {
        this.modified_date = modified_date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
