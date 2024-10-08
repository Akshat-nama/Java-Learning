package singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//       pattern.Pattern1 p1 = new pattern.Pattern1();
        //p1.rectanglePattern(4,5);
        //p1.hollowRectangle(5,10);
        //p1.halfPyramid(5,10);
        // p1.invertedHalfPyramid(4);
        //p1.invertedHalfPyramid180(5);
//        p1.halfPyramidWithNumbers(5);
        //p1.invertedHalfPyramidWithNumbers(5);
//        p1.butterflyPattern(4);

//        Human human1 = new Human("Akshat", 24);
//        Human human2 = new Human("Rahul", 25);
//
//        System.out.println(Human.population);
//        singleton.Main m1 = new singleton.Main();
//
//        m1.greeting();
//    }
//
//   void greeting() {
//        System.out.println("HI morning");
//    }

//        Box b1 = new Box(10, 20, 30);

//        System.out.println(b1.b);

    Singleton s1 = Singleton.getInstance();

        System.out.println("Hi this is the first time I have created object");

        Singleton s2 = Singleton.getInstance();

        System.out.println("2nd Time");

        System.out.println(s2.getClass());








    }
}
//
//class Human{
//
//    String name;
//    int age;
//    static int population;
//
//    Human(String name, int age){
//        super();
//        this.name = name;
//        this.age = age;
//        Human.population += 1;
//    }
//
//
//}