import com.itgen.lesson.Purchase;
import com.itgen.lesson.PurchaseFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("in.text"));
        Purchase[] purchases = new Purchase[6];
        Purchase max = null;

        for (int a = 0; a < purchases.length; a++) {
            Purchase purchaseFromFactory = PurchaseFactory.getPurchaseFromFactory(scanner);
            purchases[a] = purchaseFromFactory;
            System.out.println(purchases[a]);

            double price = purchases[a].finalPrice();
            System.out.println(price);

            System.out.println();

            if (max == null) {
                max = purchases[a];
            }
            if (purchases[a].finalPrice() > max.finalPrice()) {
                max = purchases[a];
            }

            System.out.println(max + " " + max.finalPrice());

        }

        System.out.println();

        Purchase base = purchases[0];
        for(int i=1; i< purchases.length; i++){
            if(base.equals(purchases[i])){
                System.out.println(base+" and "+purchases[i]+" are equal");
                break;
            }
        }

        System.out.println();

        for (Purchase purchase : purchases) {
            System.out.println(purchase);

        }




    }
}