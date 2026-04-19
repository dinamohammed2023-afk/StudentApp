public class StudentService {

    public String checkResult(Student s) {
        if (s.getMarks() >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}