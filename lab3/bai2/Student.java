package bai2;

public class Student {
    private String stID;
    private String stName;
    private String stClass;

    public Student() {
        this.stID = null;
        this.stName = null;
        this.stClass = null;
    }

    public Student (String stID, String stName, String stClass){
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }

    public Student(Student st) {
        this.stID = st.stID;
        this.stName = st.stName;
        this.stClass = st.stClass;
    }

    public String getStID() {
        return this.stID;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public String getStName() {
        return this.stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStClass() {
        return this.stClass;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass;
    }

    @Override
    public String toString() {
        return "{" +
                " stID='" + getStID() + "'" +
                ", stName='" + getStName() + "'" +
                ", stClass='" + getStClass() + "'" +
                "}";
    }

}
