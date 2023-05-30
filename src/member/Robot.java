package member;

public class Robot extends Member{

    public Robot(String name) {
        super(name, 500, 3);
    }
    public void run() {
        System.out.println("Robot " + name + " run.");
    }

    public void jump() {
        System.out.println("Robot " + name + " jump.");
    }

}
