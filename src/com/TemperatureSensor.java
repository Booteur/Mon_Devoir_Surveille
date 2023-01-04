package com;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TemperatureSensor extends UnicastRemoteObject implements TemperatureSensorInterface {
    double t ;
    public TemperatureSensor(double t) throws java.rmi.RemoteException{
        super();
        this.t=t;
    }

    @Override
    public void augmenterTemp(double tempVal) throws java.rmi.RemoteException {
            t=t+tempVal;

    }

    @Override
    public void diminuerTemp(double tempVal) throws java.rmi.RemoteException {
            t=t-tempVal;
    }
    @Override
    public double lireTemp() throws java.rmi.RemoteException {
        return t;
    }
}
