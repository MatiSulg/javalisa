public class Banana {
    private float weight; //kg
    private int ripeness; //1-10
    private String variety;
    private float basePrice; // per kg

    public Banana(float weight, int ripeness, String variety, float basePrice){
        this.weight = weight;
        this.ripeness = ripeness;
        this.variety = variety;
        this.basePrice = basePrice;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getRipeness() {
        return ripeness;
    }

    public void setRipeness(int ripeness) {
        this.ripeness = ripeness;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public String toString(){
        return "Banana weight(kg): " + weight + ", Banana ripeness(1-10): " + ripeness +
                ", Banana variety: " + variety + ", Banana price per kg: " + basePrice +
                 ", Shelf life(days): " + findShelfLife() + ", Banana price: "
                + String.format("%.2f",price());
    }

    private Integer findShelfLife(){
        return 10 - ripeness;
    }

    protected float price(){
        float p;
        if(weight > 0.2){
            p = (float)(weight * basePrice * 0.95);
        } else {
            p = (weight * basePrice);
        }
        return p;
    }
}
