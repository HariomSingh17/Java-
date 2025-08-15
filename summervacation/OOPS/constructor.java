package summervacation.OOPS;
// function that can be used to set the value at time of initilization and name should be same as clss name
class students{
     String name ;
    int roll;
    public students(String naam , int rollno){// perfect constructor
         name= naam;
        roll = rollno;
    }

}
public class constructor {
    public static void main(String[] args) {
        students s1 = new students("Hariom",90);
        System.out.println(s1.name);
        System.out.println(s1.roll);
    }
     
}
