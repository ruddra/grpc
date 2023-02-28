package org.example.protobuf;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.Int32Value;
import com.google.protobuf.InvalidProtocolBufferException;
import org.example.json.JPerson;
import org.example.models.Person;

import java.io.IOException;
import java.nio.file.Files;

public class PerformanceTest {
    public static void main(String[] args) throws IOException {
        JPerson person = new JPerson();
        person.setAge(4);
        person.setName("Buti");

        ObjectMapper mapper = new ObjectMapper();

        Person buti = Person.newBuilder()
                .setName("Buti")
                .setAge(Int32Value.newBuilder().setValue(4).build())
                .build();



        Runnable runnable1 = () -> {
            byte[] bytes = new byte[0];
            try {
                bytes = mapper.writeValueAsBytes(person);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
            try {
                JPerson person1 = mapper.readValue(bytes, JPerson.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable runnable2 = () -> {

            byte[] bytes1 = buti.toByteArray();
            try {
                Person buti3 = Person.parseFrom(bytes1);
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }
        };

        for (int i = 0; i < 5; i++) {
            System.out.println(
                    "Iteration " + i
            );
            runPerformanceTest(runnable1, "json");
            runPerformanceTest(runnable2, "proto");
        }


    }

    private static void runPerformanceTest(Runnable runnable, String method){
        long time1 = System.currentTimeMillis();
        for(int i = 0; i<10_000_000;i++){
            runnable.run();
        }
        long time2 = System.currentTimeMillis();
        System.out.println(
                (time2 - time1) + " ms > " + method
        );

    }
}
