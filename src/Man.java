public class Man extends Human{
    char sex = 'М';
    public Man(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void introduce() {
        System.out.println("Привет! Меня зовут " + this.name + " и мне " + this.age + " лет");
    }

}
