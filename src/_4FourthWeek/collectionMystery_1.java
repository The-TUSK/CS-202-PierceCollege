package _4FourthWeek;

import java.util.*;
import java.util.Map.Entry;

public class collectionMystery_1 {
    public static void collectionMystery1 (HashMap<String, String> map) {
        HashMap<String, String> result = new HashMap<>();
        for (String k : map.keySet()) {
            String v = map.get(k);
            if (k.charAt(0) <= v.charAt(0)) {
                result.put(k, v);
            }
            else {
                result.put(v, k);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("skate", "board");
        map.put("drive", "car");
        map.put("program", "computer");
        map.put("play", "computer");
        //map.put("four", "quatre");
        collectionMystery1(map);
    }
}
