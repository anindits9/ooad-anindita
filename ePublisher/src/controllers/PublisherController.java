package controllers;

import project.Project;
import project.Submission;

import java.util.ArrayList;
import java.util.List;

public class PublisherController {
    UserController uc;

    ProjectController pc;
    boolean createUser(String userName, String userEmail, String userType){

        return  uc.createUser( userName,  userEmail,  userType);
    }

    boolean diasbleUser(String userId){
        return  uc.disableUser(userId);
    }

    boolean loginUser(String userId, String password){
        return  uc.loginUser(userId, password);
    }

    List<Project> viewProjectsByUserID(String userId){

        return  uc.viewProjectsByUserID(userId);
    }
    List<Submission> viewSubmissionsByProject(String projectId){

        return  pc.viewSubmissionsByProject(projectId);
    }
}
