package main.java.lambdas.afterJava8;

public class Main {
    public static  void main(String args []){
        LambdaApp lambdaApp= new LambdaApp();
        int result =lambdaApp.fonk(2,3,(a,b)->(a+b));
        System.out.println(result);
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


