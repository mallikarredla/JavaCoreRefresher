package main.java.com.mallik.BasicConcepts;

public class StudentGrade {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int  grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade>0&& grade<100) this.grade=grade;

    }
    public static void main(String[] args){
        StudentGrade grade1=new StudentGrade();
        grade1.setGrade(87);
        grade1.setName("Mallikarjuna ");
        System.out.println(grade1.getName() + " Grade is " +grade1.getGrade());
    }
}

