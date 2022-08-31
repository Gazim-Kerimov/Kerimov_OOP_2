import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Human john = new Man("Джон", 25);
        DomesticAnimal barsik = new Cat("Барсик");
        Animal sharkhan = new Tiger("Шархан");
        Dog sharik = new Dog("Шарик");
        ArrayList<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(barsik);
        listOfAnimals.add(sharkhan);
        listOfAnimals.add(sharik);
        john.walk();
        for(int i = 0; i < listOfAnimals.size(); i++){
            if(listOfAnimals.get(i) instanceof DomesticAnimal){
                ((DomesticAnimal) listOfAnimals.get(i)).setOwner(john);
            }
            else john.callAPet(listOfAnimals.get(i));
        }


    }
}
