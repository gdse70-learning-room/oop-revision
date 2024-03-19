class Employee {
    int id;
    String name;
    static String ceoName;

    static {
        System.out.println("Static block");
    }
    {
        System.out.println("Instance block");
    }

}

public class Demo2 {
    public int[][] details = new int[5][2];

    public void abc() {
        details[0][0] = 2;
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.details[0][0] = 10;
    }
}
