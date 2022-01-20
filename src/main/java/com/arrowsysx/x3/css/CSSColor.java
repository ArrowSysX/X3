package com.arrowsysx.x3.css;

public class CSSColor {
    private final int r;
    private final int g;
    private final int b;

    /**
     * Constructs an RGB CSS color.
     * @param r Red
     * @param g Green
     * @param b Blue
     */
    public CSSColor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public String toString() {
        return "rgb("+r+","+g+","+b+");";
    }
}
