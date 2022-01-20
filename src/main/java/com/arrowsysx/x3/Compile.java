package com.arrowsysx.x3;

import java.util.Scanner;

public class Compile {
    public static final String compVersion = "JRE-1.0.0";
    public static final String cssVersion  =     "1.0.0";

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to the X3 Compiler version " + compVersion + "!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Compile? (Y/n): ");
        String inp = scanner.nextLine().toLowerCase();

        switch(inp.toCharArray()[0]) {
            case 'y': compile();
            case 'n': System.exit(0);
            default: System.exit(0);
        }
    }

    private static void compile() throws InterruptedException {
        Thread.sleep(950);
        System.out.println("\n---\n\nCompiling to ./dist/x3-v" + cssVersion + ".css...");
        Utils.compile();
    }
}
