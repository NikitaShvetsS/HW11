package member;

import obstacle.Obstacle;

public abstract class Member {
    public String name;
    public double maxRunDistance;
    public double maxJumpHeight;

    public Member(String name, double maxRunDistance, double maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public abstract void run();

    public abstract void jump();

    public boolean overcome(Obstacle obstacle) {
        return obstacle.overcome(this);
    }
}
