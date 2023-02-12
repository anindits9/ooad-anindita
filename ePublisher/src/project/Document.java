package project;

public class Document {

    private String docId;

    private String docName;

    private String docType;

    private Integer docSize;

    public Document(String doc_id) {
        this.docId = doc_id;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public Integer getDocSize() {
        return docSize;
    }

    public void setDocSize(Integer docSize) {
        this.docSize = docSize;
    }
}
