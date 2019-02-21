package org.child.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Walle
 * @since 2019-02-21
 */
public class UTest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String a;

    private String b;


    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "UTest{" +
        "a=" + a +
        ", b=" + b +
        "}";
    }
}
