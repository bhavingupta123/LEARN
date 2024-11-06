package org.example.ocp.follow;

public interface Specification<T> {

    boolean isSatisfied(T item);
}
