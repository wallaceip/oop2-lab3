package exercise2;

public class Cat implements IAnimal {
    private String name;
    private int height;
    private String color;
    private int age;

    public Cat(String name, int height, String color, int age) {
        this.name = name;
        this.height = height;
        this.color = color;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Cat eats mice");
    }

    @Override
    public String cry() {
        return "Meow!";
    }
}

