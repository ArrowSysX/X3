package com.arrowsysx.x3;

import com.arrowsysx.x3.css.CSSColor;
import com.arrowsysx.x3.css.Calculate;
import com.arrowsysx.x3.css.ColorBase;

import java.awt.*;
import java.io.*;
import java.time.Instant;

public class Utils {
    public static void compile() throws IOException {
        File f = new File(System.getProperty("user.home") + "/X3Dist/x3-v" + Compile.cssVersion + ".css");
        File d = new File(System.getProperty("user.home") + "/X3Dist/");
        if(!f.exists()) {  d.mkdirs(); f.createNewFile(); }
        FileWriter writer = new FileWriter(f);
        writer.append("/**\n");
        writer.append(" * X3CSS version " + Compile.cssVersion + " by SystemX\n");
        writer.append(" * Compiled using Java version " + System.getProperty("java.runtime.version") + " with OS " + System.getProperty("os.name") + "\n");
        writer.append(" * at " + Instant.now().toString() + ".\n\n");
        writer.append(" * Thanks for using this open-source software!\n");
        writer.append(" */\n\n\n");
        System.out.println("\n\nWrote comments successfully.\n");
        for(int j = 0; j < ColorBase.ALL_BASES.length; j++) {
            Color c = ColorBase.ALL_BASES[j];
            CSSColor css;
            for(int i = 0; i < 9; i++) {
                System.out.println(Calculate.calcShade(c, i + 1));
                css = Calculate.calcShade(c, i + 1);
                String name;
                boolean err = false;
                int q = (i + 1) * 100;
                if(c == ColorBase.RED_BASE) name = "red";
                else if(c == ColorBase.ORANGE_BASE) name = "orange";
                else if(c == ColorBase.YELLOW_BASE) name = "yellow";
                else if(c == ColorBase.GREEN_BASE) name = "green";
                else if(c == ColorBase.BLUE_BASE) name = "blue";
                else if(c == ColorBase.CYAN_BASE) name = "cyan";
                else if(c == ColorBase.PURPLE_BASE) name = "purple";
                else if(c == ColorBase.WHITE_BASE) name = "white";
                else if(c == ColorBase.BLACK_BASE) name = "black";
                else if(c == ColorBase.GRAY_BASE) name = "gray";
                else { name = "comp-err-c1\\:IncorrectColorBase"; err = true; }
                writer.append(".text-" + name + "-" + q + " {\n");
                writer.append("\tcolor: " + css + "\n");
                writer.append("}\n");
                if(err) System.out.println("A compiler error occurred: ID c1 - IncorrectColorBase. This error is CRITICAL, so if you see this,\n something is really wrong with the codebase. Please make a pull request/issue\n on GitHub (https://github.com/ArrowSysX/X3).");
            }
            System.out.println("\n\n---\n\n");
        }
        writer.close();
    }
}
