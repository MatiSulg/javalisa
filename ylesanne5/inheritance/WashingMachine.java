public class WashingMachine extends Product{
    private String manufacturer;


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    private String restockFee(Integer pUnits, Integer pPrice){
        return Integer.toString(pUnits * pPrice * 5 / 100);
    }

    public String toString(){
        return super.toString() + ", Manufacturer: " + manufacturer +
                ", Restock fee: " + restockFee(getProductUnits(), getProductPrice());
    }
}