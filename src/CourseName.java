
/**
 *for string use matches, or =, for integers use ==
 *
 * @author abg5406
 */
public class CourseName {

    private String major;
    private String number;
    private String complement;

    public CourseName(String major, String number, String complement) {
        //this.major = major;
        setMajor(major);
        //this.number = number;
        setNumber(number);
        //this.complement = complement;
        setComplement(complement);
    }

    public CourseName() {
        this.major = "IST";
        this.number = "000";
        this.complement = "?";
    }

    @Override
    public String toString() {
        return "CourseName{" + "major=" + major + ", number=" + number + ", complement=" + complement + '}';
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        String m = major.toUpperCase().trim();

        if (major.matches("CMPSC")) //change to just major
        {
            major = m;
            //System.out.println(); 
        } else if (major.matches("COMM")) {
            major = m;
            //System.out.println();
        } else if (major.matches("CYBER")) {
            major = m;
            //System.out.println();
        } else if (major.matches("DS")) {
            major = m;
            //System.out.println("");
        } else if (major.matches("ECON")) {
            major = m;
            //System.out.println();
        } else if (major.matches("ENG")) {
            major = m;
            //System.out.println();
        } else if (major.matches("IST")) {
            major = m;
            //System.out.println();
        } else if (major.matches("MATH")) {
            major = m;
            //System.out.println();
        } else if (major.matches("SRA")) {
            major = m;
            //System.out.println();
        } else if (major.matches("STAT")) {
            major = m;
            //System.out.println();
        } else {
            major = "IST";
        }

        this.major = m;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        String n = number;
        //this.number = n     ;
        
        if (number.length() == 0) 
        {
            this.number = "000";
        } 
        else if (number.length() == 1)
        {
            this.number = "00" + number;
        }
        else if (number.length() == 2) 
        {
            this.number = "0" + number;
        } 
        else
        {
            this.number = number;
        }
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement)
            
    {
        complement = complement.trim().toUpperCase();
        
        if (complement.contains("A") || complement.contains("B") || 
            complement.contains("C") || complement.contains("D") || 
            complement.contains("E") || complement.contains("H") ||
            complement.contains("M") || complement.contains("N") || 
            complement.contains("S") || complement.contains("T") || 
            complement.contains("W") || complement.contains("Z"))
        {
            this.complement = complement;
        }
        else 
        {
            this.complement = "?";
        }
    }
}
