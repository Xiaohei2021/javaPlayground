import org.w3c.dom.css.Rect;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*public static void main(String[] args){
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
    }*/

    /*public static void main(String[] args){
        Door driverDoor = new Door();
        driverDoor.open();
        driverDoor.name = "Drivers";
        driverDoor.printStatus();

        Door passDoor = new Door();
        passDoor.name = "Passenders";
        passDoor.open();
        passDoor.printStatus();
        driverDoor.close();
        driverDoor.printStatus();

        /*if (driverDoor.isOpen){
            System.out.println("Driver's Door is open");
        }
        else{
            System.out.println("Driver's Door is Closed");
        }
    }*/

    /*public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.setHeight(5);
        rect1.setWidth(9);
//        rect1.setHeight(2);
//        rect1.setWidth(5);


        Rectangle rect2 = new Rectangle();
        rect2.setHeight(8);
        rect2.setWidth(4);

        System.out.println("rect1 Height:" + rect1.getHeight());
        System.out.println("The area of the rectangle is:" + rect1.getArea());
        System.out.println("The perimeter of the rectangle is:" + rect1.getPerimeter());


    }*/

    /*public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(7,9);

        Rectangle rect2 = new Rectangle(8,4);

        System.out.println("rect1 Height: " + rect1.getHeight() + ", "+ "rect1 Width:" + rect1.getWidth() );
        System.out.println("rect2 Height: " + rect2.getHeight() + ", "+ "rect2 Width:" + rect2.getWidth() );


    }*/
    /*public static void main(String[] args) {
        String[] sa = new String[5];

        sa[0]="toaster";
        sa[1]="fridge";
        sa[2]="kettle";
        System.out.println(sa[2]);

        ArrayList<String> sal = new ArrayList<>();
        sal.add("toaster");
        sal.add("fridge");
        sal.add("kettle");
        sal.indexOf("kettle");
        sal.contains("fridge");
        System.out.println(sal.get(1));
        sal.set(1, "microwave");
        System.out.println(sal.size());
        sal.clear();

    }*/

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Joe Bloggs");
        student.setDateOfBirth("12/06/1990");
        student.setStudentHousing(true);
        student.setCourse (new Course());
        student.getCourse().setTitle("computer Science")  ;
        student.getCourse().setLevel("undergraduate")  ;
        student.getCourse().setStartDate("02/15/2023");

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student DOB: " + student.getDateOfBirth());
        System.out.println("Has Housing: " + (student.getStudentHousing() ?"Yes": "NO"));
        System.out.println("The Student: " + student.getName() + " is a" + student.getCourse().getLevel() + "and is enrolled in the " + student.getCourse().getTitle() + " major that is staring on "+ student.getCourse().getStartDate());


    }

}