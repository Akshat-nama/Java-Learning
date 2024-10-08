package staticExamples;

public class StaticBlock {
    static int a = 4;
    static int b;


    //This will only called once when the main function runs
    static {
        System.out.println("Hi I am in a static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock s1 = new StaticBlock();
        System.out.println("Value of a " +StaticBlock.a + " and b " +StaticBlock.b);

        StaticBlock s2 = new StaticBlock();
        StaticBlock.b = b+3;

        System.out.println("Value of a " +StaticBlock.a + " and b " +StaticBlock.b);


    }
}
