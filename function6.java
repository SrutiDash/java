public class function6 {
    public static void main(String[] args) {
        String message = myMessage();
        System.out.println("Your message is : "+message);
        String personalMessage = myPersonalMessage("sruti");
        System.out.println("Your message is : "+personalMessage);
    }
    
    static String myMessage(){
        String mess = "Hi, How are you?";
        return mess;
    }

    //we can have multiple methods in a class
    //we can pass the argument and return it

    static String myPersonalMessage(String name){
        String mess = "Hii "+name;
        return mess;
    }

}
