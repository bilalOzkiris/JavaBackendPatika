public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ali", "0954863154", "MAT");
        Teacher t2 = new Teacher("Ayşe", "0954863154", "TRH");
        Teacher t3 = new Teacher("Ayça", "0954863154", "FZK");

        Course math = new Course(t1, "Math", "MAT", "MAT101", 0.6, 0.4);
        Course history = new Course(t2, "History", "TRH", "TRH101", 0.6, 0.4);
        Course physics = new Course(t3, "Physics", "FZK", "FZK101", 0.6, 0.4);

        Student s1 = new Student("İnek Şaban", "01", "4", math, physics, history);
        s1.addBulkExamNote(80, 70, 55);
        s1.addBulkOralExamNote(65, 89, 100);
        s1.calculateAverage();
        s1.checkIsPass();
        System.out.println(s1.toString());

        Student s2 = new Student("Güdük Necmi", "02", "4", math, physics, history);
        s2.addBulkExamNote(90, 60, 75);
        s2.addBulkOralExamNote(20, 65, 100);
        s2.calculateAverage();
        s2.checkIsPass();
        System.out.println(s2.toString());

        Student s3 = new Student("Damat Ferit", "03", "4", math, physics, history);
        s3.addBulkExamNote(25, 45, 54);
        s3.addBulkOralExamNote(65, 45, 100);
        s3.calculateAverage();
        s3.checkIsPass();
        System.out.println(s3.toString());

    }
}
