package comments;

import users.User;

public class Comment {

    String commentId;

    User userName;

    String text;

    String commenDate;

    public Comment(String commentId) {
        this.commentId = commentId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCommenDate() {
        return commenDate;
    }

    public void setCommenDate(String commenDate) {
        this.commenDate = commenDate;
    }
}
