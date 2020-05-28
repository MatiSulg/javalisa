public class ProdWithLoc {
    Product product;
    String loc;

    public ProdWithLoc(Product product, String loc) {
        this.product = product;
        this.loc = loc;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
