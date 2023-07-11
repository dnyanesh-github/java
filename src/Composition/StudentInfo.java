package Composition;

public class StudentInfo {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Dnyanesh Dasare");
        student.setDateOfBirth("24/06/1984");
        student.setHasHostel(false);

        student.setCourse(new Course());
        student.getCourse().setTitle("Computer Science");
        student.getCourse().setLevel("Undergraduate");
        student.getCourse().setStartDate("05/05/2002");
        System.out.println(student.getName() + " is a student of " + student.getCourse().getTitle() + " which starts from " + student.getCourse().getStartDate());

        student.setSports(new Sports());
        student.getSports().setName("Cricket");
        student.getSports().setLevel(sportsSkillLevel.PROFICIENT);
        student.getSports().setActive(true);
        System.out.println("He is also active in playing " + student.getSports().getName() + " and his skills are evaluated at " + student.getSports().getLevel() + " level.");


    }
}