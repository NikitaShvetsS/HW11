package obstacle;

import member.Member;

public class Wall extends Obstacle{
    private double height;

    public Wall(String name, double height) {
        super(name);
        this.height = height;
    }

    public boolean overcome(Member member) {
        if (member.maxJumpHeight >= height) {
            System.out.println("Member " + member.name + " overcome wall " + height + " high.");
            return true;
        } else {
            System.out.println("Member " + member.name + " couldn't overcome wall " + height + " high.");
            return false;
        }
    }

}
