package com.company.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\gurbanaz\\Desktop\\xdmx-wrong-statuses.txt";
        StringBuilder sb = new StringBuilder();

        try(Stream<String> stream = Files.lines(Paths.get(fileName))){
            stream.forEach(
                    s -> {
                        String message = s.substring(0, s.indexOf("."));
                        String value = s.substring(s.indexOf(":") + 1, s.indexOf("=>")).trim();
                        int firstIndex = s.indexOf("\"sid\":\"");
                        String sid = s.substring(s.indexOf("\"sid\":\"") + 7, s.indexOf(",", firstIndex) - 1);
                        System.out.println(message + "\t\t\t" + value + "\t\t\t" + sid);
                        sb.append(message + "\t\t\t" + value + "\t\t\t" + sid + "\n");
                    });
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
