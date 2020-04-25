public class Product {
    private int productNumber;
    private String productName;
    private int productUnits;
    private int productPrice;
    private Vendor vendor;

    public Product(int productNumber, String productName, int productUnits, int productPrice, Vendor vendor){
        this.productNumber = productNumber;
        this.productName = productName;
        this.productUnits = productUnits;
        this.productPrice = productPrice;
        this.vendor = vendor;
    }
    public Product(){

    }

    public int getProductNumber() { return productNumber; }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductUnits() {
        return productUnits;
    }

    public void setProductUnits(int productUnits) {
        this.productUnits = productUnits;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public Vendor getVendor() { return vendor; }

    public void setVendor(Vendor vendor) { this.vendor = vendor; }

    public String toString(){
        return "Product number: " + productNumber + ", Product name: " + productName +
                ", Product units: " + productUnits + ", Product price: " + productPrice +
                ", Inventory value: " + InventoryValue(productUnits, productPrice) +
                ", " + vendor;
    }

    public String InventoryValue(Integer pUnits, Integer pPrice){
        return Integer.toString(pUnits * pPrice);
    }
}



