public class Cat extends DomesticAnimal{

    public Cat(String name) {
        super(name);
    }


    public void walk(Human human) {
        System.out.println(this.getName() + " подошел поближе");
        voice(human);
    }


    public void voice(Human human) {
        if(human == this.getOwner()){
            System.out.println(this.getName() + " узнал своего владельца и замурчал \"Мурр\"");
        }
        else System.out.println(human.name + " не хозяин кота. " + this.getName() + " зашипел \"Шшшш\"");
    }

    @Override
    public void voice() {
        System.out.println("Мяу-мяу");
    }

    @Override
    public String getAnimalType() {
        return "кот";
    }

}
