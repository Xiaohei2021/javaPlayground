public class Student {
//    String name;
//    int age;
//    String grade;

    private String name;
    private String dateOfBirth;
    private Boolean hasStudentHousing;

    public Course course;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getStudentHousing() {
        return hasStudentHousing;
    }

    public void setStudentHousing(Boolean hasStudentHousing) {
        this.hasStudentHousing = hasStudentHousing;
    }
}
