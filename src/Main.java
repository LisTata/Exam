import java.util.Comparator;
import java.util.TreeSet;

/* Студенты нескольких групп сдают экзамен по одному предмету, который оценивается по шкале от 1 до 10.
 Вывести список студентов и их оценок для выбранной группы с сортировкой по фамилиям; по оценкам.
/После списка группы вывести статистику (количество студентов, получивших 10 баллов, 9 баллов и т.д.;
 среднюю успеваемость по выбранной группе).*/
public class Main {
    public static void main(String[] args) {
        Comparator<Students>scomp=new PersonGroupComparator().thenComparing(new PersonNameComparator()).thenComparing(new PersonGradeComparator());
        TreeSet<Students>students=new TreeSet<>(scomp);
        students.add(new Students(2,"anaj",6));
        students.add(new Students(3,"nhfj",8));
        students.add(new Students(2,"kreej",5));
        students.add(new Students(1,"adky",9));
        students.add(new Students(3,"bdkd",10));
        students.add(new Students(1,"klsdjk",7));
        groupPrint(students,1);

    }


     static void groupPrint(TreeSet <Students> o,int group){
        System.out.println("Список студентов группы "+group);
int mgrad=0;
int countst=0;
        for (Students s:o){
            if(s.getGroup()==group){
                System.out.println(s.getGroup()+" "+s.getName()+" "+s.getGrade());
                mgrad+=s.getGrade();
                countst++;
            } }
            System.out.println("Средний балл: "+mgrad/countst);

    }

}