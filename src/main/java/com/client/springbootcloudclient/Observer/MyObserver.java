package com.client.springbootcloudclient.Observer;

import java.util.Observable;
import java.util.Observer;

public class MyObserver {
    public static void main(String[] args) {
        Observer observer = (o, arg) -> System.out.println(arg);
        MyOb observable = new MyOb();

        observable.addObserver(observer);
        observable.setChanged();
        observable.notifyObservers("hello world");
    }
    public static class  MyOb extends  Observable{


        @Override
        public  synchronized void setChanged() {
           super.setChanged();
        }
    }
}
