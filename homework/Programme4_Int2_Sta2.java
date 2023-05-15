package homework;

public class Programme4_Int2_Sta2 {
    /**
     * 4.1 Declare two instance and two static variables.
     * 4.2 Declare one instance method.
     * 4.3 Declare one static method.
     * 4.4 Call all four instance and static variables into both instance and static methods inside the
     * print statement.
     * 4.5 Declare the Main method.
     * 4.6 Call both instance and static methods into the Main method and run the programme.
      */
    int a = 5;//4.1
    int b = 10;//4.1
    static int c = 6;//4.1
    static int d = 12;//4.1
    public void a1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static void a2(){
        Programme4_Int2_Sta2 obj = new Programme4_Int2_Sta2();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(c);
        System.out.println(d);

    }

    public static void main(String[] args) {
        Programme4_Int2_Sta2 a3 = new Programme4_Int2_Sta2();
        a3.a1();
        a2();
    }
}
