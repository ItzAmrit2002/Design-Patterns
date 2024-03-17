package FactroryPattern.Wrong;

import java.util.Scanner;

class Pizza {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        Pizza pizza = null;

        String value = scan.next();

        if (value.equals("CHESS")) {

            // pizza = new CHESSEPIZZA();
        }
        else{

            // pizza = new LoadedPIZZA();
    }
}
}