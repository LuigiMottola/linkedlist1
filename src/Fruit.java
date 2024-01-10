public class Fruit {
    //parameter
    private String name;

    //constructor
    public Fruit(String name) {
        this.name = name;
    }

    //getter & setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //to String
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}