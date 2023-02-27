package org.example.protobuf;

import org.example.models.BodyStyle;
import org.example.models.Car;
import org.example.models.Dealer;

public class MapDemo {
    public static void main(String[] args) {
        Car car1 = Car.newBuilder()
                .setMake("Honda")
                .setModel("accord")
                .setYear(2020)
                .setBodyStyle(BodyStyle.COUP)
                .build();
        Car car2 = Car.newBuilder()
                .setMake("Honda")
                .setModel("accord")
                .setYear(2005)
                .build();

        Dealer dealer1 = Dealer.newBuilder()
                .setName("Honda")
                .putModel(2020, car1)
                .putModel(2005, car2)
                .build();

        System.out.println(
                dealer1.toString()
        );
    }

}
