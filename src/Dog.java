public class Dog extends DomesticAnimal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void walk(Human human) {
        System.out.println(this.getName() + " подошел поближе");
        voice(human);
    }

    public void voice(Human human) {
        if(human == this.getOwner()){
            System.out.println(this.getName() + " узнал своего владельца и завилял хвостом");
            voice();
        }
        else System.out.println(human.name + " не хозяин собаки. " + this.getName() + " недружелюбно зарычал");
    }


    @Override
    public void voice() {
        System.out.println("\"Гав-гав\"");

    }

    @Override
    public String getAnimalType() {
        return "cобака";
    }
}
