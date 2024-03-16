class MyOopApp {
    public static void main(String[] args) {
        // dataType id = value;
        // Class id = new ClassConstructor();

        Person p1 = new Person("Damsel", "Female"); // { name = "" }

        System.out.println("Object = " + p1); // toString()
        System.out.println("Name = " + p1.getName());
        System.out.println("Gender = " + p1.getGender());

        p1.setGender("M");
        System.out.println("Object = " + p1);

        Person p2 = new Student();
        p2.setName("Ely");
        p2.setGender("Male");
        System.out.println(p2.toString());


        // ERROR HANDLING
        try {
            System.out.println("A + n = " + getSomething(27));
        } catch(ArithmeticException ex2) {
            System.out.println("Exception ex2 = " + ex2);
        } catch(Exception ex) {
            System.out.println("Exception ex = " + ex);
        } finally {
            System.out.println("Finally");
        }
    }


    // Method
    // AccessModifier ReturnType MethodName(Param1DataType Param1Name, ..., ParamNDataType ParamNName) throws Exception1, ExceptionN {
    //   MethodBody
    // }
    public static double getSomething(int n) throws Exception, ArithmeticException {
        if (n < 0) {
            throw new Exception();
        } else if(n > 26) {
            throw new ArithmeticException();
        } else {
            return 'A' + n; // 'A' => 65 + 3 = 68 => 68.0
        }
    }
}