package Composition;

public class Student {
    private String name;
    private String dateOfBirth;
    private boolean hasHostel;
    private Course course;
    private Sports sports;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean getHasHostel() {
        return hasHostel;
    }

    public void setHasHostel(boolean hasHostel) {
        this.hasHostel = hasHostel;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Sports getSports() {
        return sports;
    }

    public void setSports(Sports sports) {
        this.sports = sports;
    }
}