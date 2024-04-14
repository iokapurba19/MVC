package academic.model;

/**
 * @author 12S22031 Ioka Purba
 */ 

public class Controller {

    Work run;

   public Controller() {
        run = new Work();
    }

    public void processCommand(String command) {
        String[] pecahan = command.split("#");

        switch (pecahan[0]) {
            case "course-add":
                run.addCourse(pecahan);
                break;
            case "course-open":
                run.openCourse(pecahan);
                break;
            case "course-history":
                run.showCourseHistory(pecahan[1]);
                break;
            case "student-add":
                run.addStudent(pecahan);
                break;
            case "enrollment-add":
                run.addEnrollment(pecahan);
                break;
            case "enrollment-remedial":
                run.markRemedial(pecahan);
                break; 
            case "lecturer-add":
                run.addLecturer(pecahan);
                break;
            case "enrollment-grade":
                run.updateEnrollmentGrade(pecahan);
                break;
            case "student-details":
                run.showStudentDetails(pecahan[1]);
                break;
            case "---":
                return;
            default:
                break;
        }
    }

    public void printData() {
        run.printData();
    }
    
}
