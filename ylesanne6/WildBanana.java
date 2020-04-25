public class WildBanana extends Banana{
    private int curvature; //0-45

    public WildBanana(float weight, int ripeness, String variety, float basePrice, int curvature){
        super(weight,ripeness,variety,basePrice);
        this.curvature = curvature;
    }

    public int getCurvature() {
        return curvature;
    }

    public void setCurvature(int curvature) {
        this.curvature = curvature;
    }
    public String toString(){
        return "Banana weight(kg): " + getWeight() + ", Banana ripeness(1-10): " + getRipeness() +
                ", Banana variety: " + getVariety() + ", Banana price per kg: " + getBasePrice() +
                ", Banana curvature: " + curvature + ", Shelf life(days): " + findShelfLife() +
                ", Banana price: " + String.format("%.2f", price());
    }
    private Integer findShelfLife(){
        return (10 - getRipeness()) / 2;
    }
}
