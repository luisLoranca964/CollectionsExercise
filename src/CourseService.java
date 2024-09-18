import java.util.HashMap;

public class CourseService
{
    HashMap<String, Student> students = new HashMap<>();

    HashMap<String, Course> courses = new HashMap<>();


    public CourseService() {
        students.put( "120120", new Student( "Santiago", "120120" ) );
        students.put( "884545", new Student( "Kate", "884545" ) );
        students.put( "458787", new Student( "Alejandra", "458787" ) );
        students.put( "135464", new Student( "Maria", "135464" ) );
        students.put( "778979", new Student( "Peter", "778979" ) );

        courses.put( "math_01", new Course( "Mathematics 1", "math_01", 8 ) );
        courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
        courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
        courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
        courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
        courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
    }

    public void enrollStudent(String studentId, String courseId){
    	students.get(studentId).enroll(courses.get(courseId));
    }

    public void unEnrollStudent(String studentId, String courseId){
    	students.get(studentId).unEnroll(courses.get(courseId));
    }
    
    public void totalEnrolledCourses(String studentId) {
    	System.out.println(students.get(studentId).getEnrolledCourses());
    	System.out.println(students.get(studentId).totalEnrolledCourses());
    }
    
    public void totalCredits(String studentId) {
    	int total= students.get(studentId).totalEnrolledCourses()*8;
    	System.out.println("creditos "+total);
    }

    public void displayCourseInformation(String courseId){
    	System.out.println(courses.get(courseId).id+" -> "+ courses.get(courseId).name);
    }

    public void displayStudentInformation(String studentId){
    	System.out.println(students.get(studentId).id+" -> "+ students.get(studentId).name);
    }


}