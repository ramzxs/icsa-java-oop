import javax.swing.SwingConstants;

public class Student extends Person { //  implements Interface1, InterfaceN

    // Student@MemoryAddress
    @Override
    public String toString() {
        return "Student { name = " + this.getName() + " }";
    }
}
