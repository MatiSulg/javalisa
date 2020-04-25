import java.util.ArrayList;

public class TestClass {

    public static void main(String[] args) {
        ArrayList<Object> bananas = new ArrayList<Object>();

        bananas.add(new Banana((float)0.150, 4, "Place 1", (float)2));
        bananas.add(new WildBanana((float)0.158, 2, "Place 5", (float)3, 15));
        bananas.add(new Banana((float)0.250, 7, "Place 1", (float)1));
        bananas.add(new WildBanana((float)0.110, 9, "Place 4", (float) 2.5, 33));
        bananas.add(new Banana((float)0.190, 2, "Place 3", (float)2));
        bananas.add(new WildBanana((float)0.096, 8, "Place 7", (float)3.5,42));
        bananas.add(new WildBanana((float)0.053, 1, "Place 5", (float)9.9,13));
        bananas.add(new WildBanana((float)0.253, 6, "Place 5", (float)1.4,25));
        bananas.add(new WildBanana((float)0.200, 2, "Place 8", (float)1,34));
        bananas.add(new WildBanana((float)0.196, 4, "Place 4", (float)3.6, 5));

        for(Object banana : bananas) System.out.println(banana);
    }
}
