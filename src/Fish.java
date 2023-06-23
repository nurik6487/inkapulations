public class Fish {
    private String name;
    private int age;
    private String move;

    public Fish() {
    }

    public Fish(String name, int age, String move) {
        this.name = name;
        this.age = age;
        this.move = move;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return "Fish: " + "\n" +
                "name: " + name + "\n" +
                "age: " + age + "\n" +
                "move: " + move;
    }
}
