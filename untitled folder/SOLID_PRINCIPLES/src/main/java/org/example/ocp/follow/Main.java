package org.example.ocp.follow;

import org.example.ocp.not.follow.Color;
import org.example.ocp.not.follow.Product;
import org.example.ocp.not.follow.Size;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product("abc", Color.BLUE, Size.HUGE);
        Product p2 = new Product("leg", Color.BLUE, Size.SMALL);
        Product p3 = new Product("feg", Color.RED, Size.LARGE);
        Product p4 = new Product("feg", Color.BLUE, Size.LARGE);

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);

        BetterFilter betterFilter = new BetterFilter();
        betterFilter.filter(productList,new ColorSpecification(Color.BLUE)).forEach(p -> System.out.println(p.name + " " + p.size));
    }
}
