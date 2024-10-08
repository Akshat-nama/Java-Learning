package singleton;

public class Singleton {


    private static Singleton instance;

    public static Singleton getInstance() {
    if(instance == null){
        instance = new Singleton();
        System.out.println("I got initialized first time");
        return instance;
    }
        System.out.println("I am using the previous instance");

        return instance;
    }



    }

