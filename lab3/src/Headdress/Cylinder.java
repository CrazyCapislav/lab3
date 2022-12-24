package Headdress;

public class Cylinder extends Headdress {
    private String position;

    public String getPurity() {
        return purity;
    }

    public void setPurity(String purity) {
        this.purity = purity;
    }

    private String purity = "Чистый";

    public Cylinder(boolean onHead) {
        super(onHead);

    }
    public java.lang.String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
