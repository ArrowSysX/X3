package com.arrowsysx.x3;

import com.arrowsysx.x3.css.Calculate;
import com.arrowsysx.x3.css.ColorBase;

public class Utils {
    public static void compile() {
        for(int i = 0; i < 9; i++) {
            System.out.println(Calculate.calcShade(ColorBase.RED_BASE, i + 1));
        }
    }
}
