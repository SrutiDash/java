public class functionOverloading {
    public static void main(String[] args) {
        num(22); //here we are passing the value then it will auto detect which method has to be executed
        num("sruti");
        //num(); //it cannot be empty
        //it will throw an error because at comoile time it wont decide which methoid it has to run
        //so it is ambigious
        //function/method overloading happens at compile time
    }

    static void num(int a){ //here method with similar name but different parameters are being used
        System.out.println(a);
    }

    static void num(String a){
        System.out.println(a);
    }

    //functions/methods with similar name
    //in wont depend on the return type tho
    //they can exists but the parameters needs to be different
}
