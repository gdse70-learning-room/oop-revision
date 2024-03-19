public class Main {
    public static void main(String[] args) {
        // type inference
        var name = new Name("Sumana", "Jothi", "Pala");
        Alien a1 = new Alien(1, name, Color.GREEN);

        System.out.println(a1); //Alien@5ca881b5
    }
}
