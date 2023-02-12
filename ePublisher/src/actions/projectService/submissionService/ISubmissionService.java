package actions.projectService.submissionService;

import project.Document;

import java.util.List;
public interface ISubmissionService {

    Document upload(String projectId);
    Document download(String projectId, String docId);

    List<Document> viewAll(String projectId);


}
