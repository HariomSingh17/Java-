package summervacation.OOPS;

import summervacation.hello;

class student{
        private String name;
        protected int rollno;
        public double perc;

       public String getname(){
             return name;
        }
        public void setname(String nam){
            this.name = nam;
        }
            }
public class access_modifier {
   public static void main(String[] args) {
        student s1= new student();
        //s1.name = " Hariom";
        s1.rollno =0;
        s1.perc =97.2;
        s1.setname("hello");
        System.out.println(s1.getname());
        System.out.println(s1.perc);
        System.out.println(s1.rollno);
    }

}
