package users;

public class Editor extends User{

    enum Role{
        CHIEF_EDITOR,
        EDITOR
    }
    private String editorId;

    private String editorName;

    private String editorEmail;

    private Role editorRole;

    private UserType userType;

    public Editor(String editor_id) {
        this.editorId = editor_id;
    }

    public String getEditorId() {
        return editorId;
    }

    public void setEditorId(String editorId) {
        this.editorId = editorId;
    }

    public String getEditorName() {
        return editorName;
    }

    public void setEditorName(String editorName) {
        this.editorName = editorName;
    }

    public String getEditorEmail() {
        return editorEmail;
    }

    public void setEditorEmail(String editorEmail) {
        this.editorEmail = editorEmail;
    }

    public Role getEditorRole() {
        return editorRole;
    }

    public void setEditorRole(Role editorRole) {
        this.editorRole = editorRole;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

}
