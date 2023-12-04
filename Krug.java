package proekt_5;

import java.util.Scanner;

public class Krug {

public static void main(String[] args) {
double radius, pi, perimetar, plostina;
Scanner tastatura = new Scanner (System.in);
System.out.println("Programata presmetuva perimetar i plostina na krug");
System.out.println("Vnesete radius na krug");
radius = tastatura.nextDouble();
System.out.println("Vnesete vrednost na pi");
pi = tastatura.nextDouble();
perimetar = 2*radius*pi;
plostina = radius*radius*pi;
System.out.println();
System.out.println("Perimetarot e: " + perimetar);
		// System.out.println(perimetar);
System.out.println("Plostinata e: " + plostina);
       // System.out.println(plostina);

	}

}
