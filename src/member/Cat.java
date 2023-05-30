package member;

public class Cat extends Member{

    public Cat(String name) {
        super(name, 200, 1);
    }

    public void run() {
        System.out.println("Cat " + name + " run.");
    }

    public void jump() {
        System.out.println("Cat " + name + " jump.");
    }

}
