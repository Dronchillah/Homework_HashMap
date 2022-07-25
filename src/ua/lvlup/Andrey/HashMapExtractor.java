package ua.lvlup.Andrey;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapExtractor {


    public static HashMap<Integer, Object> extractToMap(String fileName){
        HashMap<Integer, Object> map = new HashMap<>();

        try(Scanner scan = new Scanner(Paths.get(fileName))){
            while (scan.hasNext()){
                String str = scan.nextLine();
                String[] arr = str.split("\\s");
                map.put(Integer.parseInt(arr[0]), arr[1]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return map;
    }
}
