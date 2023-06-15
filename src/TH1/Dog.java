package TH1;

public class Dog extends Animal{
    private String color;

    public Dog() {
    }

    public Dog(String name, String color) {
        // gọi constructor có tham số name ở lớp Animal
        super(name);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String makeSound(){
        return "Gâu Gâu";
    }
}
