import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Vendor v = new Vendor("Sharry", "Maple street 25",
                "Donald Someone", "58992535");

        Product monitorid = new Product(241152, "Monitor",
                20, 239, v);
        Product eLugerid = new Product(252222, "E-Luger",
                50, 129, v);
        Product arvutiKõlarid = new Product(264343, "Arvutikõlarid",
                25, 59, v);
        Product klaviatuurid = new Product(264344, "Klaviatuurid",
                50, 49, v);
        Product hiired = new Product(207585, "Hiired",
                40, 29, v);
        Product hiirematid = new Product(286536, "Hiirematid",
                30, 9, v);

        Scanner userInput = new Scanner(System.in);
        Product[] products = {};

        System.out.println("Would you like to add product?(y/n)");
        String answer = userInput.next();

        while(answer.equals("y")){
            System.out.println("Enter product number");
            int pNumber = Integer.parseInt(userInput.next());
            System.out.println("Enter product name");
            String pName = userInput.next();
            System.out.println("Enter product units");
            int pUnits = Integer.parseInt(userInput.next());
            System.out.println("Enter product price");
            int pPrice = Integer.parseInt(userInput.next());

            System.out.println("Enter vendor name");
            String vName = userInput.next();
            System.out.println("Enter vendor address");
            String vAddress = userInput.next();
            System.out.println("Enter vendor representative");
            String vRep = userInput.next();
            System.out.println("Enter vendor number");
            String vNumber = userInput.next();

            Vendor vendor = new Vendor(vName, vAddress, vRep, vNumber);

            products = appendValue(products,new Product(pNumber, pName, pUnits, pPrice, vendor));

            System.out.println("Would you like to add more products?(y/n)");
            answer = userInput.next();
        }

        for(Product p : products) System.out.println(p);


    }
    private static Product[] appendValue(Product[] products, Product newProduct) {

        ArrayList<Product> temp = new ArrayList<Product>(Arrays.asList(products));
        temp.add(newProduct);
        return temp.toArray(Product[]::new);

    }
}
