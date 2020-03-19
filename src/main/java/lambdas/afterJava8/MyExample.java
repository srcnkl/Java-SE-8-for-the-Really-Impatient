package main.java.lambdas.afterJava8;

public class MyExample {
    public static void main(String args[]) {
        System.out.println(Calculate.call(2, 3, (a, b) -> a + b));
        System.out.println(Calculate.call(6, 3, (a, b) -> a * b));
        System.out.println(Calculate.call(2, 3, (a, b) -> a - b));
        System.out.println(Calculate.call(18, 3, (a, b) -> a / b));



        //another way
        System.out.println("---another way----");
        Calculate2 calculate2 = new Calculate2();
        int result =calculate2.subs.calcule(25,25);
        int result1 =calculate2.add.calcule(25,35);
        int result2=calculate2.multiple.calcule(25,4);
        int result3=calculate2.devide.calcule(25,5);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);



        MyFuncInterface myProcess =(a,b)->a*b;
        myProcess.calcule(2,5);



    }
}

interface MyFuncInterface {
    int calcule(int a, int b);
}

class Calculate {
    public static int call(int a, int b, MyFuncInterface myFuncInterface) {
        return myFuncInterface.calcule(a, b);
    }
}

class Calculate2{
    MyFuncInterface subs = (int a, int b)-> (a-b);
    MyFuncInterface add = (int a, int b)-> (a+b);
    MyFuncInterface multiple = (int a, int b)-> (a*b);
    MyFuncInterface devide = (int a, int b)-> (a/b);
}