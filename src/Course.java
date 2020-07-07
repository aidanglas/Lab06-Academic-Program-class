/**
 *
 * @author abg5406
 */
public class Course
{
    private CourseName name;
    private GenEd genEd;
    private String description;
    private int creditsMinPerCourse;
    private int creditsMaxPerCourse;
    private int creditsMaximum;
    private CourseName preReq;

    public Course(CourseName name, GenEd genEd, String description, int creditsMinPerCourse, int creditsMaxPerCourse, int creditsMaximum, CourseName preReq)
    {
        this.name = name;
        this.genEd = genEd;
        this.description = description;
        this.creditsMinPerCourse = creditsMinPerCourse;
        this.creditsMaxPerCourse = creditsMaxPerCourse;
        this.creditsMaximum = creditsMaximum;
        this.preReq = preReq;
    }

    public Course()
    {
        this.name = new CourseName();
        this.genEd = new GenEd();
        this.description = "";
        this.creditsMinPerCourse = 0;
        this.creditsMaxPerCourse = 0;
        this.creditsMaximum = 0;
        this.preReq = new CourseName();
    }

    @Override
    public String toString()
    {
        return "Course{" + "name=" + name + ", genEd=" + genEd + ", description=" + description + ", creditsMinPerCourse=" + creditsMinPerCourse + ", creditsMaxPerCourse=" + creditsMaxPerCourse + ", creditsMaximum=" + creditsMaximum + ", preReq=" + preReq + '}';
    }

    public CourseName getName()
    {
        return name;
    }

    public void setName(CourseName name)
    {
        this.name = name;
    }

    public GenEd getGenEd()
    {
        return genEd;
    }

    public void setGenEd(GenEd genEd)
    {
        this.genEd = genEd;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getCreditsMinPerCourse()
    {
        return creditsMinPerCourse;
    }

    public void setCreditsMinPerCourse(int creditsMinPerCourse)
    {
        this.creditsMinPerCourse = creditsMinPerCourse;
    }

    public int getCreditsMaxPerCourse()
    {
        return creditsMaxPerCourse;
    }

    public void setCreditsMaxPerCourse(int creditsMaxPerCourse)
    {
        this.creditsMaxPerCourse = creditsMaxPerCourse;
    }

    public int getCreditsMaximum()
    {
        return creditsMaximum;
    }

    public void setCreditsMaximum(int creditsMaximum)
    {
        this.creditsMaximum = creditsMaximum;
    }

    public CourseName getPreReq()
    {
        return preReq;
    }

    public void setPreReq(CourseName preReq)
    {
        this.preReq = preReq;
    }
}
 
    
//    public GenEd find(String s) {
//        for (int i = 0; i < geneds.size(); i++) 
//        {
//            if (s.matches(geneds.get(i).code) || (s.matches(geneds.get(i).description))) 
//            {
//                return geneds.get(i);
//            }
//        }
//}
