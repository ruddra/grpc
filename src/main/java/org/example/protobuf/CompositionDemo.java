package org.example.protobuf;

import com.google.protobuf.Int32Value;
import org.example.models.Address;
import org.example.models.Car;
import org.example.models.Person;

import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {
    public static void main(String[] args) {
        Address address = Address.newBuilder()
                .setPostbox(5612)
                .setStreet("Pastoor Peterstraat")
                .setCity("Eindhoven")
                .build();

        Car car1 = Car.newBuilder()
                .setMake("Honda")
                .setModel("accord")
                .setYear(2020)
                .build();
        Car car2 = Car.newBuilder()
                .setMake("Honda")
                .setModel("accord")
                .setYear(2005)
                .build();

        List<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);

        Person buti = Person.newBuilder()
                .setName("Buti")
                .setAge(Int32Value.newBuilder().setValue(4).build())
                .setAddress(address)
                .addAllCar(cars)
                .build();

        System.out.println(
                buti.toString()
        );


    }
}
