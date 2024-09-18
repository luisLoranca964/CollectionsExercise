public class Main {
    public static void main( String[] args ) {
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String courseId2 = "art_01";
        String studentId = "120120";
        courseService.displayCourseInformation( courseId );
        System.out.println("_____________________________________________");
        courseService.displayStudentInformation( studentId);

        courseService.enrollStudent( studentId, courseId );
        courseService.enrollStudent( studentId, courseId2 );
        courseService.totalEnrolledCourses(studentId);
        //courseService.displayStudentInformation( studentId);

        //courseService.unEnrollStudent( studentId, courseId );
       // courseService.totalEnrolledCourses(studentId);
        courseService.totalCredits(studentId);
        
    }
}