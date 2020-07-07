
import java.util.ArrayList;

/**
 * @author Aidan Glas
 */
public class app {

  
    public static void main(String[] args) 
    {
        Course c0;
        Course c1;
        Course c2;
        
        c0 = new Course();
        
        CourseName temp0 = new CourseName("Cyber", "100", "h");
        GenEd temp1 = new GenEdData().find("IL");
        CourseName temp2 = new CourseName();
        c1 = new Course(temp0, temp1, "Computer Systens Literacy", 3, 9, 99, temp2);
        
        CourseName temp3 = new CourseName("Cyber", "262", "");
        GenEd temp4 = new GenEdData().find("GS");
        CourseName temp5 = new CourseName();
        c2 = new Course(temp3, temp4, "Cyber-Defense Studio", 3, 9, 99, temp5);
        
        ArrayList<Course> requiredCourses = new ArrayList<Course>();
        requiredCourses.add(c0);
        requiredCourses.add(c1);
        requiredCourses.add(c2);

        AcademicProgram ap;
        ap = new AcademicProgram("Special Studies in Cyber Security", 9, requiredCourses);
        System.out.println(ap.toString());
    }
}
