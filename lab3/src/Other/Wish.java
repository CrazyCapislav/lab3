package Other;

import java.util.Objects;

public class Wish {
    private String target;
    private String idea;
    public void setTarget(String target) {
        this.target = target;
    }
    public String getTarget(){
        return target;
    }
    public Wish (String target, String idea){
        this.target = target;
        this.idea = idea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wish wish = (Wish) o;
        return Objects.equals(target, wish.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(target);
    }

    @Override
    public String toString() {
        return "Скуперфилда одолевает желание " + idea + " " + target +'.';
    }
}
