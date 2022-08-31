public class Tiger extends Animal{

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void walk(Human human) {
        System.out.println("Тигр медлено крадется к " + human.name);
        voice();
    }

    @Override
    public void voice() {
        System.out.println("\"Рррр\"");

    }

    @Override
    public boolean friendly() {
        return false;
    }

    @Override
    public String getAnimalType() {
        return "Тигр";
    }
}
