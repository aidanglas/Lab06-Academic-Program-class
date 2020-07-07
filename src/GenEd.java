
public class GenEd 
{
    public String code;
    public String description;
    public int requiredCredits;

    public GenEd(String code, String description, int requiredCredits) 
    {
        this.code = code;
        this.description = description;
        this.requiredCredits = requiredCredits;
    }

    public GenEd()
    {       
        this.code = "N/A";
        this.description = "None Available";
        this.requiredCredits = 0;
    }

    @Override
    public String toString()
    { 
        return description + " " + "("+code+")" + " " + requiredCredits;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRequiredCredits() {
        return requiredCredits;
    }

    public void setRequiredCredits(int requiredCredits) {
        this.requiredCredits = requiredCredits;
    }
    public void get()
    {
        
    }
}
