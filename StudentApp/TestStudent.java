public class TestStudent {
    public static void main(String[] args) {

        // Create a test student
        Student s = new Student("Test", 40);

        // Create service object
        StudentService service = new StudentService();

        // Check result
        String result = service.checkResult(s);

        // Simple test condition
        if (result.equals("Fail")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}