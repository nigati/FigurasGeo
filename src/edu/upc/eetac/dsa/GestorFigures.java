package edu.upc.eetac.dsa;


import java.lang.*;
import java.util.*;

public class GestorFigures {

    public static double suma (Figura[] figures) {
        double res = 0;

        for (Figura f : figures) {
            res += f.area();
        }

        return res;
    }
    public static void sort(Figura[] figures) {
        Arrays.sort(figures);
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(20, 5);
        Cercle c1 = new Cercle(3);
        Rectangle r1 = new Rectangle(5 , 8);
        Quadrat q1 = new Quadrat(2);
        Figura [] figures = new Figura[4];
        figures[0] = q1;
        figures[1] = r1;
        figures[2] = t1;
        figures[3] = c1;

        System.out.println("Suma de las àrees: " + GestorFigures.suma(figures));
        System.out.println("Llista de Figures:");

        for (Figura f : figures) {
            System.out.println(f.area());
        }

        GestorFigures.sort(figures);
        System.out.println("Llista de figures amb ordre ascendent):");

        for (Figura f : figures) {
            System.out.println(f.area());
        }
    }
}
