public class Cat extends Animals{
    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("Cat " + name + " is punching dog's face.");
    }
    public void play(Toy toy){
        System.out.println("Cat " + name + " walks away from toy " + toy);
    }
}
