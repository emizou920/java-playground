public class Toy implements Action{
    private String name;

    public Toy(String name){
        this.name = name;
    }
    public void play(){
        System.out.println("Toy " + name + " is watching cat and dog.");
    }
    public void play(Toy toy){
        System.out.println("Toy " + name + " tells dog his name is " + toy);
    }
    public String toString(){
        return name;
    }
}
