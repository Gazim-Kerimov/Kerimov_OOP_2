public abstract class DomesticAnimal extends Animal {

    private Human owner;


    public DomesticAnimal(String name) {
        super(name);
    }

    public void setOwner(Human owner){
        this.owner = owner;
        System.out.println(owner.name + " стал хозяином " + this.getAnimalType() + " " + this.getName());
    }
    public Human getOwner(){
        return this.owner;
    }

}
