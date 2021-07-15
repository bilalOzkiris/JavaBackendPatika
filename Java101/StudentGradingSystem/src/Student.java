public class Student {
    String name;
    String studentNumber;
    String grade;
    Course math;
    Course physics;
    Course history;
    double average;
    boolean isPass;

    public Student() {
    }

    public Student(String name, String studentNumber, String grade, Course math, Course physics, Course history) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.grade = grade;
        this.math = math;
        this.physics = physics;
        this.history = history;
        this.average = 0.0;
        this.isPass = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Course getMath() {
        return math;
    }

    public void setMath(Course math) {
        this.math = math;
    }

    public Course getPhysics() {
        return physics;
    }

    public void setPhysics(Course physics) {
        this.physics = physics;
    }

    public Course getHistory() {
        return history;
    }

    public void setHistory(Course history) {
        this.history = history;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }

    public void addBulkExamNote(int n1, int n2, int n3) {
        if (n1 >= 0 && n1 <= 100)
            this.math.setExamNote(n1);
        if (n2 >= 0 && n2 <= 100)
            this.physics.setExamNote(n2);
        if (n3 >= 0 && n3 <= 100)
            this.history.setExamNote(n3);
    }

    public void addBulkOralExamNote(int oralN1, int oralN2, int oralN3) {
        if (oralN1 >= 0 && oralN1 <= 100)
            this.math.setOralExamNote(oralN1);
        if (oralN2 >= 0 && oralN2 <= 100)
            this.physics.setOralExamNote(oralN2);
        if (oralN3 >= 0 && oralN3 <= 100)
            this.history.setOralExamNote(oralN3);
    }

    public void calculateAverage() {
        this.average = (
                this.math.getExamNote() * this.math.getExamRate() +
                this.math.getOralExamNote() * this.math.getOralExamRate() +
                this.physics.getExamNote() * this.physics.getExamRate() +
                this.physics.getOralExamNote() * this.physics.getOralExamRate() +
                this.history.getExamNote() * this.history.getExamRate() +
                this.history.getOralExamNote() * this.history.getOralExamRate()
        ) / 3.0;
    }

    public void checkIsPass() {
        this.isPass = this.average > 55;
    }

    @Override
    public String toString() {
        return "Student{" + "\n" + "\t" +
                "name='" + name + '\'' + "\n" + "\t" +
                "studentNumber='" + studentNumber + '\'' + "\n" + "\t" +
                "grade='" + grade + '\'' + "\n" + "\t" +
                "math=" + math + "\n" + "\t" +
                "physics=" + physics + "\n" + "\t" +
                "history=" + history + "\n" + "\t" +
                "average=" + average + "\n" + "\t" +
                "isPass=" + isPass + "\n" + "\t" +
                '}';
    }
}
