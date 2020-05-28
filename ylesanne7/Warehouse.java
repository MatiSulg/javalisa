import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    List<ProdWithLoc> prodWithLocs = new ArrayList<>();

    public void receive(Product prod, String loc){
        prodWithLocs.add(new ProdWithLoc(prod,loc));
    }

    public String dispatch(Product prod){
        for(ProdWithLoc pl : prodWithLocs){
            if(pl.getProduct().getName().equals(prod.getName())){
                prodWithLocs.remove(pl);
                return pl.getLoc();
            }
        }
        return null;
    }

    public Integer getItemCount(Product prod){
        Integer count = 0;
        for(ProdWithLoc pl : prodWithLocs){
            if(pl.getProduct().getName().equals(prod.getName()))
                count++;
        }
        return count;
    }
}
