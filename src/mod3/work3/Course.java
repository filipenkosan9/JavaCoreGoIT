package mod3.work3;


import java.util.Date;

public class Course {

    private Date startData;
    private String name;
    private int houseDuration;
    private String teacherName;

    public Course(int houseDuration, String name, String teacherName) {
        this.houseDuration = houseDuration;
        this.name = name;
        this.teacherName = teacherName;
    }

    public Course(Date startData, String name) {
        this.startData = startData;
        this.name = name;
    }

    public Date getStartData() {
        return startData;
    }

    public void setStartData(Date startData) {
        this.startData = startData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHouseDuration() {
        return houseDuration;
    }



    public void setHouseDuration(int houseDuration) {
        this.houseDuration = houseDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
