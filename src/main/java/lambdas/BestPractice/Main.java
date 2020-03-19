package main.java.lambdas.BestPractice;

import java.util.function.Function;

public class Main {
    public static  void main(String args []){
        Worker worker= new Worker();
        String result =worker.addString("Hello",(a)->a+ "Word");
        System.out.println(result);

        String resultWithFunc = worker.add("Hello",a->a+"Word Im Function interface");
        System.out.println(resultWithFunc);


        int[] total = new int[1];
        Runnable r = () -> total[0]++;

        for (int i =0;i<5;i++){
            r.run();
        }
        System.out.println(total[0]);


        Foo foo= a->a.toLowerCase();
        String res= foo.method("ABC");
        System.out.println(res);
    }
}

interface Foo{
    String method(String string);
}

class Worker {

    static String addString(String mainString, Foo foo){
        return  foo.method(mainString);
    }
    // instead of this java already provide this function with Function<T,R>  .
    public String add(String string, Function<String, String> fn) {
        return fn.apply(string);
    }
}
