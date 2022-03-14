public class Program3 {
    int a = 10;//instance variable
    static int b = 20;//static variable

    public static void main(String[] args) {
        Program3 program3 = new Program3();
        program3.m1();//instance method calling
        Program3.m2();//static method calling
    }

    //instance method
    public void m1() {
        System.out.println(a);
        System.out.println(Program3.b);
    }

    //static method
    public static void m2() {
        Program3 program3 = new Program3();
        System.out.println(program3.a);
        System.out.println(Program3.b);
    }


}

