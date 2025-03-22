abstract class Course {
    public Subject subject;
    private String instructor;
    private int fee;
    public int assignmentMarks;
    public int quizMarks;
    public Course(Subject subject,String instructor, int fee){
        this.subject=subject;
        this.instructor=instructor;
        this.fee=fee;
        this.assignmentMarks=0;
        this.quizMarks=0;
    }
    public int getFee() {
        return fee;
    }
    public void setFee(int fee) {
        this.fee = fee;
    }
    public void setAssignmentMarks(int assignmentMarks){
        this.assignmentMarks=assignmentMarks;
    }
    public void setQuizMarks(int quizMarks){
        this.quizMarks=quizMarks;
    }
    public int getAssignmentMarks(){
        return assignmentMarks;
    }
    public int getQuizMarks(){
        return quizMarks;
    }
    public Subject getSubject(){
        return subject;
    }
    public String getInstructor(){
        return instructor;
    }

}



