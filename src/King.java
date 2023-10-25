public class King extends Characters{
    String name;

    public King(String name) {
        this.name = name;
    }

    @Override
    void display() {
        System.out.println("I am king");
    }

}
