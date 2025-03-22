
public class Learner implements Assessments {

    public String name;
    public Course course;
    private double gradeScore;
    public Learner(String name, Course course){
        this.name=name;
        this.course=course;

    }
    public void assignmentScore(int marks){
        course.setAssignmentMarks(marks);
    }
    public void quizScore(int marks){
        course.setQuizMarks(marks);
    }


    public double calculateGrade() {
        int maxAssignmentMarks=course instanceof OnlineCourse ? 30:100;
        int maxQuizMarks= course instanceof OnlineCourse ? 10:30;
        double assignmentScore=(double) course.getAssignmentMarks()/maxAssignmentMarks*10;
        double quizScore=(double) course.getQuizMarks()/maxQuizMarks*10;
        this.gradeScore=(assignmentScore+quizScore)/2;

        return this.gradeScore;
    }
    public String getName(){

        return name;
    }
    public double getGradeScore(){

        return gradeScore;
    }
    public  Course getCourse(){
        return course;
    }

}
