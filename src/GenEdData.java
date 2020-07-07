
import java.util.ArrayList;

class GenEdData {

    private ArrayList<GenEd> geneds;

    public GenEdData(ArrayList<GenEd> geneds) {
        this.geneds = geneds;
    }

    @Override
    public String toString() {
        return "DataArray{" + "geneds=" + geneds + '}';
    }

    public GenEdData() {
        geneds = new ArrayList<GenEd>();

        GenEd ge1, ge2, ge3, ge4, ge5, ge6, ge7, ge8, ge9, ge10;

        ge1 = new GenEd("Writing Speaking", "GWS", 3);
        ge2 = new GenEd("Quantification", "GQ", 3);
        ge3 = new GenEd("Arts", "GA", 3);
        ge4 = new GenEd("Humanities", "GH", 3);
        ge5 = new GenEd("Health and Wellness", "GHW", 3);
        ge6 = new GenEd("Natural Sciences", "GN", 3);
        ge7 = new GenEd("Social and Behavioral Sciences", "GS", 3);
        ge8 = new GenEd("United States Cultures", "US", 3);
        ge9 = new GenEd("International Cultures", "IL", 3);
        ge10 = new GenEd("Writing Across the Curriculum", "WAC", 3);

        geneds.add(ge1);
        geneds.add(ge2);
        geneds.add(ge3);
        geneds.add(ge4);
        geneds.add(ge5);
        geneds.add(ge6);
        geneds.add(ge7);
        geneds.add(ge8);
        geneds.add(ge9);
        geneds.add(ge10);
    }

    public boolean contains(String s) {
        for (int i = 0; i < geneds.size(); i++) {
            if (geneds.get(i).code.contains(s) | geneds.get(i).description.contains(s)) {
                return true;
            }
        }
        return false;
    }

    public GenEd find(String s) {
        for (int i = 0; i < geneds.size(); i++) {
            if (s.matches(geneds.get(i).code) || (s.matches(geneds.get(i).description))) {
                return geneds.get(i);
            }
        }
        return null;
    }

    public ArrayList<GenEd> getGeneds() {
        return geneds;
    }

    public void setGeneds(ArrayList<GenEd> geneds) {
        this.geneds = geneds;
    }
}
