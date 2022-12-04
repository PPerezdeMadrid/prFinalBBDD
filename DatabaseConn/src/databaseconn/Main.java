package databaseconn;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ppere
 */

public class Main {
    public static void main(String args[]){
    
    Tiposbbdd bbdd = new Tiposbbdd();
        bbdd.getTiposZombies("zombieEspañol");
    System.out.println("\n===========================\n");
        bbdd.getTipoEnfermedad("Gripe");System.out.println("\n===========================\n");
    System.out.println("\n===========================\n");
        bbdd.getTodasEnfermedades();
     System.out.println("\n===========================\n");
        bbdd.getLetalidad("pistola");
     System.out.println("\n===========================\n");
      boolean IniciarSesion;
        IniciarSesion = bbdd.IniciarSesion("54479760M","Paloma","Femenino", 19);
       if( IniciarSesion == true) System.out.println("ACCESO PERMITIDO");
    }
    

 }

