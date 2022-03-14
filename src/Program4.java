public class Program4 {
    double a = 12.5;
    double b = 20.66;//instance variables
    static int c = 10;
    static int d = 20;//static variables

    public static void main(String[] args) {
        Program4 program4 = new Program4();
        program4.test1();//instance method calling
        Program4.test2();//static method calling
    }

    //instance method
    public void test1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Program4.c);
        System.out.println(Program4.d);
    }

    //static method
    public static void test2() {
        Program4 program4 = new Program4();
        System.out.println(program4.a);
        System.out.println(program4.b);
        System.out.println(Program4.c);
        System.out.println(Program4.d);
    }

    {
    }
}
