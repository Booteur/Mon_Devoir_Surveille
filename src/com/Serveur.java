package com;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
public class Serveur {
    public static void main(String[] args) {
        try {
        LocateRegistry.createRegistry(1900);
        TemperatureSensor temp = new TemperatureSensor(0);
            Naming.rebind("rmi://localhost:1900/sensorCourant",temp);
            System.out.println("Bienvenue dans notre application de temperature");

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
