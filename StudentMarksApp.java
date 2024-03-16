public class StudentMarksApp {
    public static void main(String[] args) {
        // String[] names = new String[3];
        // names[0] = "Jane";
        // names[1] = "Jon";
        // names[2] = "Stewart";

        // int[] mathGrades = new int[3];
        // mathGrades[0] = 40;
        // mathGrades[1] = 70;
        // mathGrades[2] = 80;

        // int[] physicsGrades = new int[3];
        // physicsGrades[0] = 20;
        // physicsGrades[1] = 60;
        // physicsGrades[2] = 75;

        // System.out.format("%-20s %8s %8s%n", "STUDENT", "MATH", "PHYSICS");
        // System.out.format("%-20s %8d %8d%n", names[0], mathGrades[0], physicsGrades[0]);
        // System.out.format("%-20s %8d %8d%n", names[1], mathGrades[1], physicsGrades[1]);
        // System.out.format("%-20s %8d %8d%n", names[2], mathGrades[2], physicsGrades[2]);



        StudentMark[] sms = new StudentMark[4];
        sms[0] = new StudentMark("Jane", 40, 20);
        sms[1] = new StudentMark("Jon", 70, 60);
        sms[2] = new StudentMark("Stewart", 80, 75);

        System.out.format("%-20s %8s %8s%n", "STUDENT", "MATH", "PHYSICS");
        for (int i = 0; i < sms.length; i++) {
            System.out.format("%-20s %8.2f %8.2f%n", sms[i].getStudent(), sms[i].getGradeMath(), sms[i].getGradePhysics());
        }        
    }
}
