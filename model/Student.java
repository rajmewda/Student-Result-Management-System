package StudentResultManagement.model;


public class Student extends Person {
   private int rollNumber;
    private int[] marks;
    private int total;
    private double percentage;
    private String grade;

    // Constructor
    public Student(int id, String name, int rollNumber, int numberOfSubjects) {
        super(id, name);   
        this.rollNumber = rollNumber;
        this.marks = new int[numberOfSubjects];  
    }
    public void setmarks(int[] marks){
       this.marks=marks;
    }
    public void calculateTotal(){
        total=0;
        for(int mark:marks){

            total+=mark;
        }
    }
     public void calculatePercentage() {
        percentage = (double) total / (marks.length * 100) * 100;
    }
    public void gradeCalculate(){
        if(percentage>=90){
            grade="A";

        }
        else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }


    }
      public void displayResult() {
        displayBasicInfo();  // from Person class
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
    public int getRollnumber(){
        return this.rollNumber;
    }
   
    
}
