package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int dato1, dato2, res=0;
        int op;

        Scanner Scan = new Scanner(System. in);

        System.out.println ("1.Suma");
        System.out.println ("2.Resta");
        System.out.println ("3.Mult");
        System.out.println ("4.Div");

        System.out.println("Ingrese el numero de la operacion");
        op=Scan.nextInt();

        System.out.println("Ingrese el dato 1");
        dato1 = Scan.nextInt();
        System.out.println("Ingrese el dato 2");
        dato2 = Scan.nextInt();

        switch (op) {
            case 1:
                res = dato1 + dato2;
                break;
            case 2:
                res = dato1 - dato2;
                break;
            case 3:
                res = dato1 * dato2;
                break;
            case 4:
                res = dato1 / dato2;
                break;

            default:
                System.out.println("Ingrese un valor valido");
                break;
        }

        System.out.println("El resultado es: " + res);
    }
}

