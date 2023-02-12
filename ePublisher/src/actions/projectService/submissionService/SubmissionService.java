package actions.projectService.submissionService;

import actions.projectService.IProjectService;
import actions.projectService.ProjectService;
import project.Document;
import project.Project;

import java.util.List;

public class SubmissionService implements ISubmissionService{

    private IProjectService projectService;
    private Project project;

    public SubmissionService(){
        projectService = new ProjectService();
    }

    @Override
    public Document upload(String projectId) {
        return null;
    }

    @Override
    public Document download(String projectId, String docId) {
        return null;
    }

    @Override
    public List<Document> viewAll(String projectId) {
        return null;
    }


}
