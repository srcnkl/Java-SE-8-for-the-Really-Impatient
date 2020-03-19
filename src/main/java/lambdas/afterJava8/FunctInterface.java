package main.java.lambdas.afterJava8;

import java.util.ArrayList;


//Syntax:
//lambda operator -> body
//Zero parameter:
//() -> System.out.println("Zero parameter lambda");
//(p) -> System.out.println("One parameter: " + p);
//It is not mandatory to use parentheses, if the type of that variable can be inferred from the context
//Multiple parameters :
//(p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);

public interface FunctInterface {
    void abstractFun(int x);

    default void normalFun() {
        System.out.println("hello");
    }
}

class Test {
    public static void main(String args[]) {
        FunctInterface fun = (int x) -> System.out.println(2 * x);
        fun.abstractFun(5);
    }
}

class Test2 {
    public static void main(String args[]) {
        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        // Using lambda expression to print all elements
        // of arrL
        arrL.forEach(n -> System.out.println(n));

        // Using lambda expression to print even elements
        // of arrL
        arrL.forEach(n -> {
            if (n % 2 == 0) System.out.println(n);
        });
    }
}

