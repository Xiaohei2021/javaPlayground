import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();

        std1.name = "Joe";
        std1.age = 12;
        std1.grade = "8th Grade";

        std2.name = "Alice";
        std2.age = 16;
        std2.grade = "10th Grade";

        std3.name = "Sarah";
        std3.age = 8;
        std3.grade = "3rd Grade";

        bar(std2);
        bar(std1);
        bar(std3);
    }

    static void bar(Student std){
        System.out.println(std.name + " is a student at Robert Frost middle school. The student is " + std.age + " years old and is in "+ std.grade );
    }


}