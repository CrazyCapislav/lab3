package Objects;

import ObjectProperties.VisibleReductions;

public class Fog implements VisibleReductions {
    @Override
    public void VisibleReduce() {
        System.out.println("Опускается туман");
        Sky.vision = "Ничего не видно";

        }
}
