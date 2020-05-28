import java.util.Objects;

public class Product {
    private String name;
    private Integer size;

    public Product(String name, Integer size){
        this.name = name;
        this.size = size;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(size, product.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }
}
