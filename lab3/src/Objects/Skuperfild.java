package Objects;

import Headdress.Cylinder;
import Headdress.Headdress;
import Limbs.Arms;
import Limbs.Head;
import Limbs.Ribs;

import java.util.Arrays;
import java.util.Objects;

public class Skuperfild{
    public Ribs ribs = new Ribs(100);
    public Cylinder cylinder = new Cylinder(true);
    public Head head = new Head(100);
    public Arms arms = new Arms(100);
    public static boolean confuse = false;

    private boolean haveWish;
    public boolean getHaveWish(){
        return haveWish;
    }
    public void setHaveWish(boolean haveWish) {
        this.haveWish = haveWish;
    }
    public void fall(){
        ribs.setHealth((int) ((ribs.getHealth()) - Math.random() *50));
        head.setHealth((int) ((head.getHealth()) - Math.random() *50));
        arms.setHealth((int) ((arms.getHealth()) - Math.random() *50));
        Headdress.onHead = false;
        cylinder.setPosition("Цилиндр на земле");
        cylinder.setPurity(Arrays.toString(Trash.values()));
        System.out.println("Цилиндр испачкан в " + cylinder.getPurity());
        System.out.println("Скуперфилд упал");


    }

    public void checkHealth(){
        if (ribs.health <= 0){
            System.out.println("Сломаны ребра");
        }
        else if (head.health <= 0){
            System.out.println("Сильно ударился головой");
        }
        else if (arms.health <= 0){
            System.out.println("Сломана рука");
        }
        else {
            System.out.println("Скуперфилд в порядке");
        }
//        System.out.println(ribs.health);
//        System.out.println(head.health);
//        System.out.println(arms.health);

    }
    public void findHeaddress(){
        if (Headdress.onHead){
            System.out.println("Цилиндр на голове");
        }
        else {
            System.out.println(cylinder.getPosition());
        }

    }
    public void clearCylinder(){
        if (cylinder.getPurity() == "Чистый"){
            System.out.println("Цилиндр чист");
        }
        else {
            System.out.println("Цилиндр очищен от " + cylinder.getPurity());
            cylinder.setPurity("Чистый");
        }

    }

    public void lookAround() {
        System.out.println(Sky.vision);
    }
}
