package project;

import users.Editor;
import users.Author;

import java.util.ArrayList;
import java.util.List;
public class Project {

    enum ProjectStatus{
        INACTIVE,
        ACTIVE,
        COMPLETED,
        PUBLISHED
    }

    private String projectId;

    private String projectName;

    private Author author;

    private List<Editor> editors;

    private List<Submission> submissions;

    private ProjectStatus status;

    private String createdDate;

    private String completionDate;

    private String publicationDate;

    public Project(){
        this.editors = new ArrayList<>();
        this.submissions = new ArrayList<>();
        this.status = ProjectStatus.INACTIVE;
    }
    public Project(String projectId) {
        this.projectId = projectId;
        this.editors = new ArrayList<>();
        this.submissions = new ArrayList<>();
        this.status = ProjectStatus.INACTIVE;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Editor> getEditors() {
        return editors;
    }

    public void setEditors(List<Editor> editors) {
        this.editors = editors;
    }

    public List<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<Submission> submissions) {
        this.submissions = submissions;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
}
