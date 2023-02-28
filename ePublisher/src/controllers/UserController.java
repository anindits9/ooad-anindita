package controllers;

import project.Project;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    boolean createUser(String userName, String userEmail, String userType){
        return true;
    }

    boolean disableUser(String userEmail){
        return  true;
    }

    boolean loginUser(String userId, String password){

        return  true;

    }
    List<Project> viewProjectsByUserID(String userId){

        return  new ArrayList<>();
    }
}
