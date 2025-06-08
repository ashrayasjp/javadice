
public class method {
    public static void main(String[] args) {
        String name = "Ashraya";
        int age = 18;
        System.out.println("Main");
        Display(name);
    }

    static void Display(String name) {
        System.out.println("Display");
        System.out.printf("The name is %s", name);
    }
}
