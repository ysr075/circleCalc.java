package com.company;

import java.util.Scanner;

class circumference {
    public static void staticMethod() {
        Scanner input = new Scanner(System.in);
        float pi = 3.14159265359f;
        Integer r;
        System.out.print("\nWhat is your ray in cm: ");
        r = input.nextInt();
        float totalCircumference = (2 * pi * r);
        System.out.println("\n" + totalCircumference);
    }
}

class surface {
    public static void staticMethod() {
        Scanner input = new Scanner(System.in);
        float pi = 3.14159265359f;
        Integer r;
        System.out.print("\nWhat is your ray in cm: ");
        r = input.nextInt();
        float totalSurface = (r * r * pi);
        System.out.print("\n" + totalSurface);
    }
}

class exit {
    public static void staticMethod() {
        System.exit(1);
    }
}

public class mainProgram {
    public static void main(String []args) {
        while(true) {
            Scanner input = new Scanner(System.in);
            Integer question;
            System.out.print("\nDo you want to calculate 1.(circumference) or 2.(surface) of a circle: ");
            question = input.nextInt();
            if (question.equals(1)) {
                circumference.staticMethod();
            } else if (question.equals(2)) {
                surface.staticMethod();
            } else {
                exit.staticMethod();
            }
        }
    }
}
