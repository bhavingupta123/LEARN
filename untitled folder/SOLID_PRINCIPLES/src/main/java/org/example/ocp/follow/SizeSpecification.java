package org.example.ocp.follow;

import org.example.ocp.not.follow.Product;
import org.example.ocp.not.follow.Size;

public class SizeSpecification implements Specification<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size == size;
    }
}
