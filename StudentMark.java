public class StudentMark {
    private String student;
    private float gradeMath;
    private float gradePhysics;


    public StudentMark(String n, float m, float p) {
        this.student = n;
        this.gradeMath = m;
        this.gradePhysics = p;
    }

    public String getStudent() {
        return this.student;
    }

    public float getGradeMath() {
        return this.gradeMath;
    }

    public float getGradePhysics() {
        return this.gradePhysics;
    }
}
