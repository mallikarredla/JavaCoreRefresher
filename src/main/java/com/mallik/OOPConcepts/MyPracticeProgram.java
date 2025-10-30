package main.java.com.mallik.OOPConcepts;

 class School {
  
     void gateOpen(){
         System.out.println("The school gates are open");
     }

}
class Staff extends School {

     void TakeAttendence(){
         School school=new School();
         school.gateOpen();
         System.out.println("teachers takes the attendence of students");
     }
}
public class MyPracticeProgram{
    public static void main(String[] args) {
        Staff staff=new Staff();
        staff.TakeAttendence();

    }

}