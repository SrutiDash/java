public class shadow {
    static int a = 22;
    static int b = 33;
    static int c = 21;
    // here this int a is static because we cannot use object dependent thigs in object independent things
    // this int a can be accessable inside the class and can be used later on
    // it is static because psvm is also static as we're going to use it over main function/method
    public static void main(String[] args) {
        System.out.println("Your number before getting swapped : "+a+" "+b); //prints 22
        int a = 33;
        int b = 22;
        System.out.println(c);
        int c;

        // System.out.println(c); 

        // it will give the error as c is already defined over this scope but not been initialied yet
        // it wont use the value of c out side the scope because before printing  the c, int c has been decalred over this block of code
        // and as it has been declared before printing it will use the value of c that has been initialised here
        c = 31;
        System.out.println(c);
        // it will print the c that has been initialised here
        // creating local variables such that it can over shadow the varibles which were created before main method
        // this is called shadowing
        System.out.println("Your number after getting swapped : "+a+" "+b);
        printing(); //call printing function
        
    }

    static void printing(){
        System.out.println(a); //prints 22
        //it print 22 not 33 because it's using the value of a outside it's scope that is outside the entire block
        //as it has been defined ouside the main method there fore it's printing 22 bot 33
    }
}
