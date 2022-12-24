import Exeptions.HealthException;
import Exeptions.WishException;
import Objects.Fog;
import Objects.Skuperfild;
import Objects.Sky;
import Other.Wish;

public class Main {
    public static void main(String[] args) throws WishException {

        Skuperfild Skuperfild = new Skuperfild();
        Sky sky = new Sky();
        Sky.Sun sun = new Sky.Sun();
        Fog fog = new Fog();
        System.out.println(Skuperfild.cylinder.getClass());
        Skuperfild.setHaveWish(true);
        Wish mechtaSkupera = new Wish("Sky", "Hug");
        Wish nujnayaMechta = new Wish("Sky", "Hug");
        sun.shine();
        System.out.println(mechtaSkupera.toString());
        if (mechtaSkupera.equals(nujnayaMechta)){
            Skuperfild.arms.moveArms(" Вверх");
            sky.hugReturn();
            if (Objects.Skuperfild.confuse){
                Skuperfild.fall();
                if (Skuperfild.ribs.health <= 0 || Skuperfild.arms.health <= 0 || Skuperfild.head.health <= 0){
                    throw new HealthException("Скуперфилду требуется помощь");
                }
                else {
                    Skuperfild.checkHealth();
                    Skuperfild.findHeaddress();
                    Skuperfild.arms.reposeHeaddress();
                    Skuperfild.clearCylinder();
                    fog.VisibleReduce();
                    Skuperfild.lookAround();
                    Skuperfild AbstractSkuperfild = new Skuperfild(){
                        public void fall(){
                            System.out.println("Кажется Скуперфилд мог пораниться серьёзнее после падения");
                        }
                    };
                    AbstractSkuperfild.fall();
                    Skuperfild.head.createIdea();
                }
            }
        }
        else {
            throw new WishException("Такие желания недопустимы");
        }
    }

}