package com;

import java.io.IOException;
import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
      /* if(args.length != 2){
            System.out.println("Usage : java Client <nombre><operation>");
            System.exit(1);
        }
        // operation = 1: augmenter, 2: diminuer
        double valeur = Double.parseDouble(args[0]);
        int operation = Integer.parseInt(args[1]);*/
        try {
            TemperatureSensorInterface stub = (TemperatureSensorInterface) Naming.lookup("rmi://localhost:1900/sensorCourant");
            System.out.println("Que voulez faire ");
            while (true) {
                System.out.println("Appuyez sur 1 pour augmenter ");
                System.out.println("ou");
                System.out.println("Appuyez sur 2 pour diminuer");
                System.out.println("ou");
                System.out.println("Appuyez sur 3 pour quitter");
                Scanner clavier = new Scanner(System.in);
                int operation = clavier.nextInt();


                if (operation == 1) {
                    System.out.println("Veuillez saisir une temperature");
                    Scanner temp= new Scanner(System.in);
                    double tempVal=temp.nextDouble();
                    stub.augmenterTemp(tempVal);
                    System.out.println("Votre temperature a augmenter de "+" "+stub.lireTemp()+" "+"degres");
                }else if (operation == 2) {
                    System.out.println("Veuillez saisir une temperature");
                    Scanner temp= new Scanner(System.in);
                    double tempVal =temp.nextDouble();
                    stub.diminuerTemp(tempVal);
                    System.out.println("Votre temperature a diminuer de "+" "+stub.lireTemp()+" "+"degres");
                } else if (operation==3) {
                break;
            } else {
                System.out.println("Merci d'avoir utilisé notre application");
            }

                //lire la temperature courante
                System.out.println("la temperature courante est de "+" "+stub.lireTemp()+" "+"degres");

            }
        }catch (Exception e) {
                System.out.println("Erreur d'accès à un objet distant");
                System.out.println(e.toString());

        }
    }
}


