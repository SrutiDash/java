public class changeNameFunction {
    public static void main(String[] args) {
        String name = "dash";
        yourName(name);
        System.out.println(name); //this will print dash not sruti
        //as Java passes objects like Strings by value, and since String is immutable, changing myName inside the method doesn't affect name in main
    }

    static void yourName(String myName){
        myName = "sruti"; 
    }

    //so instead of this we can use like this :

}

