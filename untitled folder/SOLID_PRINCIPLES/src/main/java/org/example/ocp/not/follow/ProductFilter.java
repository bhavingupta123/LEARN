package org.example.ocp.not.follow;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    // we have 1 filter, and if need to add another filter this class needs to modified
    // Hence it doesn't follow OCP
    public Stream<Product> filterByColor(List<Product> productList, Color color){
        return productList.stream().filter(p -> p.color==color);
    }

    public Stream<Product> filterBySize(List<Product> productList, Size size){
        return productList.stream().filter(p -> p.size==size);
    }

    public Stream<Product> filterBySizeAndColor(List<Product> productList, Size size, Color color){
        return productList.stream().filter(p -> p.size==size && p.color == color);
    }
}
