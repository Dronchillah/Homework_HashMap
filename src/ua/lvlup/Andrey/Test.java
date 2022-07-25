package ua.lvlup.Andrey;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, Object> map = HashMapExtractor.extractToMap("keys.txt");
        System.out.println(map);
    }
}
