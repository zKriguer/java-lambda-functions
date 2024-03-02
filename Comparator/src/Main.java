import entities.Product;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();


        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));

        Comparator<Product> comp =
                Comparator.comparing(p -> p.getName().toUpperCase());

        list.sort(comp);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}