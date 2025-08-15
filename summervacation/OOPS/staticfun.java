package summervacation.OOPS;class car{
    String companyname;
    final String colour = "black";// once declared can't be changed
    static int noofcar;

}
// why do we use static class?
// In java , a class be defined as static only if it is a nested class( it defined another class) 

public class staticfun {
   static class justtry{
 int data;
 int rollno;
    }
    //we can use static variable without initilizing an object , because it's associated with class itself rather than any object of the class..
    public static void main(String[] args) {
        car.noofcar =45;
        System.out.println(car.noofcar);
        //use of static variable is  without initilizing an object we can use particular class oject
            justtry x = new justtry();
                 x.data=10;
            System.out.println(x.data);

    }

}
