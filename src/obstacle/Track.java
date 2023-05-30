package obstacle;

import member.Member;

public class Track extends Obstacle{
    private double length;

    public Track(String name, double length) {
        super(name);
        this.length = length;
    }

    public boolean overcome(Member member) {
        if (member.maxRunDistance >= length) {
            System.out.println("Member " + member.name + " overcome track " + length + " long.");
            return true;
        } else {
            System.out.println("Member " + member.name + " couldn't overcome track " + length + " long.");
            return false;
        }
    }


}
