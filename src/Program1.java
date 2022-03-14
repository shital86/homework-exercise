public class Program1 {
    int a = 123;//instance variable
    float b = 2.56f;//instance variable

    //main method
    public static void main(String[] args) {
        Program1 program1 = new Program1();
        System.out.println(program1.a);
        System.out.println(program1.b);
        program1.test();//instance method calling
    }

    //instance method
    void test() {
        //instance area
        System.out.println(a);
        System.out.println(b);
    }
}
