package Assignment6;

public class Message {
    public static void staticMethod() {
        System.out.println("it is staticmethod");
    }

    public void dynamicMethod() {
        System.out.println("it is dynamic method");
        System.out.println("it is dynamic method");
    }

    public static void main(String[] args) {
        Message.staticMethod();
        Message message = new Message();
        message.dynamicMethod();
    }
}
