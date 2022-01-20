package com.arrowsysx.x3.css;

import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class Calculate {
    public static @NotNull CSSColor calcShade(Color base, int newShade) {
//        return switch(newShade) {
//            case 1 -> new CSSColor(base.getHue(), base.getSaturation() - 20, base.getLightness());
//            case 2 -> new CSSColor(base.getHue(), base.getSaturation() - 35, base.getLightness());
//            case 3 -> new CSSColor(base.getHue(), base.getSaturation() - 50, base.getLightness());
//            case 4 -> new CSSColor(base.getHue(), base.getSaturation() - 65, base.getLightness());
//            case 5 -> new CSSColor(base.getHue(), base.getSaturation() - 80, base.getLightness());
//            case 6 -> new CSSColor(base.getHue(), base.getSaturation() - 95, base.getLightness());
//            case 7 -> new CSSColor(base.getHue(), base.getSaturation() -110, base.getLightness());
//            case 8 -> new CSSColor(base.getHue(), base.getSaturation() -125, base.getLightness());
//            case 9 -> new CSSColor(base.getHue(), base.getSaturation() -140, base.getLightness());
//            default -> throw new IllegalArgumentException("Unknown shade " + newShade);
//        };
        CSSColor color = new CSSColor(0, 0, 0);
        Color darker = base;
        for(int i = 1; i <= newShade; i++) {
            darker = darker.darker();
            color = new CSSColor(darker.getRed(), darker.getGreen(), darker.getBlue());
        }
        return color;
    }
}
