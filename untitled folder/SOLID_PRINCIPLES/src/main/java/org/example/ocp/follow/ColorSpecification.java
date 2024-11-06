package org.example.ocp.follow;

import org.example.ocp.not.follow.Color;
import org.example.ocp.not.follow.Product;

public class ColorSpecification implements Specification<Product> {

    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.color == color;
    }
}
