package com.arrowsysx.x3.css;

import java.awt.*;

/**
 * Represents bases for colors (their {@link Shade#SHADE_100} or brightest version.)
 */
public class ColorBase {
    public static final Color RED_BASE = new Color(255, 21, 0);
    public static final Color ORANGE_BASE = new Color(255, 149, 0);
    public static final Color YELLOW_BASE = new Color(248, 255, 51);
    public static final Color GREEN_BASE = new Color(51, 255, 65);
    public static final Color BLUE_BASE = new Color(0, 146, 255);
    public static final Color CYAN_BASE = new Color(0, 243, 255);
    public static final Color PURPLE_BASE = new Color(150, 51, 255);
    public static final Color WHITE_BASE = new Color(255, 255, 255);
    public static final Color BLACK_BASE = new Color(0, 0, 0);
    public static final Color GRAY_BASE = new Color(173, 173, 173);

    public static final Color[] ALL_BASES = {RED_BASE, ORANGE_BASE, YELLOW_BASE, GREEN_BASE, BLUE_BASE, CYAN_BASE, PURPLE_BASE, WHITE_BASE, BLACK_BASE, GRAY_BASE};
}