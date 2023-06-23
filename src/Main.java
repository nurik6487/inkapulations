public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Marc");
        dog.setAge(4);
        dog.setMove("run");
        System.out.println(dog);
        Cat cat = new Cat();
        cat.setName("Merkuriyu");
        cat.setAge(2);
        cat.setMove("jump");
        System.out.println(cat);
        Fish fish = new Fish();
        fish.setName("Moon");
        fish.setAge(6);
        fish.setMove("svim");
        System.out.println(fish);
        Popugai popugai = new Popugai();
        popugai.setName("Saturn");
        popugai.setAge(9);
        popugai.setMove("fly");
        System.out.println(popugai);
    }
}