package ui;

public abstract class Media {
    protected String id;
    protected String title;
    protected String status;

    public Media(String id, String title) {
        this.id = id;
        this.title = title;
        this.status = "Available";
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public abstract String showDetail();
}