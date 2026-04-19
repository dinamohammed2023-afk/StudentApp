public class Main {
    public static void main(String[] args) {

        System.out.println("=== Student App ===");

        Student s1 = new Student("Dina", 60);
        StudentService service = new StudentService();

        String result = service.checkResult(s1);

        System.out.println("Student: " + s1.getName());
        System.out.println("Result: " + result);
    }
}