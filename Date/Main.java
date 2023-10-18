package Date;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        test3();
    }

    public static void test1() {
        Student student1 = new Student("1","1","1","1.1.1",111L);
        Student student2 = new Student("2","2","2","2.2.2",222L);
        Student student3 = new Student("3","3","3","3.3.3",333L);
        Student student4 = new Student("4","4","4","4.4.4",444L);
        Teacher teacher5 = new Teacher("5","5","5","5.5.5",5L);
        List<Student> studentList = new ArrayList<>(List.of(new Student[]{student4, student2, student1, student3}));
        StudentGroupIterator sgi = new StudentGroupIterator(studentList);

//        sgi.next();
//        sgi.remove();
//        sgi.zeroCounter();
        StudentGroup studentGroup = new StudentGroup(studentList, teacher5);
        for (Student i: studentGroup) {
            System.out.println(i);
        }
//        while (sgi.hasNext()){
//            System.out.println(sgi.next());
//        }
    }
    public static void test3(){
        Student student1 = new Student("1","1","1","1.1.1",111L);
        Student student2 = new Student("2","2","2","2.2.2",222L);
        Student student3 = new Student("3","3","3","3.3.3",333L);
        Student student4 = new Student("4","4","4","4.4.4",444L);
        Teacher teacher5 = new Teacher("5","5","5","5.5.5",5L);
        List<Student> studentList = new ArrayList<>(List.of(new Student[]{student4, student2, student1, student3}));
        for (Student i: studentList) {
            System.out.println(i);
        }
        System.out.println("_____________________________________________");
        Collections.sort(studentList);
        for (Student i: studentList){
            System.out.println(i);
        }
    }
}
