enum Color {
    RED, GREEN, BLUE, YELLOW, PURPLE, BLACK
}

class Name {
    private String fName;
    private String mName;
    private String lName;

    public Name(String fName, String mName, String lName) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return fName + " " + mName + " " + lName;
    }
}

public class Alien extends Anonymous {  // Alien IS-A Anonymous
    private int id; //Instance Variable/ Class Varible
    private Name name;  //Alien HAS-A Name
    private Color color;   // type -> Color | Alien HAS-A Color

    //Insert compiler at compile time
    public Alien() {}   // default constructor

    // Values Injection
    public Alien(int id, Name name, Color color) {    // Parameterized constructor
        if(id < 0) throw new RuntimeException("Illegal Arguments");
        this.id = id;
        this.name = name;
        this.color = color;
    }
    public void setId(int id) {
        if(id < 0) {
            throw new RuntimeException("Illegal Arguments");
        }
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void killingPeoples() {
        String message = "brains";  // Local Variable
        System.out.println("Eat peoples " + message);
    }

    @Override
    public String toString() {  // Override from Object class
        return id + " " + name.toString() + " "  + color;
    }
}
