package org.example.protobuf;

import com.google.protobuf.Int32Value;
import org.example.models.Person;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {

    public static void main(String[] args) throws IOException {
        Person buti = Person.newBuilder()
                .setName("Buti")
                .setAge(Int32Value.newBuilder().setValue(4).build())
                .build();
        Person buti2 = Person.newBuilder()
                .setName("Buti")
                .setAge(Int32Value.newBuilder().setValue(4).build())
                .build();
        System.out.println(
                buti.equals(buti2)
        );

        Path path = Paths.get("buti.ser");
//        try {
//            Path write = Files.write(path, buti.toByteArray());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        byte[] bytes = Files.readAllBytes(path);
        Person buti3 = Person.parseFrom(bytes);

        System.out.println(
                buti3.toString()
        );
    }
}
