package obstacle;

import member.Member;

public abstract class Obstacle {
    protected String name;

    public Obstacle(String name) {
        this.name = name;
    }

    public abstract boolean overcome(Member member);
}
