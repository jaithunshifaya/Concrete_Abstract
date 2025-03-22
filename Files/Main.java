import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Subject java = new Subject("java",3.0);
        Subject javascript = new  Subject("javascript",3.0);
        ClassroomCourse javaClassroom = new ClassroomCourse(java,"Mark", 1000,"Cambridge","winter");
        ClassroomCourse jsClassroom = new ClassroomCourse(javascript, "paul",1200,"oxford","summer");
        OnlineCourse javaOnline = new OnlineCourse(java, "Anna",800,10,5);
        OnlineCourse jsOnline = new OnlineCourse(javascript,"Emma",900,8,6);
        System.out.println("Available class ");
        System.out.println("1. java classroom");
        System.out.println("2.java online");
        System.out.println("3. javascript classroom");
        System.out.println("4.javascript online");
        System.out.println("Enter course code");
        int courseCode = scanner.nextInt();
        Course selectedCourse=null;

        switch(courseCode){
            case 1:
                selectedCourse=javaClassroom;
                break;
            case 2:
                selectedCourse=javaOnline;
                break;
            case 3:
                selectedCourse=jsClassroom;
                break;
            case 4:
                selectedCourse=jsOnline;
                break;
            default:
                System.out.println("Invalid course code");
                break;
        }
        scanner.nextLine();
        if(selectedCourse !=null) {
            System.out.println("Enter learner name");
            String learnerName = scanner.nextLine();
            Learner learner = new Learner(learnerName, selectedCourse);

            System.out.println("Enter assignment marks (max " + (selectedCourse instanceof OnlineCourse ? "30" : "100") + "):");
            int assignmentMarks = scanner.nextInt();
            System.out.println("Enter quiz marks (max" + (selectedCourse instanceof OnlineCourse ? "10" : "30") + "):");
            int quizMarks = scanner.nextInt();

            learner.assignmentScore(assignmentMarks);
            learner.quizScore(quizMarks);

            double gradeScore = learner.calculateGrade();
            System.out.println("Grade score:" + gradeScore);
            if (gradeScore >= 5) {
                System.out.println("Congrats" + learner.getName() + ".you have successfully passed the " + selectedCourse.getSubject() + "course.");
            } else {
                System.out.println("Sorry" + learner.getName() + ".you have completed the course but did not pass.");
            }
        }

         scanner.close();
    }
}