import java.util.Comparator;

public class Students {
    private int group;
    private String name;
    private int grade;

    @Override
    public String toString() {
        return "Students{" +
                "group=" + group +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public Students(int group, String name, int grade) {
        this.group = group;
        this.name = name;
        this.grade = grade;
    }


    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}
class PersonNameComparator implements Comparator<Students>{
    public int compare(Students a,Students b){
        return a.getName().compareTo(b.getName());
    }}

class PersonGroupComparator implements Comparator<Students>{
        public int compare(Students a,Students b){
            if(a.getGroup()>b.getGroup())
                return 1;
            else if (a.getGroup()< b.getGroup())
                return -1;
            else
            return 0;
        }
}

class PersonGradeComparator implements Comparator<Students>{
    public int compare(Students a,Students b){
        if(a.getGrade()>b.getGrade())
            return 1;
        else if (a.getGrade()< b.getGrade())
            return -1;
        else
            return 0;
    }
}
