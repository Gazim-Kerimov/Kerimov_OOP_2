public abstract class Animal implements CanWalk, Voice, IsFriendly{
    private String name;
    private String animalType;
    private Human owner;
    public Animal(String name){
        this.name = name;
    }

    @Override
    public boolean friendly() {
        return true;
    }

    public Human getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }
}
