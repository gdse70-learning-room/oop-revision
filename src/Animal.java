enum Type {
    MAS, KOLA, MASKOLA
}

public abstract class Animal {
    Type type;

    public abstract void eat();
    public abstract void sleep();
    public abstract void sex();
}
