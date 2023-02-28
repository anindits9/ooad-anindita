package project;

import users.Editor;
import users.User;

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

    private List<User> users;

    private List<Submission> submissions;

    private Editor createdBy;

    private List<Resource> resources;
    private ProjectStatus status;

    private String createdDate;

    private String completionDate;

    private String publicationDate;

    public Project(String projectName, Editor createdBy, ProjectStatus status, String createdDate) {
        this.projectName = projectName;
        this.createdBy = createdBy;
        this.status = status;
        this.createdDate = createdDate;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<Submission> submissions) {
        this.submissions = submissions;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
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

    public Editor getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Editor createdBy) {
        this.createdBy = createdBy;
    }
}
