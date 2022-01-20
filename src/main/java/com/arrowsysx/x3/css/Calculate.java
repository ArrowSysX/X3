package com.arrowsysx.x3.css;

import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class Calculate {
    public static @NotNull CSSColor calcShade(Color base, int newShade) {
        CSSColor color = new CSSColor(0, 0, 0);
        Color darker = base;
        for(int i = 1; i <= newShade; i++) {
            if(newShade == 1) {
                color = new CSSColor(base.getRed(), base.getGreen(), base.getBlue());
                break;
            }
            // funny code :)
            darker = darker.darker();
            color = new CSSColor(darker.getRed(), darker.getGreen(), darker.getBlue());
        }
        return color;
    }
}
