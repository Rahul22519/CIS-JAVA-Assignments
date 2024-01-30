public class Methods {

    public static void sum() {
        System.out.println("it is staticmethod");
    }

    public void displaymethod() {
        System.out.println("it is dynamic method");
    }

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Methods.sum();
        Methods method = new Methods();
        method.displaymethod();


    }
}