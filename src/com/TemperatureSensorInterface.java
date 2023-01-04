package com;

public interface TemperatureSensorInterface  extends  java.rmi.Remote{
    void augmenterTemp(double tempVal) throws java.rmi.RemoteException;
    void diminuerTemp(double tempVal) throws java.rmi.RemoteException;
    double lireTemp() throws java.rmi.RemoteException;
}
