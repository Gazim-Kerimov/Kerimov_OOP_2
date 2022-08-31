public abstract class Human implements Speak{
    String name;
    int age;
    char sex;


    public void walk() {
        System.out.println(this.name + " пошел на прогулку");
    }

    public void callAPet(Animal animal) {
        System.out.println(this.name + " говорит: ");
        if(animal.friendly()){
            System.out.println("\"" + animal.getAnimalType() + " " + animal.getName() + " ,иди сюда\"");
            animal.walk(this);
        }
        else System.out.println("\"Этот " + animal.getAnimalType() + " не дружелюбный, не стану его звать\"" );

    }

}
