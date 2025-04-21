public class function7 {
    public static void main(String[] args) {
        String name = "dash";
        name = yourName(name); //re initialise the value using function
        System.out.println(name);  // Now it prints "sruti"
    }

    static String yourName(String myName){
        myName = "sruti"; 
        return myName;
    }
}
