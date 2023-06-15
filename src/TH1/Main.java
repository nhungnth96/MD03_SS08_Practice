package TH1;

public class Main {
    public static void main(String[] args) {
        // khởi tạo đối tượng từ các lớp
        Animal animal = new Animal("Pig");
        Dog dog1 = new Dog ("Poodle","brown");
        Dog dog2 = new Dog("Pug","Beige");
        Cat cat = new Cat("Miu");
        // get set
        System.out.println("The animal's name is "+animal.getName()); // Pig
        animal.setName("Chicken");
        System.out.println("The animal's name is "+animal.getName()); // Chicken
        dog1.setName("Corgi");
        // truy cập phương thức được kế thừa từ lớp cha
        System.out.println("Name: "+dog1.getName()); // Corgi
        System.out.println("Sound: "+dog1.makeSound()); // Gau gau
        System.out.println("Color: "+dog2.getColor()); // Beige
        System.out.println("Sound: "+dog2.makeSound()); // Gau Gau
        System.out.println("Name: "+cat.getName()); // Miu
        System.out.println("Sound: "+cat.makeSound()); // Meo meo
    }
}
