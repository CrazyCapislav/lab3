package Limbs;

public class Head extends Limb {
    public Head(int health){
        this.health = health;
    }
    public void createIdea(){
        class Idea{
            public String ideaType = "Хорошая";
            Idea(){
                System.out.println("Появилась "+ ideaType + " мысль.");
            }

        }
        Idea idea = new Idea();
    }

}
