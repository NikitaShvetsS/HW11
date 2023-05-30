package member;

public class Human extends Member{

    public Human(String name) {
        super(name, 150, 1.4);
    }

    public void run() {
        System.out.println("Human " + name + " run.");
    }

    public void jump() {
        System.out.println("Human " + name + " jump.");
    }

}
