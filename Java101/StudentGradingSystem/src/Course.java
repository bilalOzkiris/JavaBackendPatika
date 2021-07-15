public class Course {
    Teacher teacher;
    String name;
    String prefix;
    String code;
    int examNote;
    int oralExamNote;
    double examRate;
    double oralExamRate;

    public Course() {
    }

    public Course(Teacher teacher, String name, String prefix, String code, double examRate, double oralExamRate) {
        this.teacher = teacher;
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        this.examNote = 0;
        this.oralExamNote = 0;
        this.examRate = examRate;
        this.oralExamRate = oralExamRate;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getExamNote() {
        return examNote;
    }

    public void setExamNote(int examNote) {
        this.examNote = examNote;
    }

    public int getOralExamNote() {
        return oralExamNote;
    }

    public void setOralExamNote(int oralExamNote) {
        this.oralExamNote = oralExamNote;
    }

    public double getExamRate() {
        return examRate;
    }

    public void setExamRate(double examRate) {
        this.examRate = examRate;
    }

    public double getOralExamRate() {
        return oralExamRate;
    }

    public void setOralExamRate(double oralExamRate) {
        this.oralExamRate = oralExamRate;
    }

    @Override
    public String toString() {
        return "Course{" +
                "teacher=" + teacher +
                ", name='" + name + '\'' +
                ", prefix='" + prefix + '\'' +
                ", code='" + code + '\'' +
                ", examNote=" + examNote +
                ", oralExamNote=" + oralExamNote +
                ", examRate=" + examRate +
                ", oralExamRate=" + oralExamRate +
                '}';
    }
}
