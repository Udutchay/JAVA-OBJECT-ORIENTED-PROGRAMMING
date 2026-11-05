//exercise 4.2
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student("Princess", 75);
        try {
            s.setScore(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught unexpected error: " + e.getMessage());
        }

        try {
            s.setScore(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}