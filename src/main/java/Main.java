public class Main {
    public static void main(String[] args) {
        Dog lolo = new Dog("Lolo", 7, "Emmy");
        Cat coco = new Cat("Coco", 14);
        Toy robot = new Toy("Robot");

        lolo.play();
        coco.play();
        robot.play();

        Toy toy = new Toy("Lego");
        Action[] family = new Action[]{lolo, coco, robot};
        for (int i = 0; i < family.length; i++) {
            family[i].play(toy);
        }
    }
}
