public class Dog extends Animals {
    private String owner;

    public Dog(String name, int age, String owner){
        super(name, age);
        this.owner = owner;
    }

    public void play(){
        System.out.println("Dog " + name + " is chasing its tail");
    }
    public void play(Toy toy){
        System.out.println("Dog " + name + " wants to play with toy " + toy);
    }
}
