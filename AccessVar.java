public class AccessVar {
    public static void methodA() {
        int variableA = 10; // Local variable in methodA

        // Call methodB and pass variableA as a parameter
        methodB(variableA);
    }

    public static void methodB(int value) {
        // Access the value of variableA passed as a parameter
        System.out.println("Value passed from methodA to methodB: " + value);
    }

    public static void main(String[] args) {
        methodA();
    }
}
