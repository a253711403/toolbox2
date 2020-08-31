package cn.akeem.toolbox.domain;

public class Dept {
    private int id;
    private String title;
    private String loc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept [id=" + id + ", title=" + title + ", loc=" + loc + "]";
    }

}
