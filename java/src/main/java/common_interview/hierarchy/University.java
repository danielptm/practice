package common_interview.hierarchy;

public class University implements UniversityInterface{
    String name;
    University parent;
    public University(String name, University university) {
        this.name = name;
        this.parent = university;
    }

    public String getName() {
        return name;
    }

    public University getParent() {
        return parent;
    }
}
