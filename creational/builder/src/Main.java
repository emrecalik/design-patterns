public class Main {
    public static void main(String[] args) {
        Student student = new Student.Builder()
                .firstName("Emre")
                .lastName("Calik")
                .build();
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
    }
}
