package Limbs;

public abstract class Limb {
    public String name;
    public int health;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        Limb limb = (Limb) o;
        return 0 < limb.health;
    }

}

