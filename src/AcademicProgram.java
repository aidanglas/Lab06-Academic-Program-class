
import java.util.ArrayList;

/*
 * @author Aidan Glas
 */
public class AcademicProgram 
{
    private String name;
    private int minimumNumberOfCredits;
    private ArrayList<Course> requiredCourses;

    public AcademicProgram(String name, int minimumNumberOfCredits, ArrayList<Course> requiredCourses) 
    {
        this.name = name;
        this.minimumNumberOfCredits = minimumNumberOfCredits;
        this.requiredCourses = requiredCourses;
    }

    public AcademicProgram() 
    {
        this.name = "";
        this.minimumNumberOfCredits = 0;
        this.requiredCourses = new ArrayList<Course>();
    }

    @Override
    public String toString() {
        
        return "AcademicProgram{" + "name=" + name + ", minimumNumberOfCredits=" + minimumNumberOfCredits + ", requiredCourses=" + requiredCourses + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinimumNumberOfCredits() {
        return minimumNumberOfCredits;
    }

    public void setMinimumNumberOfCredits(int minimumNumberOfCredits) {
        this.minimumNumberOfCredits = minimumNumberOfCredits;
    }

    public ArrayList<Course> getRequiredCourses() {
        return requiredCourses;
    }

    public void setRequiredCourses(ArrayList<Course> requiredCourses) {
        this.requiredCourses = requiredCourses;
    }
    
    
    
}
