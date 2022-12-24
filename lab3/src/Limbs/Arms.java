package Limbs;

import Headdress.Headdress;

public class Arms extends Limb{
    //Вложенные нестатические
    private class LeftArm{
        public void moveLeftArm(){
            System.out.println("Левая рука переместилась ");
        }


    }
    private class RightArm{
        public void moveRightArm(){
            System.out.println("Правая рука переместилась ");
        }
    }
    public void moveArms(String position){
        LeftArm leftArm = new LeftArm();
        leftArm.moveLeftArm();
        RightArm rightArm = new RightArm();
        rightArm.moveRightArm();
        System.out.println("Скуперфилд переместил руки" + position);

    };
    public void reposeHeaddress(){
        if (Headdress.onHead) {
            System.out.println("Цилиндр на месте");
        }
        else {
            Headdress.onHead = true;
            System.out.println("Цилиндр надет на голову");
        }
    }


    public Arms(int health){
        this.health = health;
    }
}
