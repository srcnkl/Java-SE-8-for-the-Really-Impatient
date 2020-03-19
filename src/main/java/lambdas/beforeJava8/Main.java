package main.java.lambdas.beforeJava8;

public class Main {
    public static void main(String args []){
        LambdaApp lambdaApp= new LambdaApp();
        int resutl = lambdaApp.fonk(5, 4, new Anonim() {
            @Override
            public int call(int a, int b) {
                return a + b;
            }
        });
        System.out.println(resutl);
    }
}

interface Anonim{
    public int call(int a , int b);
}

class LambdaApp{
    public int fonk(int a , int b , Anonim anonim){
        return anonim.call(a,b)*2;
    }
}


