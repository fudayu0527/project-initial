package com.fudayu.project.java8NewProperties;

/**
 * Created by wangwenjun on 2016/10/16.
 */
@FunctionalInterface
public interface ThreeFunction<T, U, K, R> {

    R apply(T t, U u, K k);

}
