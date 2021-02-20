package com.company;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner teclado= new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();
        int login=0;
        int pass=0;
        int intentos=1;
        int maximo=3;
        int mp;
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);



        while((login!=1809)||(pass!=1234)&& (intentos<maximo)){

            System.out.print("introduzca un login: ");
            login=teclado.nextInt();
            System.out.print("Introduzca su pass:");
            pass=teclado.nextInt();

            if(pass==1234){
                System.out.println ("Menu Principal: ");
                System.out.println ("1.Cambiar la contraseña");
                System.out.println ("2.Llenar la información de su perfil (Dirección, número de teléfono, DNI, Nacionalidad)");
                System.out.println ("3.Pedido: Seleccione un (1) artículo el cual será enviado a su domicilio");
                System.out.println ("4.Salir");
                System.out.println ("Opcion elegida: ");
                mp=teclado.nextInt();

                switch (mp) {
                    case 1:
                        System.out.println(" Por favor ingrese su nueva clave");
                        pass = teclado.nextInt();
                        System.out.println("Su nueva clave es "+pass);
                        break;
                    case 2:
                        System.out.println ("Llenar la información de su perfil (Dirección, número de teléfono, DNI, Nacionalidad");
                        String direccion = teclado.nextLine();
                        System.out.println("Introduzca su Dirección");
                        String dirección = teclado.nextLine();
                        System.out.println("Introduzca su numero de telefono");
                        String telefono = teclado.nextLine();
                        System.out.println("Introduzca su DNI");
                        String dni= teclado.nextLine();
                        System.out.println("Introduzca su nacionalidad");
                        String nacionalidad= teclado.nextLine();
                        break;
                    case 3:
                        System.out.println ("Pedido: Seleccione un (1) artículo el cual será enviado a su domicilio");
                        break;
                    case 4:
                        System.out.print ("Su orden fue completada con éxito, a la hora tal ");
                        System.out.print (hora + ":" + minutos + ":" + segundos);
                        System.out.println (" - La misma será enviada a su domicilio");
                        break;

                    default:
                        System.out.println("Ingrese un valor valido");
                        break;
                }

            }
            if(intentos==3){
                System.out.println("acceso denegado..");
                intentos=intentos;

            }


            intentos++;




        }


    }
