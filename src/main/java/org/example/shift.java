package org.example;

import java.util.HashMap;
import java.util.Map;

public class shift {
    public static void main(String[] args){
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("免許持ち","鈴木");
        stringMap.put("無免許","佐藤");
        stringMap.put("仮免許","影目");

        System.out.println(stringMap.get("免許持ち"));
    }
}
