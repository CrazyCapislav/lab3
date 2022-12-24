package Objects;

import ObjectProperties.HugReturn;

public class Sky implements HugReturn {
    public static String vision = "Все прекрасно видно!";
    public void hugReturn() {
        Skuperfild.confuse = true;
        System.out.println("Скуперфилд потерял землю под ногами");

    }
    public static class Sun{
        public void shine(){
            System.out.println("Солнышко светит");
        }
    }
}
