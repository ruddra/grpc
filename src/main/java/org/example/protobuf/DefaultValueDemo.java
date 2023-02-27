package org.example.protobuf;

import org.example.models.Person;

public class DefaultValueDemo {

    public static void main(String[] args) {
        Person person = Person.newBuilder().build();
        System.out.println(
                "-->" + person.toString()
        );
    }

}
