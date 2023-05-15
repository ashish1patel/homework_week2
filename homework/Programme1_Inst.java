package homework;

public class Programme1_Inst {
    /**
     * 1.1 Declare two instance variables.
     * 1.2 Declare one instance method.
     * 1.3 Call both instance variables into the instance method inside the print statement.
     * 1.4 Declare the Main method.
     * 1.5 Call the above instance method into the Main method and Run the programme.
     */
    int a = 5;
    int b = 10;//1.1
    public void m1(){//1.2
        System.out.println(a);
        System.out.println(b);//1.3


    }

    public static void main(String[] args) {//1.4
      Programme1_Inst obj = new Programme1_Inst();//1.5
      obj.m1();//1.5
    }

}
