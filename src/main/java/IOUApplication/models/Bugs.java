package IOUApplication.models;

public class Bugs {
    private int bugID;
    private String description;
    public Bugs(int bugID, String description){
        this.bugID = bugID;
        this.description = description;
    }

    public int getBugID() {
        return bugID;
    }

    public void setBugID(int bugID) {
        this.bugID = bugID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
