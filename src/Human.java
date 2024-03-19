public abstract class Human extends Animal {
    String name;

    public abstract void learnOOP();
}

class Girl extends Human {

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void sex() {

    }

    @Override
    public void learnOOP() {

    }
}

class Boy extends Human {
    @Override
    public void eat() {
        System.out.println("Eating Pizza");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void sex() {

    }

    public void flirtGirls() {
        System.out.println("Making chuuuus");
    }

    @Override
    public void learnOOP() {

    }
}
