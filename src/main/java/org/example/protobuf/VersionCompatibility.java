package org.example.protobuf;

import org.example.models.Television;
import org.example.models.Type;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VersionCompatibility {
    public static void main(String[] args) throws IOException {

//        Television tv = Television.newBuilder()
//                .setModel(2021)
//                .setBrand("Sony")
//                .setType(Type.OLED)
//                .build();

        Path pathV1 = Paths.get("tv-v1");
//        Path pathV2 = Paths.get("tv-v2");
//        Files.write(pathV2, tv.toByteArray());

        byte[] bytess = Files.readAllBytes(pathV1);

        System.out.println(
                Television.parseFrom(bytess)
        );
    }
}
