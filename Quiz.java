public class Quiz {
    private int id;
    private Student student;
    private int totalScore;
    private int maxScore;
  
    public Quiz(int id, Student student, int totalScore, int maxScore) {
      this.id = id;
      this.student = student;
      this.totalScore = totalScore;
      this.maxScore = maxScore;
    }
  
    public double grade() {
      return (double) this.totalScore / this.maxScore;
    }
  }

public class Student {
    //Data Members
    private String name;
    private String email;
    
    //Constructor
    public Student() {
        name = "Unassigned";
        email = "Unassigned";
    }

    //Returns the email of this student
    public String getEmail() {
        return email;
    }
    
    //Returns the name of this student
    public String getName() {
        return name;
    }
    
    //Assigns the email of this student
    public void setEmail(String address) {
        email = address;
    }
    
    //Assigns the name of this student
    public void setName(String studentName) {
        name = studentName;
    }
}
